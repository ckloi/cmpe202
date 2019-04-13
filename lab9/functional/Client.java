import java.util.function.Function;

public class Client {
    
    public void runTest()
    {

        Handler h1 = new Handler(){

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

    };

        Handler h2 = new Handler(){

        private Handler successor = null;

        public void handleRequest( String request, CustomResponse response ) {
            System.out.println( "R2 got the request...");
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

    };

        h1.setSuccessor(h2);


        System.out.println( "Sending R2...");
        h1.handleRequest("R2", (String x)-> {
            System.out.println(x);
        });

        System.out.println( "Sending R1...");
        h1.handleRequest("R1", (String x)-> {
            System.out.println(x);
        });
        System.out.println( "Sending RX...");
        h1.handleRequest("RX", (String x)-> {
            System.out.println(x);
        });

    }
    
    public static void main( String [] args )
    {
        Client c = new Client() ;
        c.runTest() ;
    }
    

}
