package co.gps.app.wx.dto;

import co.gps.app.crosscutting.util.text.UtilText;

public class ColorDTO {
	
	private int id;
	private String name;
	
	public ColorDTO() {
		
		setId(id);
		setName(UtilText.EMPTY);
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
