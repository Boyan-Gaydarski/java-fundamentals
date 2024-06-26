public class DiceMain {
    public static void main(String[] args) {
        Dice dice1 = new Dice(20);
        Dice dice2 = new Dice(10);

        System.out.println(dice1.roll());

        System.out.println(dice1.getSides());
        dice1.setSides(20);
        dice2.setSides(10);

        System.out.println(dice1.roll());
        System.out.println(dice2.roll());
    }
}
