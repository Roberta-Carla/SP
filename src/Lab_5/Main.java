package Lab_5;

public class Main {

    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);

        //alt exemplu
//        Section cap2 = new Section("Capitolul 2");
//        Paragraph p5 = new Paragraph("Paragraph 5");
//        Paragraph p6 = new Paragraph("Paragraph 6");
//        Paragraph p7 = new Paragraph("Paragraph 7");
//        cap2.add(p5);
//        cap2.add(p6);
//        cap2.add(p7);

        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();
//        cap2.print();
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

//        p5.setAlignStrategy(new AlignRight());
//        p6.setAlignStrategy(new AlignCenter());
//        p7.setAlignStrategy(new AlignLeft());

        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print();
        //cap2.print();
    }
}
