package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first = number/1000;
        int second = (number/100)%10;
        int third = (number%100)/10;
        int fourth = number%10;
        System.out.println(first + second + third + fourth);
    }
}
