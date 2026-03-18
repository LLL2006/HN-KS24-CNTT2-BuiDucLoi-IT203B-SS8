public class FactoryMethod {
    public Shape create(String type) {
        switch (type.toLowerCase()) {
        case "circle":
            return new Circle();
        case "triangle":
            return new Triangle();
        default:
            throw new RuntimeException("Không hợp lệ");
        }
    }

    public static void main(String[] args) {
        Shape shape = new FactoryMethod().create("circle");
        shape.draw();
    }
}

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}