public class positiveNegativeZero {
    public static void main(String args[]){
       checkNumber(8);
       checkNumber(-3);
    }
    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("positive");
        }
        else if(number < 0){
            System.out.println("negative");
        }
       else if(number==0) {
            System.out.println("zero");
        }
    }
}
