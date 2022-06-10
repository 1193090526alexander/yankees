package co.gps.app.wx.grade.businesslogic.business;

import co.gps.app.wx.dto.UserDTO;

public interface UserBusiness {
	void create(UserDTO dto);
	void update(UserDTO dto);
	void delete(int id);
	void find(UserDTO dto);

}
