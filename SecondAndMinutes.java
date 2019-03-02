public class SecondAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int minutes, int seconds) {

        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = (int) minutes / 60;
            int remainingMinutes = (int) minutes % 60;

            String hoursString = hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString = remainingMinutes + "h";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "h";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            return minutes + " m = " + hoursString + " " + minutesString + " " + secondsString + "";

        } else {

            return INVALID_VALUE_MESSAGE;
        }
    }

    public static String getDurationString(int seconds) {

        if (seconds >= 0) {
            int minutes = (int) seconds / 60;
            int remainingSeconds = (int) seconds % 60;

            return getDurationString(minutes, remainingSeconds);

        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }
}
