abstract class Shape {
    abstract void draw();
    void  area() { System.out.println("Calculating area..."); }
    abstract void haha();
    String name="Dog";
    public void printName(){
        System.out.println("My name is "+ name);
    }
}
class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); }
    @Override
    void haha(){
        System.out.println("Meow...");
    }
}
class as{
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.area();
        obj.draw();
        obj.haha();
        obj.printName();
    }
}