import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 *
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor
         */
        super();
    }

    /**
     * Constructor that takes a file name and creates the picture
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() +
                " height " + getHeight()
                + " width " + getWidth();
        return output;

    }

    // This is a provided example method
    /** Method to set the blue to 0 */
    public void zeroBlue() {
        Pixel[][] pixels = this.getPixels2D();
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                Pixel pix = pixels[row][col];
                pix.setBlue(0);
            }
        }
    }

    // *****************
    // Code for class
    // *****************

    // Using the zeroBlue method as a starting point, write the method keepOnlyBlue that
    // will keep **only** the blue values, that is, it will set the red and green values to zero
    public void keepOnlyBlue() {
        // YOUR CODE HERE
    }

    // Write the negate method to negate all the pixels in a picture. To negate a picture, set the red
    // value to 255 minus the current red value, the green value to 255 minus the current green value
    // and the blue value to 255 minus the current blue value.
    public void negate() {
        // YOUR CODE HERE
    }

    // Write the grayscale method to turn the picture into shades of gray. Set the red, green, and
    // blue values to the average of the current red, green, and blue values (add all three values and
    // divide by 3).
    public void grayscale() {
        // YOUR CODE HERE
    }

    // Write the mirrorCopy method which mirrors and copies the left side of the image
    // onto the right side of the image
    // Note: you should set the colors values of the pixel you are changing with the
    // setter methods rather than trying to copy the actual pixel
    public void mirrorCopy() {
        // YOUR CODE HERE
    }

    // Bonus — Explore the "water.jpg" picture in the images folder. Write a method
    // fixUnderwater() to modify the pixel colors to make the fish easier to see
    public void fixUnderwater() {
        // YOUR CODE HERE
    }

    // Challenge — Write the mirrorDiagonal method that mirrors just a square part of the picture
    // from bottom left to top right around a mirror placed on the diagonal line (the diagonal line
    // is the one where the row index equals the column index).
    // This will copy the triangular area to the left and below the diagonal line
    public void mirrorDiagonal() {
        // YOUR CODE HERE
    }

    /* Main method for testing - each class in Java can have a main
     * method
     */
    public static void main(String[] args) {
        Picture pic = new Picture("beach.jpg");
//        Picture pic = new Picture("water.jpg");

        // The explore method makes a pop-up window of the current picture
//        pic.explore();
        pic.zeroBlue();
        pic.explore();
    }

} // this } is the end of class Picture, put all new methods before this
