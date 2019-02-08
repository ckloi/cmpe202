

public class NoCoinState implements State {
    GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	public void insertCoin() {
		System.out.println("You inserted a quarter");
    gumballMachine.increaseBalance(25);
		gumballMachine.setState(gumballMachine.getHasCoinState());
	}

  public void insertCoin(int coin) {
    String coin_name = Coin.coinToString(coin);

		if (coin_name.equals("NULL")){
			System.out.println("You inserted an invalid coin. Please try again");
			return;
		}

		System.out.println("You inserted a " + coin_name);
		gumballMachine.increaseBalance(coin);
		gumballMachine.setState(gumballMachine.getHasCoinState());
	}

	public void ejectCoin() {
		System.out.println("You haven't inserted a quarter");
	}

	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }

	public void dispense() {
		System.out.println("You need to pay first");
	}

	public String toString() {
		return "waiting for quarter";
	}
}
