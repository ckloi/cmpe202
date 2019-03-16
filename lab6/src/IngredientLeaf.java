import java.util.ArrayList;

public class IngredientLeaf implements IComponent {

    private String description;
    private Double price;


    public IngredientLeaf(String description, Double price){
        this.description = description;
        this.price = price;

    }

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public ArrayList<IComponent> getChildComponents() {
        return null;
    }

    @Override
    public Double getPrice(){
        return price;
    }


}
