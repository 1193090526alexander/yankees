package co.gps.app.wx.grade.businesslogic.business;

import java.util.List;

import co.gps.app.wx.dto.IdTypeDTO;

public interface IdTypeBusiness {
	void create(IdTypeDTO dto);
	void update(IdTypeDTO dto);
	void delete(int id);
	List<IdTypeDTO> find(IdTypeDTO dto);

}
