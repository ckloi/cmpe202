import java.util.ArrayList;

public class ReceiptStrategy extends PaperBasedStrategy {



    public ReceiptStrategy(Order order) {
        super(order);
    }

    public String childDescription(ArrayList<IComponent> subCompoents){

        StringBuilder content = new StringBuilder();
        Padding padInstance = Padding.getInstance();


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

        Double total[] = {0.0,0.0,0.0};


        content.append(currentAddress());
        content.append(padInstance.padLines(2));
        content.append(currentDay());
        content.append(padInstance.padLines(2));
        content.append(padInstance.padSpaces(10));
        content.append("Five Guys");
        content.append("\n");


        content.append(currentOrder());

        content.append("\n");


        for (int i = 0; i < items.size(); i++ ){
            content.append(items.get(i).getDescription());
            content.append(padInstance.padSpaces(10));
            content.append(String.format( "$%.2f",items.get(i).getPrice()));


           content.append(childDescription(items.get(i).getChildComponents()));

            content.append("\n");
        }

        for (int i = 0; i < items.size(); i++ ){
            total[0] += items.get(i).getPrice();
        }

        total[1] = total[0] * 0.091;

        total[2] = total[0] + total[1];

        String totalText[] = new String[] {"Sub. Total:","TAX:","Total:"};


        for (int i = 0; i < totalText.length; i++){
            content.append(padInstance.padSpaces(2));
            content.append(totalText[i]);
            content.append(padInstance.padSpaces(10));
            content.append(String.format( "$%.2f",total[i]));
            content.append("\n");
        }


        System.out.println(content.toString());

    }
}
