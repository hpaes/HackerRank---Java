public class GuessTheGame {


    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Our number is pretty small.");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is out of range.");
        }
    }
    public static void main(String[] args) {
        
        howBigIsMyNumber(4);
        howBigIsMyNumber(11);
        howBigIsMyNumber(150);

    }
    
}