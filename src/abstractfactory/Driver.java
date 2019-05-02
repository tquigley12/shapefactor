package abstractfactory;

import abstractfactory.colorfulshapes.ColorfulShapeFactoryImpl;

public class Driver {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ColorfulShapeFactoryImpl();
        MyApplication myApp = new MyApplication(shapeFactory);
        myApp.run();
    }
}
