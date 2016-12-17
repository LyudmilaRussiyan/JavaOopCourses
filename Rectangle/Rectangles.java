import java.util.ArrayList;


public class Rectangles
{
    private ArrayList<Rectangle> rectangles = new ArrayList<>();


    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public double getSumArea()
    {

        double sumArea = 0;
        for (Rectangle rectangle : rectangles)
        {
            sumArea += rectangle.getArea();
        }
        return sumArea;
    }

    public void printAll()
    {
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }

    public ArrayList<Rectangle> toList() {
        return new ArrayList<>(rectangles);
    }

    @Override
    public String toString()
    {
        return "Rectangles{" +
                "rectangles=" + rectangles +
                '}';
    }
}

