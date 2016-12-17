public class RectangleRunner
{
    public static void main(String[] args)
    {

        Rectangles rectangles = new Rectangles();
        rectangles.addRectangle(new Rectangle(10., 20.));
        rectangles.addRectangle(new Rectangle(5., 4.));
        rectangles.addRectangle(new Rectangle(30., 10.));
        rectangles.printAll();
        System.out.println("sumArea = " + rectangles.getSumArea());

        Rectangle r = new Rectangle(10., 20.);
        System.out.println("rectangle = " + r);
        System.out.println("width = " + r.getWidth());
        System.out.println("height = " + r.getHeight());
        System.out.println("perimeter = " + r.getPerimeter());
        System.out.println("area = " + r.getArea());


    }
}
