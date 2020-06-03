package Factory.common;


public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageTypes){
        if(imageTypes == null){
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        switch (imageTypes){
            case BMP: return new BmpReader();
            case JPG: return new JpgReader();
            case PNG: return new PngReader();
            default:throw new IllegalArgumentException("Неизвестный тип картинки");

        }

    }
}