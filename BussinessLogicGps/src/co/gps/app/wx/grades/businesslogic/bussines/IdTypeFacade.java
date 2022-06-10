package co.gps.app.wx.grades.businesslogic.bussines;

import java.util.List;

import co.gps.app.wx.dto.UserDTO;

public class IdTypeFacade {
public interface SubjectBusiness {
		
		void create(UserDTO dto);
		void update(UserDTO dto);
		void delete(int id);
		List<UserDTO> find(UserDTO dto);

	}
}
