package innerclassexample;

import java.util.Scanner;

public class StartupInnerClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberHandler nh = new NumberHandler();
        String numberInput;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            numberInput = keyboard.nextLine();
            nh.addToTheList(numberInput);
        }

        nh.evaluateTheNumberList();
        
        System.out.println(nh);
        
    }
}
