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


    /*
    1. isPortrait, which determines whether the image’s height is larger than  its width;
    isPortrait : Image -> boolean
    returns true if this.height >= this.width
    boolean isPortrait() {return false;} // stub
    */

    boolean isPortrait()
    {
        return this.height >= this.width;
    }


    /**
     * @return int
     * 2. size, which computes how many pixels the image contains;
     * returns product of image.height, image.width
     * int size () {return 0;} // stub
     */
    int size() {return this.height * this.width;}


    /**
     * @param img
     * @return boolean
     * <p>
     * 3. isLarger, which determines whether one image contains more pixels
     * returns true if Image1.size >= Image2.size
     * boolean isLarger (Image img){return false;} // stub
     */
    boolean isLarger(Image img) {return this.size() >= img.size();}


    /**
     * @param img
     * @return boolean
     * <p>
     * 4. same, which determines whether this image is the same as a given one.
     * returns true isEqual Image1 Image2
     * boolean same (Image img) {return false;} // stub
     */
    boolean same(Image img) {return this.equals(img);} // stub



//    Also draw a complete class diagram
}