public class Rectangle {

    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        checkSize(width);
        checkSize(height);
        this.height = height;
        this.width = width;
    }

    private void checkSize (double size){
        if (size<=0){
            throw new IllegalArgumentException ("not positive size"+size);
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter(){
        return (height+width)*2;
    }

    public double getArea (){
        return height*width;
    }

    @Override
    public String toString()
    {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
