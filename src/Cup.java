public class Cup {

    int diceAmount = 0;

    Dice[] dices;

    public Cup(int diceAmount) {
        this.diceAmount = diceAmount;

        dices = new Dice[diceAmount];

        for (int i = 0; i < dices.length; i++) {

            dices[i] = new Dice();
        }
    }

    public void sortDices() {

        Dice temp;

        for (int j = 0; j < dices.length; j++) {

            for (int i = 0; i < dices.length - 1; i++) {

                if (dices[i].getPreviousRol() < dices[i + 1].getPreviousRol()) {

                    temp = dices[i];
                    dices[i] = dices[i + 1];
                    dices[i + 1] = temp;
                }
            }
        }
    }

    public void rollAllDice() {

        for (Dice dice : dices) {

            dice.rollDice();
        }
    }

    public void showAllDice() {

        for (Dice dice : dices) {
            if (dice.isState() == true) {
                System.out.print(dice.getPreviousRol() + ", ");
            }
        }
    }

    public void removeDice(int number) {

        for (Dice dice : dices) {

            if (dice.getPreviousRol() == number) {

                dice.setState(false);
            }
        }
    }

    public void showRemoved() {

        for (Dice dice : dices) {
            if (dice.isState() == false) {
                System.out.print(dice.getPreviousRol() + ", ");
            }
        }
    }
}
