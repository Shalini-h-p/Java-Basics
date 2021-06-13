public class players {
    public static void main(String[] args) {

        int highScorePosition = claculateHighScorePosition(1500);
        displayHighScorePosition("shalu", highScorePosition);

        highScorePosition = claculateHighScorePosition(900);
        displayHighScorePosition("anju", highScorePosition);

        highScorePosition = claculateHighScorePosition(500);
        displayHighScorePosition("raju", highScorePosition);

        highScorePosition = claculateHighScorePosition(50);
        displayHighScorePosition("rakshi", highScorePosition);

        highScorePosition = claculateHighScorePosition(1000);
        displayHighScorePosition("gowda", highScorePosition);

        highScorePosition = claculateHighScorePosition(400);
        displayHighScorePosition("bharath", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "managed to get into position" + highScorePosition + "high score position on the table");

    }


    public static int claculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >=500 && playerScore < 1000) {
//            return 2;
//        } else if (playerScore >=100 && playerScore < 500) {
//            return 3;
//        } else {
//            return 4;
//        }
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}


