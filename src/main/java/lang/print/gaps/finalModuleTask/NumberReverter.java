package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reversed100 = (number % 10) * 100;
        int reversed10 = (number / 10 % 10) * 10;
        int reversed1 = number / 100 % 10;
        int reversed = reversed100 + reversed10 + reversed1;
        System.out.println(reversed);
    }
    public static void main(String[] args) { 
        NumberReverter reversedNumber = new NumberReverter();
        reversedNumber.revert(489);

    }
}
