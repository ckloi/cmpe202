/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private IKeyEventHandler prevHandler;
	private Text date = new CardText();

	private int count = 0;
	private int limit = 4;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }

    public void setPrev(IKeyEventHandler prev) {this.prevHandler = prev; }

	public String display() {
		if ( count == 0)
			return "[MM/YY]" + "  " ;
		else
			return "[" + new StringBuffer(date.getText()).reverse().toString() + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {

		if ( count < limit ) {

				Digit newDigit = new Digit(ch);

				newDigit.setDecorator(date);

				date = newDigit;

				count += 1;

				if (count == 2) {

					SpecialChar newSpace = new SpecialChar("/");

					newSpace.setDecorator(date);

					date = newSpace;
				}


		}else if ( nextHandler != null ) {
			nextHandler.key(ch, cnt);
		}
	}

	@Override
	public void delete() {

		if (count == 0){
			if ( prevHandler != null){
				prevHandler.delete();
			}
			return;
		}

		if (count <= limit) {

			date = ((CustomCharacter) date).getDecorator();


			if (count == 2) {
				date = ((CustomCharacter) date).getDecorator();
			}

			count -= 1;


		}
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}