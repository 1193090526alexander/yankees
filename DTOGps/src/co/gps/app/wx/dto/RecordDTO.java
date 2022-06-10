package co.gps.app.wx.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.gps.app.crosscutting.util.text.UtilText;

public class RecordDTO {
	
	private int code;
	private VehicleDTO vehicle;
	private Date date;
	private String news;
	
	public RecordDTO() {
		
		setCode(code);
		setVehicle(vehicle);
		setDate(date);
		setNews(UtilText.EMPTY);
		
		
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public VehicleDTO getVehicle() {
		return vehicle;
	}

	public void setVehicle(VehicleDTO vehicle) {
		this.vehicle = vehicle;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}
	public void validateName(List<String> validationMessages) {

		validationMessages = UtilObject.getUtilObject().getDefault(validationMessages, new ArrayList<>());

		if (UtilText.isEmpty(getName())) {

			validationMessages.add("Name of record is required");

		} else if (UtilText.getDefault(getName()).length() > 50) {

			validationMessages.add("The lenght of the name of record must be less than 50 charecters");

		} else if (!UtilText.getDefault(getName()).matches("^[a-zA-ZÒ—·¡È…ÌÕÛ”˙⁄ ]*$")) {
			validationMessages.add("The name of record has not valid characters");
		}
	}
}
