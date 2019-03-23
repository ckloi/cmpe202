public class PremiumCheese extends Premium {

    public PremiumCheese(String d) {
        super(d);
    }

    @Override
    public void setOptions(String[] options) {
        this.options = options;
        price += 1.5 * options.length;
    }
}
