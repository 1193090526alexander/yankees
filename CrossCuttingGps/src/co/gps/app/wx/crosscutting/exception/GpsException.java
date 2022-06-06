package co.gps.app.wx.crosscutting.exception;

import  

public class GpsException {private ExceptionType type;
private ExceptionLocation location;

private GradesException(String userMessage, String technicalMessage, Exception rootException, ExceptionType type, ExceptionLocation location) {
	super(userMessage, technicalMessage, rootException);
	setType(type);
	setLocation(location);
}

public static GradesException buildUserException(String userMessage) {
	return new GradesException(userMessage, userMessage, null, ExceptionType.BUSINESS, null);
}

public static GradesException buildTechnicalException(String technicalMessage) {
	return new GradesException(null, technicalMessage, null, ExceptionType.TECHNICAL, null);
}

public static GradesException buildTechnicalException(String technicalMessage, Exception rootException, ExceptionLocation location) {
	return new GradesException(null, technicalMessage, rootException, ExceptionType.TECHNICAL, location);
}

public static GradesException buildTechnicalDataException(String technicalMessage) {
	return new GradesException(null, technicalMessage, null, ExceptionType.TECHNICAL, ExceptionLocation.DATA);
}

public static GradesException buildTechnicalDataException(String technicalMessage, Exception rootException) {
	return new GradesException(null, technicalMessage, rootException, ExceptionType.TECHNICAL, ExceptionLocation.DATA);
}

public static GradesException build(String userMessage, String technicalMessage) {
	return new GradesException(userMessage, technicalMessage, null, null, null);
}

public static GradesException build(String userMessage, String technicalMessage, Exception rootException) {
	return new GradesException(userMessage, technicalMessage, rootException, null, null);
}

private void setType(ExceptionType type) {
	this.type = getUtilObject().getDefault(type, ExceptionType.GENERAL);
}

private void setLocation(ExceptionLocation location) {
	this.location = getUtilObject().getDefault(location, ExceptionLocation.GENERAL);
}

public ExceptionType getType() {
	return type;
}

public ExceptionLocation getLocation() {
	return location;
}

public static Exception buildTechnicalBusinessLogicException(String technicalMessage) {
	return new GradesException(null, technicalMessage, null, ExceptionType.TECHNICAL, ExceptionLocation.BUSINESS_LOGIC);
}

public static Exception buildBusinessLogicException(String businessMessage) {
	return new GradesException(businessMessage, null, null, ExceptionType.BUSINESS,ExceptionLocation.BUSINESS_LOGIC);
}
	
	

}
