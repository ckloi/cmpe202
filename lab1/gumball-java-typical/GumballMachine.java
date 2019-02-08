
public class GumballMachine{

    private int num_gumballs;
    private boolean has_quarter;
    private int coin_balance;
    private int[] acceptable_coins;
    private int cost;

    public GumballMachine( int size){
        // initialise instance variables
        this(size,25);
    }

    public GumballMachine( int size, int c ){
        // initialise instance variables
        this.num_gumballs = size;
        this.coin_balance = 0;
        this.acceptable_coins = new int[]{1,5,10,25};
        this.cost = c;
    }

    public void insertQuarter(int coin){

        for (int i = 0; i < this.acceptable_coins.length; i++){
            if (coin == this.acceptable_coins[i]){
                this.coin_balance += acceptable_coins[i];
                break;
            }
        }

    }

    public void turnCrank(){
    	if (this.coin_balance > 0){
    		if (this.num_gumballs > 0 && this.coin_balance >= this.cost){
    			this.num_gumballs-- ;
    			this.coin_balance -= this.cost ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
        else if (this.coin_balance < this.cost){
          System.out.println( "Not enough coins." ) ;
        }
    		else{
          this.coin_balance = 0;
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}else{
    		System.out.println( "Please insert a coins" ) ;
    	}
    }
}
