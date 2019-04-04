
public class CustomCharacter implements Text {

    private Text textDecorator;

    @Override
    public String getText() {
        return "";
    }

    Text getDecorator(){
        return textDecorator;
    }

    void setDecorator(Text textDecorator){
        this.textDecorator = textDecorator;
    }

}
