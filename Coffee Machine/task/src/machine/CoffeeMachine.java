package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int waterForCup = 200;
        int milkForCup = 50;
        int beansForCup = 15;

        System.out.println("Write how many ml of water the coffee machine has:");
        int waterInside = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkInside = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beansInside = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        System.out.println("For " + cups + " cups of coffee you will need:" );


        int cupsLeft = (waterInside/waterForCup + milkInside/milkForCup + beansInside/beansForCup)/3;

        //toDo
        if cupsLeft >= cups;
                then:

        System.out.println("Yes, I can make that amount of coffee");
        if else:
        System.out.println("No, I can make only " + cupsLeft + " cup(s) of coffee");
    }
}
