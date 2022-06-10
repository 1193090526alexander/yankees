package co.gps.app.wx.grade.businesslogic.business;

import java.util.List;

import co.gps.app.wx.dto.VehicleTypeDTO;

public interface VehicleTypeBusiness {
	void create(VehicleTypeDTO dto);
	void update(VehicleTypeDTO dto);
	void delete(int id);
	List<VehicleTypeDTO> find(VehicleTypeDTO dto);

}
