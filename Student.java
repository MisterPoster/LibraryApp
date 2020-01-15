public class Student
{
  int id = 0;
  String name = "";
  Book[] collection;
  
  public Student (int id, String name)
  {
    this.id = id;
    this.name = name;
  }
  
  public Book[] setCollection(int size)
  {
    collection = new Book[size];
  }
  
  public void getCollection()
  {
    for(int i = 0; i < size; i++)
    {
      Sytem.out.println(collection[i]);
    }
    System.out.println();
  }
  
  public void addToCollection(Book b, int index)
  {
    collection[index] = b;
  }
  
  public String toString()
  {
    return "Name: " + name + "/n" +
           "ID: " + id;
  }
}
