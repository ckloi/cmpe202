  

public class Client {

    public static void main(String [] args)
    {
        Component theOrder1 = BuildOrder.getOrder1() ;
        theOrder1.printDescription();

        Component theOrder2 = BuildOrder.getOrder2() ;
        theOrder2.printDescription();

    }
}
 
