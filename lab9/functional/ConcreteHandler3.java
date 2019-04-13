
public class ConcreteHandler3 implements Handler {


    private Handler successor = null;

    public void handleRequest(String request, CustomResponse response) {
        System.out.println( "R3 got the request...");
        if ( request.equalsIgnoreCase("R3") )
        {
            response.printResponse(this.getClass().getName() + " => This one is mine!");
        }
        else
        {
            if ( successor != null )
                successor.handleRequest(request,response);
        }

    }

    public void setSuccessor(Handler next) {
        this.successor = next ;
    }


}
