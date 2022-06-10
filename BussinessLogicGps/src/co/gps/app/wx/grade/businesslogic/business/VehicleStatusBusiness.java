package co.gps.app.wx.grade.businesslogic.business;


import co.gps.app.wx.dto.VehicleStatusDTO;

public interface VehicleStatusBusiness {
	void create(VehicleStatusDTO dto);

	void update(VehicleStatusDTO dto);

	void delete(int id);

	void find(VehicleStatusDTO dto);

}
