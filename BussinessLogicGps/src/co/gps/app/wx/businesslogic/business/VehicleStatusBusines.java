package co.gps.app.wx.businesslogic.business;

import co.gps.app.wx.dto.VehicleStatusDTO;

public interface VehicleStatusBusines {
	void  create (VehicleStatusDTO session);
	void update (VehicleStatusDTO session);
	void delete (int id);
	void find (VehicleStatusDTO session);
}
