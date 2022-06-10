package co.gps.app.wx.dto;

import java.util.ArrayList;
import java.util.List;

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
	public void validateName(List<String> validationMessages) {

		validationMessages = UtilObject.getUtilObject().getDefault(validationMessages, new ArrayList<>());

		if (UtilText.isEmpty(getName())) {

			validationMessages.add("Name of device status is required");

		} else if (UtilText.getDefault(getName()).length() > 50) {

			validationMessages.add("The lenght of the name of device status must be less than 50 charecters");

		} else if (!UtilText.getDefault(getName()).matches("^[a-zA-ZÒ—·¡È…ÌÕÛ”˙⁄ ]*$")) {
			validationMessages.add("The name of device status has not valid characters");
		}
	}

}
