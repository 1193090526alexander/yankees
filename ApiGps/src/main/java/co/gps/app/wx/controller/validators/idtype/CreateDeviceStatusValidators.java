package co.gps.app.wx.controller.validators.idtype;

import java.util.ArrayList;
import java.util.List;

import co.gps.app.wx.controller.validators.validator;
import co.gps.app.wx.dto.DeviceStatusDTO;


public class CreateDeviceStatusValidators implements  validator<DeviceStatusDTO> {
	 
		private List<String> validationMessages = new ArrayList<>();
		
		@Override 
		public List<String> validate(DeviceStatusDTO dto){
			if(UtilObject.getUtilObject().isNull(dto)) {
				validationMessages.add("It´s not possible validate device status dat");
			}
			dto.validateName(validationMessages);      
			return validationMessages;
		}

}
