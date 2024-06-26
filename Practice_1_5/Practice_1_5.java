public class Practice_1_5 {
    public static void main(String[] args) {
        double miles = 75;
        double minutes = 50;
        double hours = minutes / 60.0;
        double kilometers = miles * 1.6;
        double speed = kilometers / hours;

        System.out.println("Average speed in km/h: " + speed);
    }
}
