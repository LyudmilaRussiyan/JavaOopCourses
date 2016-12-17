public class BooksRunner
{
    public static void main(String[] args)
    {
      Books books=new Books();

      books.add(new Book("Mermaid","Andersen", "W@D", 2015));
      books.add(new Book("Shopoholic","Kinsella","W@D", 2014));
      books.add(new Book("Thumbelina","Andersen","H@M", 2013));

      System.out.println("Expecting: 2 times of Andersen");
      books.getBooksOfAuthor("Andersen");
      System.out.println("\n\n");

      System.out.println("Expecting: 2 times of WD");
      books.getBooksOfPublishingHouse("W@D");
      System.out.println("\n\n");

      System.out.println("Expecting: 1 times of 2015");
      books.getBooksAfterOfYear(2014);
    }
}
