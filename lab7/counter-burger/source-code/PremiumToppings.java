public class PremiumToppings extends Premium {
    public PremiumToppings(String d) {
        super(d);
    }

    @Override
    public void setOptions(String[] options) {
        this.options = options;
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "Marinated Tomatoes".equals(options[i]) ) {
                this.price += 3.00 ;
            }else{
                this.price += 1.00;
            }

        }
    }
}
