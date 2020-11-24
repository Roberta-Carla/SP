package Test_24_11_2020;
import java.util.ArrayList;

public class Director implements Element{

    private String name;
    private ArrayList<Element> content = new ArrayList<>();


    public Director(String name){
        this.name=name;
    }

    public void addContent(Element elem){
        content.add(elem);
    }

    public void accept(Visitor v){

        v.visit(this);
        for(Element i:content){
            i.accept(v);
        }

    }

    public void print() {
        System.out.println("Numele directorului: "+this.name+" si fisierul este:");
        for(Element i:content){
            i.print();
        }
    }
}
