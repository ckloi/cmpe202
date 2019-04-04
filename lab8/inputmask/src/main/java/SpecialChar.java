public class SpecialChar extends CustomCharacter {

    private String sc;

    public SpecialChar(String sc){
        this.sc = sc;
    }

    @Override
    public String getText() {
        return this.sc + getDecorator().getText();
    }


}
