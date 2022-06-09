package co.gps.app.wx.dto;

import co.gps.app.crosscutting.util.text.UtilText;

public class DeviceStatusDTO {
	
	private int id;
	private String name;
	private String description;
	
	public DeviceStatusDTO() {
		
		setId(id);
		setName(UtilText.EMPTY);
		setDescription(UtilText.EMPTY);
		
		
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
