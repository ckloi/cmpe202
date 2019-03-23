 class Bun extends LeafDecorator {

    public Bun(String d) {
        super(d);
    }

    @Override
    public void setOptions(String[] options) {
        this.options = options;
        for ( String str: options ) {
            if("Gluten-Free Bun".equals(str)) this.price += 1.00;
            if("Hawaiian Bun".equals(str)) this.price += 1.00;
        }
    }

     @Override
     public String getDescription()
     {
         String desc = "   " ;
         for ( int i = 0; i<options.length; i++ )
         {
             if (i>0) desc += " + " + options[i] ;
             else desc = options[i] ;
         }
         return desc ;
     }


 }
