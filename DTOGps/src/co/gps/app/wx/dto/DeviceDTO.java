package co.gps.app.wx.dto;

import java.util.ArrayList;
import java.util.List;

public class DeviceDTO {
	
	private int reference;
	private VehicleDTO vehicle;
	private DeviceStatusDTO deviceStatus;
	
	public DeviceDTO() {
		
		setReference(reference);
		setVehicle(vehicle);
		setDeviceStatus(deviceStatus);
		
		
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public VehicleDTO getVehicle() {
		return vehicle;
	}

	public void setVehicle(VehicleDTO vehicle) {
		this.vehicle = vehicle;
	}

	public DeviceStatusDTO getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(DeviceStatusDTO deviceStatus) {
		this.deviceStatus = deviceStatus;
	}
	public void validateName(List<String> validationMessages) {

		validationMessages = UtilObject.getUtilObject().getDefault(validationMessages, new ArrayList<>());

		if (UtilText.isEmpty(getName())) {

			validationMessages.add("Name of device is required");

		} else if (UtilText.getDefault(getName()).length() > 50) {

			validationMessages.add("The lenght of the name of device must be less than 50 charecters");

		} else if (!UtilText.getDefault(getName()).matches("^[a-zA-ZÒ—·¡È…ÌÕÛ”˙⁄ ]*$")) {
			validationMessages.add("The name of device has not valid characters");
		}
	}

}
