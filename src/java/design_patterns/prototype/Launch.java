package design_patterns.prototype;

import design_patterns.prototype.shapes.Circle;
import design_patterns.prototype.shapes.Rectangle;
import design_patterns.prototype.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Launch {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);;
        circle.setRadius(15);
        circle.setColor("red");
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        rectangle.setColor("blue");
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects ");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical");
                } else {
                    System.out.println(i + ": But they are not identical");
                }
            } else {
                System.out.println(i + ": Shape objects are the same");
            }
        }
    }

}
