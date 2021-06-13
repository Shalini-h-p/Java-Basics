public class CatPlaying {
    public static void main(String args[]) {
        System.out.println(isCatPlaying(true, 10));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == false) {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            } else {
                return false;
            }
            }
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else {
                return false;
            }
        }
    }





