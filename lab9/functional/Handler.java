
public interface Handler {

	void handleRequest(String request, CustomResponse response);
	void setSuccessor(Handler next);

}
