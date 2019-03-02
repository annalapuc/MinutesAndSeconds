public class Main {
    public static void main(String[] args) {
        String SecAndMin = SecondAndMinutes.getDurationString(61, 0);
        System.out.println(SecAndMin);
        SecAndMin = SecondAndMinutes.getDurationString(3669);
        System.out.println(SecAndMin);
    }


}
