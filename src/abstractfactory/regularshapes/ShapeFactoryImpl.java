package abstractfactory.regularshapes;

import abstractfactory.Shape;
import abstractfactory.ShapeFactory;

public class ShapeFactoryImpl implements ShapeFactory {

    @Override
    public Shape make(String shapeName) {
        switch (shapeName) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
        }

        return null;
    }

}
