import java.util.ArrayList;

public interface IComponent {


    String getDescription();

    ArrayList<IComponent> getChildComponents();

    Double getPrice();



}
