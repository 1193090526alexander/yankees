package co.gps.app.wx.grades.businesslogic.facade;

import co.gps.app.wx.dto.UserDTO;

public interface UserFacade {
	void create (UserDTO dto);
	void delete (int id);
	void find (UserDTO dto);
}

