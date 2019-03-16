public class Padding {


    private static Padding instance;

    private Padding(){}

    public static Padding getInstance(){
        if (instance == null){
            instance = new Padding();
        }
        return instance;
    }

    public String padLines(int num) {
        StringBuilder lines = new StringBuilder() ;
        for ( int i = 0; i < num; i++ ) {
            lines.append("\n");
        }
        return lines.toString();
    }


    public String padSpaces(int num) {
        StringBuilder spaces = new StringBuilder() ;
        for ( int i = 0; i<num; i++ ) {
            spaces.append(" ");
        }
        return spaces.toString();
    }



}
