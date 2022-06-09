package co.gps.app.wx.dto;

import co.gps.app.crosscutting.util.text.UtilText;

public class UserDTO {
	
	private IdTypeDTO idType;
	private String document;
	private String name;
	private String firstName;
	private int phoneNumber;
	
	
	
	public UserDTO() {
		setIdType(idType);
		setDocument(UtilText.EMPTY);
		setName(UtilText.EMPTY);
		setFirstName(UtilText.EMPTY);
		setPhoneNumber(phoneNumber);
	}
	public IdTypeDTO getIdType() {
		return idType;
	}
	public void setIdType(IdTypeDTO idType) {
		this.idType = idType;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
