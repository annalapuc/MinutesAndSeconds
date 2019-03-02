public class SecondAndMinutes {
    public static String getDurationString(int minutes, int seconds){
        if(minutes>=0&&seconds>=0&&seconds<=59){
           int hours=(int)minutes/60;
           int remainingMinutes=(int)minutes%60;


            return minutes+" m = "+hours+"h "+remainingMinutes+"m "+seconds+"s";
        }else{

            return "Invalid value";
        }
    }
    public static String getDurationString(int seconds){
        if(seconds>=0){
            int minutes=(int)seconds/60;
            int remainingSeconds=(int)seconds%60;
            return getDurationString(minutes,remainingSeconds);
        } else {
            return "Invalid value";
        }
    }
}
