package design_patterns.prototype.shapes;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle clone) {
        super(clone);
        if (clone != null) {
            this.width = clone.width;
            this.height = clone.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
