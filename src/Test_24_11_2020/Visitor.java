package Test_24_11_2020;

public interface Visitor {
    public abstract void visit(Txt t);
    public abstract void visit(Svg svg);
    public abstract void visit(Mp3 mp3);
    public abstract void visit(Director dir);
}