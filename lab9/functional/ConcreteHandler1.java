
public class ConcreteHandler1 implements Handler {

    private Handler successor = null;

	public void handleRequest( String request, CustomResponse response ) {
        System.out.println( "R1 got the request...");
        if ( request.equalsIgnoreCase("R1") )
        {
            response.printResponse(this.getClass().getName() + " => This one is mine!");

        }
        else
        {
            if ( successor != null )
                successor.handleRequest(request, response);
        }

	}

	public void setSuccessor(Handler next) {
        this.successor = next ;
	}

}
