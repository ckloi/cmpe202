import java.util.ArrayList;

public class BurgerComposite implements IComponent {

    private ArrayList<IComponent> subCompoents = new ArrayList<>();

    private String description;

    private Double basePrice;

    private int count;


    public BurgerComposite(String description, Double basePrice, int count){
        this.description = description;
        this.basePrice = basePrice;
        this.count = count;
    }


    @Override
    public String getDescription() {

        StringBuilder content = new StringBuilder();

        Padding padInstance = Padding.getInstance();

        content.append(padInstance.padSpaces(2));

        content.append(count);

        content.append(padInstance.padSpaces(3));

        content.append(description);

        return content.toString();

    }



    @Override
    public ArrayList<IComponent> getChildComponents(){
        return subCompoents;
    }

    @Override
    public Double getPrice(){

        Double price = this.basePrice;

        for (IComponent c : subCompoents){
            price += c.getPrice();
        }

        return price * count;
    }


    public void addComponent(IComponent IComponent){
        subCompoents.add(IComponent);
    }

    public void removeComponent(IComponent IComponent){
        subCompoents.remove(IComponent);
    }


}
