package co.gps.app.wx.data.dao;

import java.util.List;

import co.gps.app.wx.dto.VehicleDTO;

public interface VehicleDAO {
	
	void register (VehicleDTO vehicle);
	void modify (VehicleDTO vehicle);
	void delete (int id);
	List<VehicleDTO> find(VehicleDTO vehicle);

}
