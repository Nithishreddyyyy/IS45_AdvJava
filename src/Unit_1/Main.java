package Unit_1;

class Parent{
    public void print(){
        System.out.println("I am a Unit_1.Parent");
    }
}
class child extends Parent{
    public void print(){
        System.out.println("I am Child");
    }
    public static void main(String [] args){
        child A = new child();
        A.print();
    }
}

