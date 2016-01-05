import java.util.Scanner;

/**
 * Created by HSH on 15. 11. 5..
 */
public class Input {


    private final Scanner scanner;
    private int howManyNumber;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public void inputNumber(){
        howManyNumber = scanner.nextInt();
    }

    public int getHowManyNumber() {
        return howManyNumber;
    }
}
