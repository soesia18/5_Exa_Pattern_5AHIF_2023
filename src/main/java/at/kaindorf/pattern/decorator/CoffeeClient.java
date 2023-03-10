package at.kaindorf.pattern.decorator;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 06. März 2023<br>
 * <b>Time:</b> 12:10<br>
 */

public class CoffeeClient {
    public static void main(String[] args) {
        Coffee myCoffee = new DarkRoast();
        System.out.println(myCoffee);

        myCoffee = new WhipCreamDecorator(myCoffee);
        System.out.println(myCoffee);

        myCoffee = new SoyDecorator(new WhipCreamDecorator(new Decaf()));
        System.out.println(myCoffee);
    }
}
