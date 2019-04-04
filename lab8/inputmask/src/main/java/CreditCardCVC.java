/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private IKeyEventHandler prevHandler;

	private Text cvc = new CardText();
	private int count = 0;
	private int limit = 3;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }
	public void setPrev(IKeyEventHandler prev) {this.prevHandler = prev; }


	public String display() {
		if ( count == 0)
			return "[123]" + "  " ;
		else
			return "[" + new StringBuffer(cvc.getText()).reverse().toString() + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {

		if ( count < limit) {


			Digit newDigit = new Digit(ch);

			newDigit.setDecorator(cvc);

			cvc = newDigit;

			count += 1;


		} else if ( nextHandler != null ) {
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

			cvc = ((CustomCharacter) cvc).getDecorator();
			count -= 1;

		}
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}