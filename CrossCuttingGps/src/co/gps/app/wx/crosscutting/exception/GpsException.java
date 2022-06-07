package co.gps.app.wx.crosscutting.exception;

import static co.gps.app.crosscutting.util.object.UtilObject.getUtilObject;

import co.gps.app.crosscutting.exception.GeneralException;
import co.gps.app.wx.crosscutting.exception.enumeration.ExceptionLocation;
import co.gps.app.wx.crosscutting.exception.enumeration.ExceptionType;

public class GpsException extends GeneralException {
	
	private static final long serialVersionUID = 625249639280789375L;
	
	private ExceptionType type;
	private ExceptionLocation location;

	private GpsException(String userMessage, String technicalMessage, Exception rootException, ExceptionType type, ExceptionLocation location) {
		super(userMessage, technicalMessage, rootException);
		setType(type);
		setLocation(location);
	}

	public static GpsException buildUserException(String userMessage) {
		return new GpsException(userMessage, userMessage, null, ExceptionType.BUSSINESS, null);
	}

	public static GpsException buildTechnicalException(String technicalMessage) {
		return new GpsException(null, technicalMessage, null, ExceptionType.TECHNICAL, null);
	}

	public static GpsException buildTechnicalException(String technicalMessage, Exception rootException, ExceptionLocation location) {
		return new GpsException(null, technicalMessage, rootException, ExceptionType.TECHNICAL, location);
	}

	public static GpsException buildTechnicalDataException(String technicalMessage) {
		return new GpsException(null, technicalMessage, null, ExceptionType.TECHNICAL, ExceptionLocation.DATA);
	}

	public static GpsException buildTechnicalDataException(String technicalMessage, Exception rootException) {
		return new GpsException(null, technicalMessage, rootException, ExceptionType.TECHNICAL, ExceptionLocation.DATA);
	}

	public static GpsException build(String userMessage, String technicalMessage) {
		return new GpsException(userMessage, technicalMessage, null, null, null);
	}

	public static GpsException build(String userMessage, String technicalMessage, Exception rootException) {
		return new GpsException(userMessage, technicalMessage, rootException, null, null);
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
		return new GpsException(null, technicalMessage, null, ExceptionType.TECHNICAL, ExceptionLocation.BUSSINESS_LOGIC);
	}
	
	public static Exception buildBusinessLogicException(String businessMessage) {
		return new GpsException(businessMessage, null, null, ExceptionType.BUSSINESS,ExceptionLocation.BUSSINESS_LOGIC);
	}
}
