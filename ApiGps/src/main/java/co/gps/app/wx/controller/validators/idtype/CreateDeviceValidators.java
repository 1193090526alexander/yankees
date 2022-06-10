package co.gps.app.wx.controller.validators.idtype;

import java.util.ArrayList;
import java.util.List;

import co.gps.app.wx.controller.validators.validator;
import co.gps.app.wx.dto.DeviceDTO;


public class CreateDeviceValidators implements  validator<DeviceDTO> {
	 
		private List<String> validationMessages = new ArrayList<>();
		
		@Override 
		public List<String> validate(DeviceDTO dto){
			if(UtilObject.getUtilObject().isNull(dto)) {
				validationMessages.add("It´s not possible validate device  dat");
			}
			dto.validateName(validationMessages);      
			return validationMessages;
		}

}
