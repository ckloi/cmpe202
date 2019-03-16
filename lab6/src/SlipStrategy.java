import java.util.ArrayList;

public class SlipStrategy extends PaperBasedStrategy {


    public SlipStrategy(Order order){
        super(order);
    }



    public String childDescription(ArrayList<IComponent> subCompoents){

        StringBuilder content = new StringBuilder();
        Padding padInstance = Padding.getInstance();


        for (int i = 0; i < subCompoents.size(); i++){
            if (subCompoents.get(i) instanceof Meat){
                subCompoents.add(subCompoents.remove(i));
            }
        }

        content.append("\n");

        for (IComponent c : subCompoents){
            content.append(padInstance.padSpaces(7));
            content.append(c.getDescription());
            content.append("\n");
        }

        return content.toString();
    }




    @Override
    public void print() {

        StringBuilder content = new StringBuilder();

        ArrayList<IComponent> items = order.getItems();


        content.append(padInstance.padSpaces(2));

        content.append("Patties - 1");

        content.append(padInstance.padLines(2));

        content.append(currentOrder());

        content.append(padInstance.padLines(2));

        content.append(currentDay());

        content.append(padInstance.padLines(2));

        content.append(padInstance.padSpaces(6));

        content.append("Five Guys");

        content.append(padInstance.padLines(2));

        content.append(padInstance.padSpaces(2));
        content.append("Sandwich#  1");
        content.append("\n");
        for (int i = 0; i < items.size(); i++ ){
            content.append(items.get(i).getDescription());
            content.append(childDescription(items.get(i).getChildComponents()));
            content.append("\n");
        }

        System.out.println(content.toString());

    }
}
