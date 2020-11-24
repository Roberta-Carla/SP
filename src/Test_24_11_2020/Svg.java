package Test_24_11_2020;

public class Svg implements Element{
    String nume;

    public Svg(String n){
        nume=n;
    }

    public void print()
    {
        System.out.println(nume+" "+".svg");
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}