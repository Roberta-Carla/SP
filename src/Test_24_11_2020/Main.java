package Test_24_11_2020;

public class Main {

    public static void main(String[] args) throws Exception {

        Fisier c1 = new Fisier("sfsdfdsfdsf");
        Fisier c2 = new Fisier("afafad");

        c1.setStrategy(new AlignCenter());
        c2.setStrategy(new AlignLeft());

        c1.render();
        c2.render();

        Mp3 mp3=new Mp3("music");
        Mp3 mp4=new Mp3("music1");
        Svg svg=new Svg("svg");

    }
   /*<<<<sfsdfdsfdsf>>>>
            <<<<afafad*/

}
