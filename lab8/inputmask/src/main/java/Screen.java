/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

import java.util.* ;

public class Screen implements IScreen, IDisplayComponent
{
    private ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>() ;
    private ArrayList<IDisplayComponent> Backcomponents = new ArrayList<IDisplayComponent>() ;
    private IKeyEventHandler chain ;
    private IKeyEventHandler backChain;

    public Screen()
    {
        // no constructor elements
    }

    public void key(String ch, int cnt) {
        chain.key(ch, cnt) ;
    }

    public void delete(){backChain.delete();}
    
    public void addSubComponent( IDisplayComponent c )
    {
        components.add( c ) ;
        if (components.size() == 1 )
        {
            chain = (IKeyEventHandler) c ;
        }
        else
        {
            IKeyEventHandler prev = (IKeyEventHandler) components.get(components.size()-2) ;
            prev.setNext( (IKeyEventHandler) c ) ;
        }


    }

    public void addBackSubComponent( IDisplayComponent c )
    {
        Backcomponents.add( c ) ;
        if (Backcomponents.size() == 1 )
        {
            backChain = (IKeyEventHandler) c ;
        }
        else
        {
            IKeyEventHandler prev = (IKeyEventHandler) Backcomponents.get(Backcomponents.size()-2) ;
            prev.setPrev( (IKeyEventHandler) c ) ;
        }


    }


    
    public String display() { 
        String value = "" ;
        for (IDisplayComponent c : components )
        {
            value = value + c.display() ;
        }
        return value ; 
    }

    public String name() {
        return (this.getClass().getName()) ; 
    }

}
