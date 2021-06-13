public class StringsInJava {
    public static void main(String args[])
    {
        String myString = "The less Confidence you have";
        System.out.println("myString is equal to" +myString);
        myString = myString +",the more serious you act!";
        System.out.println("myString is equal to" +myString);
        myString =myString +"\u00A9 life is a journey 2021";
        System.out.println("myString is equal to" +myString);

        String numberString="450.65";
        numberString = numberString+ "238.86";
        System.out.println("numberString is equal to"+numberString);

       String lastString= "80";
       int myInt=10;
       lastString=lastString+myInt;
       System.out.println("lastString is equal to"+lastString);
       
       double doubleNumber=140.54d;
       lastString=lastString+doubleNumber;
       System.out.println("doubleNumber is equal to"+lastString);
    }
}
