package Test_24_11_2020;

public class Mp3 implements Element{

    private String name;

    public Mp3(String name){
        this.name=name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void print() {
        System.out.println(this.name);
    }
}

