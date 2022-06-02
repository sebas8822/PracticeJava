public class Rectangle {

    private double width = 1;
    private double height = 1;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double areaRect() {
        double area = width*height;

        return area;
    }
    public double perRect() {
        double perimeter = 2*(width+height);

        return perimeter;
    }

}



