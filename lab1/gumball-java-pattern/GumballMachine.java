

public class GumballMachine {

	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;

	State state = soldOutState;
	private int count = 0;
	private int balance = 0;
	private int cost = 0;



	public GumballMachine(int numberGumballs) {
		this(numberGumballs,25);
	}

	public GumballMachine(int numberGumballs, int c) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		this.cost = c;
		if (numberGumballs > 0) {
			state = hasCoinState;
		}
	}




	public void insertCoin() {
		state.insertCoin();
	}

	public void insertCoin(int coin) {
		state.insertCoin(coin);
	}

	public void ejectCoin() {
		state.ejectCoin();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void resetBalance(){
		this.balance = 0;
	}

	public void increaseBalance(int val){
		this.balance += val;
	}

	void setState(State state) {
		this.state = state;
	}


	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			this.count = this.count - 1;
			this.balance -= this.cost;
		}
	}

	int getCount() {
		return count;
	}

	public boolean isEnoughBalance(){
		return this.balance >= this.cost;
	}

	public int getBalance(){
		return this.balance;
	}

	void refill(int count) {
		this.count = count;

		if (state instanceof HasCoinState){
			this.state.ejectCoin();
		}

		resetBalance();
		state = noCoinState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nBalance: " + this.balance + ", Cost: " + this.cost);
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
