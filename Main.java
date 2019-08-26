class Main
{
  public static void main (String[] args) 
  {

    //int pages = 0, idNumber = 0, String title = "", author = "", boolean ifAvailable, int field, int deweyDecimal

    Book BriefHistory = new NonfictionBook (256, 9780553, "A Brief History of Time", "Stephen Hawking", true, "Popular science", 523);
    Book SpaceOdyssey = new FictionBook (221, 045300, "2001: A Space Odyssey", "Arthur C. Clarke", true, "Science fiction", false);
    Book apPsych = new TextBook (100, 9000, "AP Psychology Review", "idk", true, "AP Psychology", 11);
    Book apEnviro = new TextBook ();
    Book TheRepublic = new TextBook (330, 456, "The Republic", "Plato", false, "Philosophy Honors", 10);
    Book Crypto = new NonfictionBook (250, 140244328, "Crypto: How the Code Rebels Beat the Government", "Stephen Livy", true, "Computer Science", 100);
    Book AtlasShrugged = new FictionBook (1120, 1234567, "Atlas Shrugged", "Ayn Rand", true, "Dystopian thriller", false);
    Book FullmetalAlchemist = new FictionBook (300, 98765, "Fullmetal Alchemist - Volumes I, II, III", "Hiromu Arakawa", false, "Fantasy manga", true);

    Book[] Library = {BriefHistory, Crypto, apEnviro, TheRepublic, apPsych, AtlasShrugged, SpaceOdyssey, FullmetalAlchemist};

    for (Book b : Library)
    {
        System.out.println (b.toString () );
        System.out.println("-----------------------------");
    }

  }
} // END OF MAIN
