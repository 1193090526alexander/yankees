package co.gps.app.wx.data.dao.postgresql;

import static co.gps.app.crosscutting.util.text.UtilText.SPACE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.gps.app.crosscutting.util.numeric.UtilNumeric;
import co.gps.app.crosscutting.util.object.UtilObject;
import co.gps.app.crosscutting.util.text.UtilText;
import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.dao.RecordDAO;
import co.gps.app.wx.data.dao.connection.ConnectionSQL;
import co.gps.app.wx.dto.RecordDTO;

public class RecordPostgreSqlDAO extends ConnectionSQL implements RecordDAO {
	
	private RecordPostgreSqlDAO(Connection connection) {
		super(connection);
	}

	public static RecordDAO build(Connection connection) {
		return new RecordPostgreSqlDAO(connection);
	}

	@Override
	public void create(RecordDTO record) {
		String sql = "INSERT INTO historial(codigo, vehiculo, fecha, novedad) VALUES (?,?,?,?)";

		try (PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {

			preparedStatement.setInt(1, record.getCode());
			preparedStatement.setDouble(2, record.getVehicle().getRegisterCode());
			preparedStatement.setString(3, record.getNews());

			preparedStatement.executeUpdate();

		} catch (SQLException exception) {
			throw GpsException.buildTechnicalDataException("There was a problem trying to create the new IdType on PostgreSQL", exception);
		} catch (Exception exception) {
			throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to create the new IdType on PostgreSQL", exception);
		}
	}

	

	@Override
	public void delete(int code) {
String sql = "DELETE FROM historial WHERE codigo = ?";
		
		try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {
			
			preparedStatement.setInt(1, code);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException exception) {
			
			throw GpsException.buildTechnicalDataException("There was a problem trying to delete a record on PostgreSQL", exception);
			
		} catch (Exception exception) {
			
			throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to delete a record on PostgreSQL", exception);
			
		}
		
	}


	@Override
	public List<RecordDTO> find(RecordDTO record) {
		boolean setWhere = true;
		List<Object> parameters = new ArrayList<>();
		List<RecordDTO> results = new ArrayList<RecordDTO>();
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT id, name").append(SPACE);
		sb.append("FROM IdType").append(SPACE);
		
		if(!UtilObject.getUtilObject().isNull(record)) {
			
			if(UtilNumeric.getUtilNumeric().isGreaterThan(record.getCode(), 0)) {
				
				sb.append("WHERE id = ? ");
				parameters.add(record.getCode());
				setWhere = false;
				
			}
			
			if (!UtilText.isEmpty(record.getNews())) {
				sb.append(setWhere ? "WHERE " : "AND ");
				sb.append("name = ?");
				parameters.add(UtilText.trim(record.getNews()));
		}	
	}
		
	sb.append("ORDER BY name ASC");
	
	try(PreparedStatement preparedStatement = getConnection().prepareStatement(sb.toString())) {	
		
		for  (int index = 0; index < parameters.size(); index++) {
			preparedStatement.setObject(index + 1, parameters.get(index));			
		}
		
		results = executeQuery(preparedStatement);
		
	} catch (GpsException exception) {
		throw exception;
	} catch (SQLException exception) {		
		throw GpsException.buildTechnicalDataException("There was a problem trying to retrive the IdTypes on Azure SQL Server", exception);		
	} catch (Exception exception) {	
		throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to retrive the IdTypes on Azure SQL Server", exception);	
	}
	
	return results;	
	
  }
	private List<RecordDTO> executeQuery(PreparedStatement preparedStatement) {
		  
		  List<RecordDTO> results = new ArrayList<>();
		  
		  try (ResultSet resultSet = preparedStatement.executeQuery()) {
				
			} catch (SQLException exception) {
				
				throw GpsException.buildTechnicalDataException("There was a problem trying to execute the query to recovery IdType on PostgreSQL", exception);
				
			} catch (Exception exception) {
				
				throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to execute the query to recovery IdType on PostgreSQL", exception);		
			}
		  
		     return results;
		  
		  }	
	private List<RecordDTO> assembleResults(ResultSet resultSet) {
		  List<RecordDTO> results = new ArrayList<>();
		  
		  try {
		      while(resultSet.next()) {
		    	  results.add(assembleDTO(resultSet));		  
		      }
		} catch (GpsException exception) {
			throw exception;
	    } catch (SQLException exception) {
			
			throw GpsException.buildTechnicalDataException("There was a problem trying to recover the IdTypes on Azure SQL Server", exception);
			
		} catch (Exception exception) {
			
			throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to update the new IdType on Azure SQL Server", exception);		
		}
		  
		  return results;
	  }
	private RecordDTO assembleDTO(ResultSet resultSet) {
		  
		  RecordDTO dto = new RecordDTO();
		  
		try {
			  dto.setCode(resultSet.getInt("code"));
			  dto.setDate(resultSet.getDate("date"));
			  dto.setNews(resultSet.getString("news"));	  
	    } catch (SQLException exception) {
			
			throw GpsException.buildTechnicalDataException("There was a problem trying to assemble the IdTypes on Azure SQL Server", exception);
			
		} catch (Exception exception) {
			
			throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to assemble the IdType on Azure SQL Server", exception);		
		}
		
		return dto;
	}

}
