import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaperBasedStrategy implements IPrintStrategy {

    Order order;
    Padding padInstance = Padding.getInstance();


    public PaperBasedStrategy(Order order){
        this.order = order;
    }

    String currentOrder(){


        StringBuilder content = new StringBuilder();

        content.append(padInstance.padSpaces(2));
        content.append("Order Numer:");
        content.append(padInstance.padSpaces(2));
        content.append(order.getOrderNum());

        return content.toString();
    }

    String currentDay(){


        StringBuilder content = new StringBuilder();

        content.append(padInstance.padSpaces(5));

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = new Date();

        content.append(dateFormat.format(date));

        return content.toString() ;

    }

    String currentAddress(){


        StringBuilder content = new StringBuilder();



        String address[] = new String[] {"FIVE GUYS","BURGERS AND FRIES",
                "STORE # CA-1294","5353 ALMADEN EXPY N60","SAN JOSE, CA 95118","P 408-264-9300"};


        int spaces[] = {10,6,7,4,6,8};

        for (int i = 0; i < address.length; i++){
            content.append(padInstance.padSpaces(spaces[i]));
            content.append(address[i]);
            content.append("\n");
        }

        return content.toString();
    }

    @Override
    public void print() {
    }
}
