public class Printer {

    private IPrintStrategy strategy;

    public Printer(IPrintStrategy strategy){
        this.strategy = strategy;
    }

    public void print(){
        strategy.print();
    }
}
