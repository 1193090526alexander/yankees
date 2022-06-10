package co.gps.app.wx.grades.businesslogic.bussiness.facade;

import java.util.List;

import co.gps.app.wx.dto.IdTypeDTO;

public interface IdTypeFacade {

	void update(IdTypeDTO dto) throws Exception;
public interface SubjectBusiness {
		
		void create(IdTypeDTO dto) throws Exception;
		void update(IdTypeDTO dto) throws Exception;
		void delete(int id) throws Exception;
		List<IdTypeDTO> find(IdTypeDTO dto) throws Exception;
	}

}
