

import java.util.Random;

public class HasCoinState implements State {
	GumballMachine gumballMachine;

	public HasCoinState(GumballMachine gumballMachine) {
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
		System.out.println("Coins returned");
		gumballMachine.resetBalance();
		gumballMachine.setState(gumballMachine.getNoCoinState());
	}

	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

	public String toString() {
		return "waiting for turn of crank";
	}
}
