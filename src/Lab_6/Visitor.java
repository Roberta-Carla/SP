package Lab_6;

public interface Visitor {
    public abstract void visit(Image image);
    public abstract void visit(ImageProxy imageproxy);
    public abstract void visit(Paragraph paragraph);
    public abstract void visit(Table table);

}
