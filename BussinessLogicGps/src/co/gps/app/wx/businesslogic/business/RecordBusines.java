package co.gps.app.wx.businesslogic.business;

import java.util.List;

import co.gps.app.wx.dto.RecordDTO;

public interface RecordBusines {
	void create(RecordDTO dto);
	void update(RecordDTO dto);
	void delete(int id);
	List<RecordDTO> find(RecordDTO dto);
}
