public class OrderSystem {


    private OrderBuilder orderBuilder;


    public OrderSystem(OrderBuilder orderBuilder){
        this.orderBuilder = orderBuilder;
    }

    public Order getOrder() {
        return this.orderBuilder.getOrder();
    }

    public void addBurger(int num) {
        this.orderBuilder.buildBurger(num);
    }

    public void addFries(int num){
        this.orderBuilder.buildFries(num);
    }



}
