
public class ConcreteHandler2 implements Handler {

    private Handler successor = null;

    public void handleRequest( String request, CustomResponse response ) {
        System.out.println( "R2 got the request...");
        if ( request.equalsIgnoreCase("R2") )
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
