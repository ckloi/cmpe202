public class OrderBuilder implements IOrderBuilder {

    private Order order;

    public OrderBuilder(int orderNum){
        this.order = new Order(orderNum);
    }

    @Override
    public void buildBurger(int num) {
        order.addLBB(num);
    }

    @Override
    public void buildFries(int num) {
        order.addFries(num);
    }

    @Override
    public Order getOrder() {
        return order;
    }
}
