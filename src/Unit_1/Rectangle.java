package Unit_1;

interface Polygon {
    double area();
    double perimeter();
}

class Circle implements Polygon {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;      //This keyword is used
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Square implements Polygon {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }
}

class Shapes {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);

        System.out.println("Unit_1.Circle Area: " + circle.area());
        System.out.println("Unit_1.Circle Perimeter: " + circle.perimeter());

        System.out.println("Unit_1.Square Area: " + square.area());
        System.out.println("Unit_1.Square Perimeter: " + square.perimeter());
    }
}