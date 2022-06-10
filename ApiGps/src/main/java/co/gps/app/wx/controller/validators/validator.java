package co.gps.app.wx.controller.validators;

import java.util.List;

public interface validator <D>{
	 List<String> validate(D dto);
}
