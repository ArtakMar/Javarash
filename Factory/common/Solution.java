package Factory.common;




public class Solution {
    public static void main(String[] args) {

        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
