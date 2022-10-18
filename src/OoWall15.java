//Write a class with the name Wall. The class needs two fields (instance variables) with name width
 // and height of type double.
public class OoWall15 {

    OoWall15() {
        System.out.println("constructor initialize");
    }
    double width;
    double height;
    OoWall15(double width, double height) {
        this.width = width;
        this.height = height;
        if (width == 0) {
            this.width = 0;
        }
        if (height == 0) {

            this.height = 0;
        }
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        if (width < 1) {
            width = 0;
        }
        this.width = width;
    }
    public void setHeight(double height) {
        if (height < 1) {
            height = 0;
        }
        this.height = height;
    }
    public double getArea() {
        double area = getHeight() * getWidth();
        return area;
    }
    public static void main(String[] args) {

        OoWall15 wall = new OoWall15(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }


}


