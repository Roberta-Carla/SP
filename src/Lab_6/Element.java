package Lab_6;

public interface Element {

    void accept(Visitor visitor);
    void print();
}