package co.gps.app.wx.businesslogic.business;

import java.util.List;

import co.gps.app.wx.dto.VehicleDTO;

public interface VehicleBusines {
	void create(VehicleDTO dto);
	void update(VehicleDTO dto);
	void delete(int id);
	List<VehicleDTO> find(VehicleDTO dto);
}
