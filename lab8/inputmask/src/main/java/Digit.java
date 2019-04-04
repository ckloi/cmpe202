public class Digit extends CustomCharacter {

    private String digit;

    public Digit(String d){
        this.digit = d;
    }

    @Override
    public String getText() {
        return this.digit + getDecorator().getText();
    }

}
