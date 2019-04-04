/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private IKeyEventHandler prevHandler;

	private Text number = new CardText();
	private int count = 0;
	private int limit = 16;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }
	public void setPrev(IKeyEventHandler prev) {this.prevHandler = prev; }


	public String display() {
		if (count == 0) {
			return "[4444 4444 4444 4444]" + "  ";
		}else{

			return "[" + new StringBuffer(number.getText()).reverse().toString() + "]" + "  " ;
		}

	}	

	public void key(String ch, int cnt) {

		if ( count < limit) {


				Digit newDigit = new Digit(ch);

				newDigit.setDecorator(number);

				number = newDigit;

				count += 1;

				if (count == 4 || count == 8 || count == 12) {

					SpecialChar newSpace = new SpecialChar(" ");

					newSpace.setDecorator(number);

					number = newSpace;
				}



		}else if ( nextHandler != null ) {
			nextHandler.key(ch, cnt);
		}
	}

	@Override
	public void delete(){

		if (count == 0){
			if ( prevHandler != null){
				prevHandler.delete();
			}
			return;
		}

		if (count <= limit) {

			System.out.println(count);


			number = ((CustomCharacter) number).getDecorator();


			if (count == 4 || count == 8 || count == 12) {
				number = ((CustomCharacter) number).getDecorator();
			}

			count -= 1;


		}
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}