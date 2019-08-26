public class NonfictionBook extends Book
{
    //VARIABLES
    String field = "";
    int deweyDecimal = 0;

    //int pages = 0, idNumber = 0, String title = "", author = "", boolean ifAvailable, int field, int deweyDecimal
    //CONSTRUCTOR
    public NonfictionBook()
    {
        pages = 0; 
        idNumber = 0;
        title = "";
        author = "";
        ifAvailable = false;

        field = "Something secret";
        deweyDecimal = 0;
    }

    public NonfictionBook(int pages, int idNumber, String title, String author, boolean ifAvailable, String field, int deweyDecimal)
    {
        this.pages = pages;
        this.idNumber = idNumber;
        this.title = title;
        this.author = author;
        this.ifAvailable = ifAvailable;

        this.field = field;
        this.deweyDecimal = deweyDecimal;
    }

    //GETTERS
    public String getAuthor ()
    {
        return author;
    }
    
    public String getField() 
    {
        return field;
    }
    public String getTitle ()
    {
        return title;
    }

    //SETTERS
    public void setField (String field) 
    {
        this.field = field;
    }

    public void setDecimal (int deweyDecimal) 
    {
        this.deweyDecimal = deweyDecimal;
    }

    //BRAIN METHODS
    @Override
    public String toString() 
    {
        return "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "ISBN: " + idNumber + "\n" +
               "Field: " + field + "\n" +
               "Dewey Decimal: " + deweyDecimal + "\n" +
               "Is Available: " + ifAvailable;
    }
}
