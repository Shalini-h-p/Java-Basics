public class OperatorsExc {
    public static void main(String args[]) {
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double myTotal = (firstValue + secondValue) * 100.00d;
        System.out.println("myTotal is =" + myTotal);
        double theRemainder = myTotal % 40.00d;
        System.out.println("theRemainder =" + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder =" + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("got some remainder");
        }
    }
}
