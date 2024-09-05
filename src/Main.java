public class Main {
    public static void main(String[] args) {
        double m = 10.5;
        double n = 10.45;
        double target = 10;

        double distanceM = Math.abs(m - target);
        double distanceN = Math.abs(n - target);

        if (distanceM < distanceN) {
            System.out.println("Number " + m + " closer to 10");
        } else {
            System.out.println("Number " + n + " closer to 10");
        }
    }
}
