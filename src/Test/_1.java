package Test;
//Overloading

class Shape{
    void area(int a){
        System.out.println("Area of square :" +(a*a));
    }
    void area(int a,int b){
        System.out.println("Area of rectangle :" +(a*b));
    }
    void area(double a){
        System.out.println("Area of circle: "+(3.14*a*a));
    }
    void area(){
        System.out.println("area operation");
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(10);
        s.area(10,20);
        s.area(20.0);
        s.area();
    }
}