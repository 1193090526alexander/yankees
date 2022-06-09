package co.gps.app.wx.data.dao;

import co.gps.app.wx.dto.UserDTO;

public interface UserDAO {
	
	void create(UserDTO user);
	void update(UserDTO user);
	void delete(int id);
	void find(UserDTO user);
	

}
