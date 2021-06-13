public class DataTypes {
public static void main(String[] args){
    int myValue=10000;

    int myMinIntValue=Integer.MIN_VALUE;
    int myMaxIntValue=Integer.MAX_VALUE;
    System.out.println("Integer Minimum Value=" +myMinIntValue);
    System.out.println("Integer Maximum Value=" +myMaxIntValue);
    System.out.println("Busted MAX Value=" +(myMaxIntValue+1));
    System.out.println("Busted MIN value=" +(myMinIntValue-1));

    int myMaxIntTest=2_147_483_647;


    byte myMinByteValue=Byte.MIN_VALUE;
    byte myMaxByteValue=Byte.MAX_VALUE;
    System.out.println("Byte minimum Value=" +myMinByteValue);
    System.out.println("Byte Maximum value=" +myMaxByteValue);

    short myMinShortValue=Short.MIN_VALUE;
    short myMaxShortValue=Short.MAX_VALUE;
    System.out.println("Short minimum Value=" +myMinShortValue);
    System.out.println("Short Maximum value=" +myMaxShortValue);

    long myLongValue=100L;
    long myMinLongValue=Long.MIN_VALUE;
    long myMaxLongValue=Long.MAX_VALUE;
    System.out.println("Long minimum Value=" +myMinLongValue);
    System.out.println("Long Maximum value=" +myMaxLongValue);

    long myBigLongLiteralValue=2_147_483_647_123L;
    System.out.println(myBigLongLiteralValue);

    short myShortLiteralValue=32767;

    int myTotal=(myMinIntValue/2);

    byte myNewMinByteValue= (byte) (myMinByteValue/2); //casting

    short myNewShortMinValue=(short)(myMinShortValue/2);
}
}
