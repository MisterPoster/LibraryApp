public class FictionBook extends Book
{
    //VARIABLES
    String genre = "";
    boolean hasPictures = false;

    //int pages = 0, idNumber = 0, String title = "", author = "", boolean ifAvailable, String genre, int deweyDecimal
    //CONSTRUCTORS
    public FictionBook ()
    {
        pages = 0; 
        idNumber = 0;
        title = "";
        author = "";
        ifAvailable = false;

        genre = "Something fictional";
        hasPictures =  false;
    }

    public FictionBook (int pages, int idNumber, String title, String author, boolean ifAvailable, String genre, boolean hasPictures)
    {
        this.pages = pages; 
        this.idNumber = idNumber;
        this.title = title;
        this.author = author;
        this. ifAvailable = ifAvailable;

        this.genre = genre;
        this.hasPictures =  hasPictures;
    }

    //GETTERS
    public String getAuthor ()
    {
        return author;
    }
    
    public String getGenre() 
    {
        return genre;
    }
    public String getTitle ()
    {
        return title;
    }

    //SETTERS
    public void setGenre (String genre) 
    {
        this.genre = genre;
    }

    public void setHasPictures (boolean hasPictures) 
    {
        this.hasPictures = hasPictures;
    }

    //BRAIN METHODS
    @Override
    public String toString () 
    {
        return "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "ISBN: " + idNumber + "\n" +
               "Genre: " + genre + "\n" +
               "Pictures included: " + hasPictures + "\n" +
               "Is Available: " + ifAvailable;
    }
}
