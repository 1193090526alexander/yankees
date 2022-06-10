package co.gps.app.wx.controller.validators.idtype;

import java.util.ArrayList;
import java.util.List;

import co.gps.app.wx.controller.validators.validator;
import co.gps.app.wx.dto.IdTypeDTO;

public class CreateIdTypeValidators implements  validator<IdTypeDTO> {
	 
		private List<String> validationMessages = new ArrayList<>();
		
		@Override 
		public List<String> validate(IdTypeDTO dto){
			if(UtilObject.getUtilObject().isNull(dto)) {
				validationMessages.add("It´s not possible validate Id Type dat");
			}
			dto.validateName(validationMessages);      
			return validationMessages;
		}
}
