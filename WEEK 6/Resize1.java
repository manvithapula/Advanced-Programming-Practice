//RA221003010001 week 6 Q7
// Define the Resizable interface
interface Resizable1 {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
// Create the Rectangle class that implements Resizable
class Rectangle implements Resizable1 {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void resizeWidth(int newWidth) {
        if (newWidth > 0) {
            this.width = newWidth;
        } else {
            System.out.println("Invalid width value. Width should be greater than 0.");
        }
    }
    @Override
    public void resizeHeight(int newHeight) {
        if (newHeight > 0) {
            this.height = newHeight;
        } else {
            System.out.println("Invalid height value. Height should be greater than 0.");
        }
    }
    public void display() {
        System.out.println("Rectangle - Width: " + width + ", Height: " + height);
    }
}
public class Resize1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("Original Rectangle:");
        rectangle.display();
        // Resize the rectangle
        rectangle.resizeWidth(8);
        rectangle.resizeHeight(15);
        System.out.println("Resized Rectangle:");
        rectangle.display();
    }
}
