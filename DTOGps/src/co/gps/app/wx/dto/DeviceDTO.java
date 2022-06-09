package co.gps.app.wx.dto;

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

}
