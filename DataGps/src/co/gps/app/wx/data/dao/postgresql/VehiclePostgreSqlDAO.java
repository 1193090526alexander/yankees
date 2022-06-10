package co.gps.app.wx.data.dao.postgresql;

<<<<<<< HEAD


public class VehiclePostgreSqlDAO {
=======
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
import co.gps.app.wx.data.dao.VehicleDAO;
import co.gps.app.wx.data.dao.connection.ConnectionSQL;
import co.gps.app.wx.dto.VehicleDTO;


public class VehiclePostgreSqlDAO extends ConnectionSQL implements VehicleDAO {
	
	private VehiclePostgreSqlDAO(Connection connection) {
		super(connection);
	}

	public static VehicleDAO build(Connection connection) {
		return new VehiclePostgreSqlDAO(connection);
	}

	@Override
	public void register(VehicleDTO vehicle) {
		String sql = "INSERT INTO vehiculo(codigo-registro, cliente, matricula, modelo, dispositivo, color_id, marca_id, estado_id) VALUES (?,?,?,?,?,?,?,?)";
		try (PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {

			preparedStatement.setDouble(1, vehicle.getRegisterCode());
			preparedStatement.setInt(2, vehicle.getUser().getIdType().getId());
			preparedStatement.setString(3, vehicle.getTuition());
			preparedStatement.setString(4, vehicle.getModel());
			preparedStatement.setInt(5, vehicle.getDevice().getReference());
			preparedStatement.setInt(6, vehicle.getColor().getId());
			preparedStatement.setInt(7, vehicle.getBrand().getId());
			preparedStatement.setInt(8, vehicle.getVehicleStatus().getId());

			preparedStatement.executeUpdate();

		} catch (SQLException exception) {
			throw GpsException.buildTechnicalDataException("There was a problem trying to create the new IdType on PostgreSQL", exception);
		} catch (Exception exception) {
			throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to create the new IdType on PostgreSQL", exception);
		}
	}

	@Override
	public void modify(VehicleDTO vehicle) {
		String sql = "UPDATE vehiculo SET (dispositivo = ?, color_id = ?)  WHERE id = ?";
		
			try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {	
			
				preparedStatement.setInt(1, vehicle.getDevice().getReference());
				preparedStatement.setInt(1, vehicle.getColor().getId());
			
				preparedStatement.executeUpdate();
			
			} catch (SQLException exception) {
			
				throw GpsException.buildTechnicalDataException("There was a problem trying to update the new IdType on PostgreSQL", exception);
			
			} catch (Exception exception) {
			
				throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to update the new IdType on PostgreSQL", exception);

			}
	}

	@Override
	public void delete(int id) {
String sql = "DELETE FROM dispositivo WHERE id = ?";
		
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
	public List<VehicleDTO> find(VehicleDTO vehicle) {
		boolean setWhere = true;
		List<Object> parameters = new ArrayList<>();
		List<VehicleDTO> results = new ArrayList<VehicleDTO>();
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT id, name").append(SPACE);
		sb.append("FROM IdType").append(SPACE);
		
		if(!UtilObject.getUtilObject().isNull(vehicle)) {
			
			if(UtilNumeric.getUtilNumeric().isGreaterThan(vehicle.getRegisterCode(), 0)) {
				
				sb.append("WHERE id = ? ");
				parameters.add(vehicle.getRegisterCode());
				setWhere = false;
				
			}
			
			if (!UtilText.isEmpty(vehicle.getTuition())) {
				sb.append(setWhere ? "WHERE " : "AND ");
				sb.append("name = ?");
				parameters.add(UtilText.trim(vehicle.getTuition()));
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
	private List<VehicleDTO> executeQuery(PreparedStatement preparedStatement) {
		  
		  List<VehicleDTO> results = new ArrayList<>();
		  
		  try (ResultSet resultSet = preparedStatement.executeQuery()) {
				
			} catch (SQLException exception) {
				
				throw GpsException.buildTechnicalDataException("There was a problem trying to execute the query to recovery IdType on PostgreSQL", exception);
				
			} catch (Exception exception) {
				
				throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to execute the query to recovery IdType on PostgreSQL", exception);		
			}
		  
		     return results;
		  
		  }	
	private List<VehicleDTO> assembleResults(ResultSet resultSet) {
		  List<VehicleDTO> results = new ArrayList<>();
		  
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
	private VehicleDTO assembleDTO(ResultSet resultSet) {
		  
		  VehicleDTO dto = new VehicleDTO();
		  
		try {
			  dto.setRegisterCode(resultSet.getDouble("codigo-registro"));
			  dto.setTuition(resultSet.getString("matricula"));	  
	    } catch (SQLException exception) {
			
			throw GpsException.buildTechnicalDataException("There was a problem trying to assemble the IdTypes on Azure SQL Server", exception);
			
		} catch (Exception exception) {
			
			throw GpsException.buildTechnicalDataException("An unexpected problem has ocurred trying to assemble the IdType on Azure SQL Server", exception);		
		}
		
		return dto;
	}
>>>>>>> d6190c89099da8dee27e951f472baf0823e46fa8


}
