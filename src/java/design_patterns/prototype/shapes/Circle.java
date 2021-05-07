package design_patterns.prototype.shapes;

import java.util.Objects;

public class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    public Circle(Circle clone) {
        super(clone);
        if (clone != null) {
            this.radius = clone.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
