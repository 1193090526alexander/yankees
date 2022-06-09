package co.gps.app.wx.dto;

import co.gps.app.crosscutting.util.text.UtilText;

public class VehicleDTO {
	
	private double registerCode;
	private UserDTO user;
	private String tuition;
	private String model;
	private DeviceDTO device;
	private BrandDTO brand;
	private VehicleStatusDTO vehicleStatus;
	private VehicleTypeDTO vehicleType;
	
	public VehicleDTO() {
		
		setRegisterCode(registerCode);
		setUser(user);
		setTuition(UtilText.EMPTY);
		setModel(UtilText.EMPTY);
		setDevice(device);
		setBrand(brand);
		setVechicleStatus(vehicleStatus);
		setVehicleType(vehicleType);
	}
	
	
	public double getRegisterCode() {
		return registerCode;
	}
	public void setRegisterCode(double registerCode) {
		this.registerCode = registerCode;
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public String getTuition() {
		return tuition;
	}
	public void setTuition(String tuition) {
		this.tuition = tuition;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public DeviceDTO getDevice() {
		return device;
	}
	public void setDevice(DeviceDTO device) {
		this.device = device;
	}
	public BrandDTO getBrand() {
		return brand;
	}
	public void setBrand(BrandDTO brand) {
		this.brand = brand;
	}
	public VehicleStatusDTO getVehicleStatus() {
		return vehicleStatus;
	}
	public void setVechicleStatus(VehicleStatusDTO vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}


	public VehicleTypeDTO getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(VehicleTypeDTO vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	
	

}
