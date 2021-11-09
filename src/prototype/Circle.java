package prototype;

public class Circle extends Shape {
    private int radius;

    private Circle(Circle circle) {
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Circle copy() {
        return null;
    }
}
