package co.gps.app.wx.controller.response;
import co.gps.app.crosscutting.util.object.UtilObject;
import java.util.ArrayList;
import java.util.List;

public class Response<D> {
	private List<D> data;
	private List<String> messages;
	public List<D> getData() {
		return data;
	}
	public void setData(List<D> data) {
		this.data = UtilObject.getUtilObject().getDefault(data, new ArrayList<>());
	}
	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = UtilObject.getUtilObject().getDefault(messages, new ArrayList<>());
	}
	public Response(List<D> data, List<String> messages) {
		super();
		setData(data);
		setMessages(messages);
	}
	public Response () {
		super();
		setData(new ArrayList<>());
		setMessages(new ArrayList<>());
	}
      

}
