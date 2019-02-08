

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	public void insertCoin() {
		System.out.println("Please wait, we're already giving you a gumball");
	}

  public void insertCoin(int coin) {
    System.out.println("Please wait, we're already giving you a gumball");
  }

	public void ejectCoin() {
		System.out.println("Sorry, you already turned the crank");
	}

	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	public void dispense() {

		if (gumballMachine.getCount() > 0 && gumballMachine.isEnoughBalance()) {
      gumballMachine.releaseBall();
      if (gumballMachine.getBalance() > 0){
        gumballMachine.setState(gumballMachine.getHasCoinState());
      }else{
        gumballMachine.setState(gumballMachine.getNoCoinState());
      }

		}else if (!gumballMachine.isEnoughBalance()){
      System.out.println("Sorry, Not enough Balance!");
      gumballMachine.setState(gumballMachine.getHasCoinState());
    }else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	public String toString() {
		return "dispensing a gumball";
	}
}
