public class Sacue extends IngredientLeaf {


    public Sacue(String description, Double price) {
        super(description, price);
    }

    @Override
    public String getDescription() {
        return "-> |" + super.getDescription();
    }

}
