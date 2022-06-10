package co.gps.app.wx.grade.businesslogic.business;

import java.util.List;

import co.gps.app.wx.dto.VehicleDTO;

public interface VehicleBusiness {
	void create(VehicleDTO dto);
	void update(VehicleDTO dto);
	void delete(int id);
	List<VehicleDTO> find(VehicleDTO dto);


}
