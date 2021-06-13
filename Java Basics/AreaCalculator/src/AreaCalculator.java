public class AreaCalculator {
    public static void main(String args[]) {
        System.out.println(areaCalculator(5.0));
        System.out.println(areaCalculator(4.0, 5.0));
        System.out.println(areaCalculator(-1));
        }

    public static double areaCalculator(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            return radius * radius * Math.PI;
        }
    }

    public static double areaCalculator(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            return x * y;
        }
    }
}
