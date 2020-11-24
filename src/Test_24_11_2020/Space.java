package Test_24_11_2020;

public class Space implements Visitor{

    int txtSize=0,svgSize=0,mp3Size=0,total_size=0,directoare=0;

    public void visit(Txt txt) {
        total_size+=5;
        txtSize+=5;
    }
    public void visit(Mp3 mp3) {
        total_size+=3000;
        mp3Size+=3000;
    }
    public void visit(Svg svg) {
        total_size+=45;
        svgSize+=45;
    }

    public void visit(Director director){
        directoare++;
    }

    public void printSizes(){
        System.out.println(total_size+" Kb"+directoare+" directories. \n " +txtSize+"Svg  "+svgSize+" Mp3"+mp3Size);
    }

}
