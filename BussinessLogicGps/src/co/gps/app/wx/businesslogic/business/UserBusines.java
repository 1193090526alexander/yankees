package co.gps.app.wx.businesslogic.business;

import co.gps.app.wx.dto.UserDTO;

public interface UserBusines {
	void create(UserDTO student);
	void update(UserDTO student);
	void delete(int id);
	void find(UserDTO student);
}
