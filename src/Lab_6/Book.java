package Lab_6;
import java.util.ArrayList;
public class Book {

    public String title;
    public Author author;
    public ArrayList<Element> content=new ArrayList<>();
    Book(String t)
    {
        title=t;
    }
    public void addAuthor(Author a)
    {
        author=a;
    }

    public void addContent(Element elm)
    {
        content.add(elm);
    }
    public void print() {
        System.out.println("Book:"+title);
        System.out.println("Author:"+author.name);
        for(Element e: content
        ) {e.print();}
    }

}
