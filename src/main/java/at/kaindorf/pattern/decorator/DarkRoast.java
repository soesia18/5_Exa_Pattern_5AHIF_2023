package at.kaindorf.pattern.decorator;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 06. März 2023<br>
 * <b>Time:</b> 11:58<br>
 */

public class DarkRoast extends Coffee {
    @Override
    public String getDescription() {
        return "Dark-roast coffee";
    }

    @Override
    public double getCosts() {
        return 1.99;
    }
}
