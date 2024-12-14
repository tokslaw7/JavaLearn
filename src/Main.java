public class Main {

    public static void main(String[] args) {

    /*
    The formula for a triangle is (base * height) / 2
    So lets define 2 variables for the needed values and do the calculation below
    */

        double area = calculateArea(3.5, 7.0);
        System.out.println("The area of the triangle 1 is " + area);

        area = calculateArea(4.0, 10.0);
        System.out.println("The area of the triangle 2 is " + area);

        area = calculateArea(12.0, 3.0);
        System.out.println("The area of the triangle 3 is " + area);

    }

    public static double calculateArea(double triangleBase, double triangleHeight){
        double area = triangleBase * triangleHeight;
        area = area / 2;

        return area;
    }
}