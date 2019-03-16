public class Topping extends IngredientLeaf {


    public Topping(String description, Double price) {
        super(description, price);
    }

    @Override
    public String getDescription() {
        return "-> |" + super.getDescription();
    }

}
