package co.gps.app.wx.data.dao.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.gps.app.crosscutting.util.numeric.UtilNumeric;
import co.gps.app.crosscutting.util.object.UtilObject;
import co.gps.app.crosscutting.util.text.UtilText;
import static co.gps.app.crosscutting.util.text.UtilText.SPACE;
import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.dao.IdTypeDAO;
import co.gps.app.wx.data.dao.connection.ConnectionSQL;
import co.gps.app.wx.dto.IdTypeDTO;

public class IdTypePostgreSqlDAO extends ConnectionSQL implements IdTypeDAO {
	
	private IdTypePostgreSqlDAO(Connection connection) {
		super(connection);
	}

	public static IdTypeDAO build(Connection connection) {
		return new IdTypePostgreSqlDAO(connection);
	}

	@Override
	public void create(IdTypeDTO idType) {
		String sql = "INSERT INTO IdType(name) VALUES (?)";

		try (PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {

			preparedStatement.setString(1, idType.getName());

			preparedStatement.executeUpdate();

		} catch (SQLException exception) {
			throw GpsException.buildTechnicalDataException("There was a problem trying to create the new IdType on PostgreSQL", exception);
		} catch (Exception exception) {
			throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to create the new IdType on PostgreSQL", exception);
		}
	}

	@Override
	public void update(IdTypeDTO idType) {
		String sql = "UPDATE IdType SET name = ? WHERE id = ?";
		
			try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {	
			
				preparedStatement.setString(1, idType.getName());
			
				preparedStatement.executeUpdate();
			
			} catch (SQLException exception) {
			
				throw GpsException.buildTechnicalDataException("There was a problem trying to update the new IdType on PostgreSQL", exception);
			
			} catch (Exception exception) {
			
				throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to update the new IdType on PostgreSQL", exception);

			}
	}

	@Override
	public void delete(int id) {
String sql = "DELETE FROM IdType WHERE id = ?";
		
		try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {
			
			preparedStatement.setInt(1, id);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException exception) {
			
			throw GpsException.buildTechnicalDataException("There was a problem trying to create the new IdType on PostgreSQL", exception);
			
		} catch (Exception exception) {
			
			throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to create the new IdType on PostgreSQL", exception);
			
		}
		
	}


	@Override
	public List<IdTypeDTO> find(IdTypeDTO idType) {
		boolean setWhere = true;
		List<Object> parameters = new ArrayList<>();
		List<IdTypeDTO> results = new ArrayList<IdTypeDTO>();
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT id, name").append(SPACE);
		sb.append("FROM IdType").append(SPACE);
		
		if(!UtilObject.getUtilObject().isNull(idType)) {
			
			if(UtilNumeric.getUtilNumeric().isGreaterThan(idType.getId(), 0)) {
				
				sb.append("WHERE id = ? ");
				parameters.add(idType.getId());
				setWhere = false;
				
			}
			
			if (!UtilText.isEmpty(idType.getName())) {
				sb.append(setWhere ? "WHERE " : "AND ");
				sb.append("name = ?");
				parameters.add(UtilText.trim(idType.getName()));
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
	private List<IdTypeDTO> executeQuery(PreparedStatement preparedStatement) {
		  
		  List<IdTypeDTO> results = new ArrayList<>();
		  
		  try (ResultSet resultSet = preparedStatement.executeQuery()) {
				
			} catch (SQLException exception) {
				
				throw GpsException.buildTechnicalDataException("There was a problem trying to execute the query to recovery IdType on PostgreSQL", exception);
				
			} catch (Exception exception) {
				
				throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to execute the query to recovery IdType on PostgreSQL", exception);		
			}
		  
		     return results;
		  
		  }	
	private List<IdTypeDTO> assembleResults(ResultSet resultSet) {
		  List<IdTypeDTO> results = new ArrayList<>();
		  
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
	private IdTypeDTO assembleDTO(ResultSet resultSet) {
		  
		  IdTypeDTO dto = new IdTypeDTO();
		  
		try {
			  dto.setId(resultSet.getInt("id"));
			  dto.setName(resultSet.getString("name"));	  
	    } catch (SQLException exception) {
			
			throw GpsException.buildTechnicalDataException("There was a problem trying to assemble the IdTypes on Azure SQL Server", exception);
			
		} catch (Exception exception) {
			
			throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to assemble the IdType on Azure SQL Server", exception);		
		}
		
		return dto;
	}
	

}
