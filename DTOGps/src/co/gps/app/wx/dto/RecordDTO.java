package co.gps.app.wx.dto;

import java.util.Date;

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

}
