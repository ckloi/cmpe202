  

public class BuildOrder {

    public static Component getOrder1()
    {
        Composite order = new Composite( "Order" ) ;



        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;

        b.setOptions( bo ) ;

        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;

        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;


        PremiumCheese pc = new PremiumCheese("Premium Cheese Options");
        String [] pco = {"Danish Blue Cheese"};

        pc.setOptions(pco);

        pc.wrapDecorator(c);


        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;




        // unlimited toppings free
        Toppings t = new Toppings( "Toppings Options" ) ;

        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles"} ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;


        // premium topping +1.50
        Premium pt = new PremiumToppings( "Premium Toppings Options" ) ;
        String[] pto = { "Marinated Tomatoes" } ;
        pt.setOptions( pto ) ;
        pt.wrapDecorator( t ) ;
        // 1 sauce free, extra +.75


        Bun bun = new Bun("Bun Options");

        String[] buno = {"Ciabatta (Vegan)"};

        bun.setOptions(buno);

        bun.wrapDecorator(pt);


        Side side = new Side("Side Options");

        String[] sideO = {"Shoestring Fries"};

        side.setOptions(sideO);

        side.wrapDecorator(bun);

        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( side ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( pt ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( side ) ;

        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        return order ;
    }

    public static Component getOrder2(){
        Composite order = new Composite( "Order" ) ;



        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;

        b.setOptions( bo ) ;

        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Smoked Gouda", "Greek Feta" } ;

        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;


        PremiumCheese pc = new PremiumCheese("Premium Cheese Options");
        String [] pco = {"Fresh Mozzarella"};

        pc.setOptions(pco);

        pc.wrapDecorator(c);


        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Habanero Salsa" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;




        // unlimited toppings free
        Toppings t = new Toppings( "Toppings Options" ) ;

        String[] to = { "Crushed Peanuts"} ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;


        // premium topping +1.50
        Premium pt = new PremiumToppings( "Premium Toppings Options" ) ;
        String[] pto = { "Sunny Side Up Egg", "Marinated Tomatoes" } ;
        pt.setOptions( pto ) ;
        pt.wrapDecorator( t ) ;
        // 1 sauce free, extra +.75


        Bun bun = new Bun("Bun Options");

        String[] buno = {"Gluten-Free Bun"};

        bun.setOptions(buno);

        bun.wrapDecorator(pt);


        Side side = new Side("Side Options");

        String[] sideO = {"Shoestring Fries"};

        side.setOptions(sideO);

        side.wrapDecorator(bun);


        // Setup Custom Burger Ingredients
        customBurger.setDecorator( side ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( pt ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( side ) ;


        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/