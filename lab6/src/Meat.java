public class Meat extends IngredientLeaf {


    public Meat(String description, Double price) {
        super(description, price);
    }

    @Override
    public String getDescription() {
        return "{{{{" + super.getDescription() + "}}}}";
    }
}
