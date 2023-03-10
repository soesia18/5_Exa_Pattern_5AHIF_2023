package at.kaindorf.pattern.decorator;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 06. März 2023<br>
 * <b>Time:</b> 12:00<br>
 */

public abstract class MilkDecorator extends Coffee {
    protected Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
