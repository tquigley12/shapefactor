package abstractfactory;

import java.util.Scanner;

public class MyApplication {

    private ShapeFactory shapeFactory;

    public MyApplication(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public void run() {
        Scanner keyboard = new Scanner(System.in);
        String shapeName = "";
        do {
            System.out.print("What shape? ");
            shapeName = keyboard.nextLine().trim();

            Shape theShape = shapeFactory.make(shapeName);
            System.out.println(theShape);

        } while (!shapeName.isEmpty());
    }

}
