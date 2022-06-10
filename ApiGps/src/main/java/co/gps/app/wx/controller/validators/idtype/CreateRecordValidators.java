package co.gps.app.wx.controller.validators.idtype;

import java.util.ArrayList;
import java.util.List;

import co.gps.app.wx.controller.validators.validator;
import co.gps.app.wx.dto.RecordDTO;


public class CreateRecordValidators implements  validator<RecordDTO> {
	 
		private List<String> validationMessages = new ArrayList<>();
		
		@Override 
		public List<String> validate(RecordDTO dto){
			if(UtilObject.getUtilObject().isNull(dto)) {
				validationMessages.add("It´s not possible validate record dat");
			}
			dto.validateName(validationMessages);      
			return validationMessages;
		}

}
