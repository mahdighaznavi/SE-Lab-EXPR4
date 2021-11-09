package prototype;

public class Rectangle extends Shape{
    private int width, height;

    private Rectangle(Rectangle rectangle){
    }

    public Rectangle(){

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public Rectangle copy() {
        return null;
    }
}
