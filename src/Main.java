public class Main {
    public static void main(String[] args) {
        double triangleBase = 3.5;
        double triangleHeight = 7.0;

        double area = triangleBase * triangleHeight;
        area = area / 2;

        //triangle 2
        double triangleBase2 = 4.0;
        double triangleHeight2 = 10.0;

        double area2 = triangleBase2 * triangleHeight2 ;
        area2 = area2 / 2;

        //triangle 3
        double triangleBase3 = 12.0;
        double triangleHeight3 = 3.0;

        double area3 = triangleBase3 * triangleHeight3;
        area3 = area3 / 2;

        System.out.println("The area of the triangle is " + area);
        System.out.println("Area of Triangle 2: " + area2);
        System.out.println("Area of Triangle 3: " + area3);
    }
}
