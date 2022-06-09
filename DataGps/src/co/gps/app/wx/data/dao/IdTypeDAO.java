package co.gps.app.wx.data.dao;

import java.util.List;

import co.gps.app.wx.dto.IdTypeDTO;

public interface IdTypeDAO {
	
	void create (IdTypeDTO idType); 
	void update (IdTypeDTO idType);
	void delete (int id);
	List <IdTypeDTO> find(IdTypeDTO idType);

}
