package Test_24_11_2020;

public class Txt implements Element{

    private String name;
    private Test_24_11_2020.Strategy s;

    public Txt(String name){
        this.name=name;
    }

    public void print(){

        if(s==null) {
            System.out.println(this.name);
        }else{
            s.render(this.name);
        }
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setAlignStrategy(Test_24_11_2020.Strategy s){
        this.s=s;
    }

}
