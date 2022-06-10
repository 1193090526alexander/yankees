package co.gps.app.wx.dto;

import java.util.ArrayList;
import java.util.List;

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
	
	public void validateName(List<String> validationMessages) {

		validationMessages = UtilObject.getUtilObject().getDefault(validationMessages, new ArrayList<>());

		if (UtilText.isEmpty(getName())) {

			validationMessages.add("Name of User is required");

		} else if (UtilText.getDefault(getName()).length() > 50) {

			validationMessages.add("The lenght of the name of User must be less than 50 charecters");

		} else if (!UtilText.getDefault(getName()).matches("^[a-zA-ZÒ—·¡È…ÌÕÛ”˙⁄ ]*$")) {
			validationMessages.add("The name of User has not valid characters");
		}
	}

}
