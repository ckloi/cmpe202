public class Coin {

    public static String coinToString(int coin) {

      switch (coin){
        case 25:
            return "quarter";
        case 10:
            return "dime";
        case 5:
            return "nickel";
        default:
          return "NULL";
      }

    }

}
