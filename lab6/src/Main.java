public class Main {

    public static void main(String[] args) {

        OrderBuilder firstOrderBuilder = new OrderBuilder(45);

        OrderSystem orderSystem = new OrderSystem(firstOrderBuilder);

        orderSystem.addBurger(1);
        orderSystem.addFries(1);

        Order firstOrder = firstOrderBuilder.getOrder();

        Printer receipt = new Printer(new ReceiptStrategy(firstOrder));
        Printer slip = new Printer(new SlipStrategy(firstOrder));


        receipt.print();


        System.out.println("-----------------------------------");


        slip.print();


    }
}
