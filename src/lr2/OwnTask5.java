package lr2;

public class OwnTask5 {
    public static class Rectangle {
        private double height;
        private double width;

        public Rectangle(double height, double width) {
            if (height < 0 || width < 0) {
                throw new IllegalArgumentException("Height and width must be non-negative.");
            }
            this.height = height;
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getArea() {
            return height * width;
        }

        public double getPerimeter() {
            return 2 * (height + width);
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();
        rectangle.setHeight(7);
        rectangle.setWidth(12);
        System.out.println("newHeight: " + rectangle.getHeight());
        System.out.println("newWidth: " + rectangle.getWidth());
        System.out.println("newArea: " + rectangle.getArea());
        System.out.println("newPerimeter: " + rectangle.getPerimeter());
    }
}
