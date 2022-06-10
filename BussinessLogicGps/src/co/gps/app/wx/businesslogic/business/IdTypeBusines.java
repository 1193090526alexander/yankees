package co.gps.app.wx.businesslogic.business;

import java.util.List;

import co.gps.app.wx.dto.IdTypeDTO;


public interface IdTypeBusines {
	void create(IdTypeDTO dto);
	void update(IdTypeDTO dto);
	void delete(int id);
	List<IdTypeDTO> find(IdTypeDTO dto);

}
