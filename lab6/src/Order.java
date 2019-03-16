import java.util.ArrayList;

public class Order implements IOrder {

    private ArrayList<IComponent> items = new ArrayList<>();
    private int orderNum;


    public Order(int orderNum){
        this.orderNum = orderNum;
    }

    @Override
    public void addLBB(int num){
        BurgerComposite llb = new BurgerComposite("LBB", 1.59, num);

        llb.addComponent(new Meat("BACON",1.0));
        llb.addComponent(new Vegetable("LETTUCE",1.0));
        llb.addComponent(new Vegetable("TOMATO",1.0));
        llb.addComponent(new Sacue("G ONION",0.5));
        llb.addComponent(new Sacue("JALA Grilled",0.5));

        items.add(llb);

    }

    @Override
    public void addFries(int num){
        BurgerComposite littleFires = new BurgerComposite("LTL CAJ", 2.79, 1);
        items.add(littleFires);

    }

    public int getOrderNum(){
        return orderNum;
    }

    public ArrayList<IComponent> getItems(){
        return items;
    }



}
