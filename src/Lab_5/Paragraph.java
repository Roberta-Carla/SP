package Lab_5;

public class Paragraph implements Element {

    private String name;
    private AlignStrategy alignStra;

    Paragraph(String name){
        this.name=name;
    }

    public void print(){

        if(alignStra==null)
           {
            System.out.println(this.name);
           }
        else
            {
            alignStra.render(this.name);
            }
    }

    public void setAlignStrategy(AlignStrategy alignStra){
        this.alignStra=alignStra;
    }
}
