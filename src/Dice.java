import java.util.Random;

public class Dice {
    private int sides;
    private Random random = new Random();

    private boolean state = true;

    private int previousRol = 0;

    public Dice(int sides) {
        this.sides = sides;
    }

    public Dice() {
        this.sides = 6;
    }

    public int getSides() {
        return sides;
    }

    public int getPreviousRol() {
        return previousRol;
    }

    public void rollDice() {

        previousRol = random.nextInt(sides)+1;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
