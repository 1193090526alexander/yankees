package co.gps.app.wx.grade.businesslogic.business;

import co.gps.app.wx.dto.RecordDTO;

public interface RecordBusiness {
	void create(RecordDTO dto);
	void update(RecordDTO dto);
	void delete(int id);
	void find(RecordDTO dto);

}
