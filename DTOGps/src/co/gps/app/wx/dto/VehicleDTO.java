package co.gps.app.wx.dto;

import co.gps.app.crosscutting.util.text.UtilText;

public class VehicleDTO {
	
	private double registerCode;
	private UserDTO user;
	private String tuition;
	private String model;
	private DeviceDTO device;
	private BrandDTO brand;
	private ColorDTO color;
	private VehicleTypeDTO vehicleType;
	private VehicleStatusDTO vehicleStatus;
	
	public VehicleDTO() {
		
		setRegisterCode(registerCode);
		setUser(user);
		setTuition(UtilText.EMPTY);
		setModel(UtilText.EMPTY);
		setDevice(device);
		setBrand(brand);
		setColor(color);
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
	public ColorDTO getColor() {
		return color;
	}
	public void setColor(ColorDTO vehicleStatus) {
		this.color = vehicleStatus;
	}


	public VehicleTypeDTO getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(VehicleTypeDTO vehicleType) {
		this.vehicleType = vehicleType;
	}


	public VehicleStatusDTO getVehicleStatus() {
		return vehicleStatus;
	}


	public void setVehicleStatus(VehicleStatusDTO vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}
	
	
	

}
