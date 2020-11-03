package Lab_5;

import Lab_4.Author;
import Lab_4.Element;

import java.util.ArrayList;

public class Book {

    private String title;
    private ArrayList<Lab_4.Element> content = new ArrayList<>();
    private ArrayList<Lab_4.Author> authors = new ArrayList<>();

    Book(String title){
        this.title=title;
    }

    public void addContent(Lab_4.Element elm){
        content.add(elm);
    }

    public void addAuthor(Lab_4.Author author){
        authors.add(author);
    }

    public void print(){
        System.out.println("Book title: "+this.title);
        printAuthors();
        for(Element i:content){
            i.print();
        }
    }


    private void printAuthors(){
        for (Author i: authors){
            i.print();
        }
    }

}