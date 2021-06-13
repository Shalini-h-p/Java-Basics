public class DurationString {

     private static final String INVALID_VALUE_MESSAGE="invalid value";
    public static void main(String[] args) {
        System.out.println(getDuration(65, 45));
        System.out.println(getDuration(3945L));
        System.out.println(getDuration(-51));
        System.out.println(getDuration(65, 9));
    }

    private static String getDuration(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString=hours+"h";
        if(hours<10){
            hoursString="0"+hoursString;
        }

        String minutesString=minutes+"m";
        if(remainingMinutes<10){
            minutesString="0"+minutesString;
        }

        String secondsString=seconds+"s";
        if(seconds<10){
            secondsString="0"+secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString + " ";
    }

    private static String getDuration(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDuration(minutes, remainingSeconds);
    }
}