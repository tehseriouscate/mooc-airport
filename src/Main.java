import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.

//        ----- String for future automated test -------
//        String test = "kk-DD\n" + "80\n"
//                + "lot-20\n" + "34\n" + "x\n" + "x\n";


        Scanner reader = new Scanner(System.in);
        UserInterface program = new UserInterface(reader);

        program.start();




    }
}
