package co.gps.app.wx.data.dao;

import java.util.List;

import co.gps.app.wx.dto.RecordDTO;

public interface RecordDAO {
	
	void create(RecordDTO record);
	void update(RecordDTO record);
	void delete(int id);
	List<RecordDTO> find(RecordDTO record);

}
