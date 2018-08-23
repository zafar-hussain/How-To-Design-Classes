// represent computer images
public class Image
{
    int height;     // pixels
    int width;      // pixels
    String source;  // file name
    String quality; // informal

    // constructor
    Image (int height, int width, String source, String quality)
    {
        this.height  = height;
        this.width   = width;
        this.source  = source;
        this.quality = quality;
    }

    public static void main (String[] args)
    {
        System.out.println("Image class");
    }
}