public class Operators {
    public static void main(String args[])
    {
        int result=3+7;
        System.out.println("3 + 7 =" +result);
        int previousResult=result;
        System.out.println("previousResult = " +previousResult);
        result=result-1;
        System.out.println("10-1 =" +result);
        System.out.println("previousResult = " +previousResult);

        result=result*3;
        System.out.println("9 * 3 =" +result);

        result=result/3;
        System.out.println("27/3 =" +result);

        result=result%5;
        System.out.println("9 % 5 =" +result);

        result++; //result=result+1, (4+1=5)
        System.out.println("4+1=" +result);

        result--; //result=result-1, (5-1=4)
        System.out.println("5-1 =" +result);

        result+=2; //result=result+2, (4+2=6)
        System.out.println("4+2 =" +result);

        result*=3; //result=result*3, (6*3=18)
        System.out.println("6*3 =" +result);

        result/=9; //result=result/3,(19/9=2)
        System.out.println("19/9 =" +result);

        result-=1; //result=result-1, (2-1=1)
        System.out.println("2-1 =" +result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("it's not an Alien");
            System.out.println("I'm Scared of Alien");
        }

        int topScore=90;
        if(topScore==90)  //!=, > , >= , <= ,
        {
            System.out.println("you got a high score");
        }

        int secondTopScore=89;
        if((topScore > secondTopScore) &&  (secondTopScore < 100)) //true && true
        {
            System.out.println("greater than second top score and less than 100");
        }

        if((topScore < 20)||(secondTopScore > 120))
        {
            System.out.println(" either both of the values false"); //false || false
        }
        int newValue=70;
        if(newValue==70)
        {
            System.out.println("newValue is true");
        }
        boolean isCar=false;
        if(!isCar)
        {
            System.out.println("isCar is false");
        }

        isCar=true;
        boolean wasCar=isCar?true:false;
        if(wasCar){
            System.out.println("wasCar is true");
        }

        int ageOfClient=10;
       boolean isEighteenOrOver=(ageOfClient<20)?true:false;
        if(isEighteenOrOver)
        {
            System.out.println("ageOfClient is true");
        }
    }
}
