package Lab_5;

public class ImageProxy implements Element {
    private String url;
    Image realImage;

    ImageProxy(String url){
        this.url=url;
    }

    public void print() {
        if(realImage==null){
            realImage = new Image(this.url);
        }
        realImage.print();
    }

    public void ImageProxy(String url)
    {
        if(url.toLowerCase().endsWith(("bmp")))
        {
            return ;
        }
        if (url.toLowerCase().endsWith("jpg"))
        {
            return;
        }
        if (url.toLowerCase().endsWith("png"))
        {
            return;
        }

    }
}

