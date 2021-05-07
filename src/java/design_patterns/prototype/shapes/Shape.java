package design_patterns.prototype.shapes;

import java.util.Objects;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape() {
    }
    public Shape(Shape clone) {
        if (clone != null) {
            this.x = clone.x;
            this.y = clone.y;
            this.color = clone.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return x == shape.x && y == shape.y && Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
