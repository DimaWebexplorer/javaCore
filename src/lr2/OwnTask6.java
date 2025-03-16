package lr2;

public class OwnTask6 {
    public interface Shape {
        double calculateArea();
        double calculatePerimeter();
    }
    public static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            if (radius < 0) {
                throw new IllegalArgumentException("Radius must be non-negative.");
            }
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    public static class Square implements Shape {
        private double side;

        public Square(double side) {
            if (side < 0) {
                throw new IllegalArgumentException("Side must be non-negative.");
            }
            this.side = side;
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side * side;
        }

        @Override
        public double calculatePerimeter() {
            return 4 * side;
        }
    }

    public static class Triangle implements Shape {
        private double sideA;
        private double sideB;
        private double sideC;

        public Triangle(double sideA, double sideB, double sideC) {
            if (sideA < 0 || sideB < 0 || sideC < 0) {
                throw new IllegalArgumentException("Sides must be non-negative.");
            }
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        public double getSideA() {
            return sideA;
        }

        public void setSideA(double sideA) {
            this.sideA = sideA;
        }

        public double getSideB() {
            return sideB;
        }

        public void setSideB(double sideB) {
            this.sideB = sideB;
        }

        public double getSideC() {
            return sideC;
        }

        public void setSideC(double sideC) {
            this.sideC = sideC;
        }

        @Override
        public double calculateArea() {
            double s = (sideA + sideB + sideC) / 2;
            return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        }

        @Override
        public double calculatePerimeter() {
            return sideA + sideB + sideC;
        }
    }

    public static void printProperties(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        printProperties(circle);

        Square square = new Square(4);
        System.out.println("\nSquare:");
        System.out.println("Side: " + square.getSide());
        printProperties(square);

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("\nTriangle:");
        System.out.println("Sides: " + triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC());
        printProperties(triangle);
    }

}
