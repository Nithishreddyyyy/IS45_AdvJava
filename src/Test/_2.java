package Test;

class A{
    void func(){
        System.out.println("func A is running...");
    }
}
class B extends A{
    @Override
    void func(){
        System.out.println("func B is running...");
    }
    public static void main(String[] args) {
        B obj = new B();
        obj.func();
    }

}

class C extends A{
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.func();
    }

}