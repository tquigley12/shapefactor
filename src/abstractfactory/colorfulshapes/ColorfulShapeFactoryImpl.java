package abstractfactory.colorfulshapes;

import abstractfactory.Shape;
import abstractfactory.ShapeFactory;

public class ColorfulShapeFactoryImpl implements ShapeFactory {

    @Override
    public Shape make(String shapeName) {
        switch (shapeName) {
            case "circle":
                return new ColorfulCircle();
            case "square":
                return new ColorfulSquare();
            case "triangle":
                return new ColorfulTriangle();
        }

        return null;
    }

}
