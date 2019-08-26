public class TextBook extends Book
{
    //VARIABLES
    int gradeLevel = 0;
    String subject = "";

    //int pages = 0, idNumber = 0, String title = "", author = "", boolean ifAvailable, String subject, int gradeLevel
    //CONSTRUCTORS
    public TextBook()
    {
        pages = 0; 
        idNumber = 0;
        title = "";
        author = "";
        ifAvailable = false;

        subject = "Something secret";
        gradeLevel = 0;
    }

    public TextBook(int pages, int idNumber, String title, String author, boolean ifAvailable, String subject, int gradeLevel)
    {
        this.pages = pages;
        this.idNumber = idNumber;
        this.title = title;
        this.author = author;
        this.ifAvailable = ifAvailable;

        this.subject = subject;
        this.gradeLevel = gradeLevel;
    }

    //GETTERS
    public String getAuthor ()
    {
        return author;
    }
    
    public String getSubject() 
    {
        return subject;
    }
    public String getTitle ()
    {
        return title;
    }

    //SETTERS
    public void setSubject (String subject) 
    {
        this.subject = subject;
    }

    public void setGradeLevel (int gradeLevel) 
    {
        this.gradeLevel = gradeLevel;
    }

    //BRAIN METHODS
    public String toString() 
    {
        return "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "ISBN: " + idNumber + "\n" +
               "Subject: " + subject + "\n" +
               "Grade Level: " + gradeLevel + "\n" +
               "Is Available: " + ifAvailable;
    }
}
