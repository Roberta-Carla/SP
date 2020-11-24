package Lab_6;

public class BookStatistics implements Visitor{

    int sectionCounter=0;
    int imageCounter=0;
    int tableCounter=0;
    int paragraphCounter=0;

    public void visit(Image image){imageCounter++;}

    public void visit(Section section){sectionCounter++;}

    public void visit(ImageProxy imageProxy){imageCounter++;}

    public void visit(Paragraph paragraph){paragraphCounter++;}

    public void visit(Table table){tableCounter++;}

    public void printStatistics(){
        System.out.println("Book Statistics: ");
        System.out.println("Number of images: "+ imageCounter);
        System.out.println("Number of tables: "+ tableCounter);
        System.out.println("Number of paragraphs: "+ paragraphCounter);
        System.out.println("Number of sections: "+ sectionCounter);
    }
}