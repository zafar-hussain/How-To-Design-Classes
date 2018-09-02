// represent computer images
public class Image
{
    private int height;     // pixels
    private int width;      // pixels
    private String source;  // file name
    private String quality; // informal

    // constructor
    public Image(int height, int width, String source, String quality)
    {
        this.height = height;
        this.width = width;
        this.source = source;
        this.quality = quality;
    }

    // Examples
    Image baseCase = new Image(0, 0, "", "");
    Image aPortrait = new Image(100, 50, "test", "my house");
    Image aLandScape = new Image(50, 100, "hi", "low");


//    1. isPortrait, which determines whether the image’s height is larger than  its width;
    // isPortrait : Image -> boolean
    // returns true if this.height >= this.width

    boolean isPortrait() {return false;} // stub


//    2. size, which computes how many pixels the image contains;
//    3. isLarger, which determines whether one image contains more pixels
//        than some other image; and
//    4. same, which determines whether this image is the same as a given
//    one.
//    Also draw a complete class diagram
}