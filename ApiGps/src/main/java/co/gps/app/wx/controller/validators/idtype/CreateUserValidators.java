package co.gps.app.wx.controller.validators.idtype;

import java.util.ArrayList;
import java.util.List;

import co.gps.app.wx.controller.validators.validator;
import co.gps.app.wx.dto.UserDTO;


public class CreateUserValidators implements  validator<UserDTO> {
	 
		private List<String> validationMessages = new ArrayList<>();
		
		@Override 
		public List<String> validate(UserDTO dto){
			if(UtilObject.getUtilObject().isNull(dto)) {
				validationMessages.add("It´s not possible validate User dat");
			}
			dto.validateName(validationMessages);      
			return validationMessages;
		}

}
