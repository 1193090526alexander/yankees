package co.gps.app.wx.businesslogic.business;

import java.util.List;

import co.gps.app.wx.dto.VehicleTypeDTO;

public interface VehicleTypeBusines {
	void add(VehicleTypeDTO dto);
	void delete(int id);
	List<VehicleTypeDTO> find(VehicleTypeDTO dto);
}
