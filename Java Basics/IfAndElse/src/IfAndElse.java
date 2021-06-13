public class IfAndElse {
    public static void main(String args[]){
        boolean gameOver=true;
        int score=8000;
        int levelCompleted=5;
        int bonus=100;
//        if((score>7000)&&(score<9000))
//        {
//            System.out.println("your score is greater than 7000 and less than 9000");
//        }else if(score>10000){
//            System.out.println("your score is greater than 10000");
//        }else
//        {
//            System.out.println("Got here");
//        }
        if (gameOver==true){
            int finalScore=score+(levelCompleted*bonus);
            finalScore+=500;
            System.out.println("your final score is=" +finalScore);
        }

//CodeChallenge---->Method 1
//        boolean newGameOver=true;
//        int newScore=10000;
//        int newLevelCompleted=8;
//        int newBonus=200;
//        if(newGameOver==true){
//            int TotalScore=newScore+(newLevelCompleted*newBonus);
//            System.out.println(" your total Score is=" +TotalScore);
//        }


        //Method------->2
        score=10000;
        levelCompleted=8;
        bonus=200;

        if (gameOver==true){
            int finalScore=score+(levelCompleted*bonus);
            finalScore+=300;
            System.out.println("your final score is=" +finalScore);
        }

    }
}
