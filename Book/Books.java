import java.util.ArrayList;

public class Books
{
    ArrayList<Book> books=new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void getBooksOfAuthor(String author) {
        for (Book book: books) {
            if (book.getAuthor().contains(author)){
            System.out.println("Книга getBooksOfAuthor: " + book.getName());
        }
      }
    }

    public void getBooksOfPublishingHouse(String publishingHouse) {
        for (Book book:books) {
            if(book.getPublishingHouse().contains(publishingHouse))
            {
                System.out.println("Книга getBooksOfPublishingHouse: " + book.getName());
            }
        }
    }

    public void getBooksAfterOfYear(int year)
    {
        for (Book book:books) {
         if (book.getYearOfPublishing()>year){
             System.out.println("Книга getBooksAfterOfYear: " + book.getName());
         }
        }
    }
}
