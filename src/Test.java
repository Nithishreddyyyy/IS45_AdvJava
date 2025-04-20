class Animal {
    void sound() { System.out.println("Animal sound"); }
}
class Dog extends Animal {
    @Override
    void sound() { System.out.println("Bark"); }
}
class as{
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        Animal obj2 = new Animal();
        obj1.sound();
        obj2.sound();

    }
}