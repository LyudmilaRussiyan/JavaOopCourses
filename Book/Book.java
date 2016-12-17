public class Book
{
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfBook;
    private double price;
    private String typeOfCover;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public double getPrice() {
        return price;
    }

    public String getTypeOfCover() {
        return typeOfCover;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTypeOfCover(String typeOfCover) {
        this.typeOfCover = typeOfCover;
    }

    public Book(int id,
                String name,
                String author,
                String publishingHouse,
                int yearOfPublishing,
                int numberOfBook,
                double price,
                String typeOfCover)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfBook = numberOfBook;
        this.price = price;
        this.typeOfCover = typeOfCover;
    }

    public Book(String name, String author, String publishingHouse, int yearOfPublishing)
    {
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", numberOfBook=" + numberOfBook +
                ", price=" + price +
                ", typeOfCover='" + typeOfCover + '\'' +
                '}';
    }
}
