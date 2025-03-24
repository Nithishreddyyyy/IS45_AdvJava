package Unit_1.Exception;

class Example{
    public static void main (String [] args){
        Example E = new Example();
        try{
            E.check(10);
        }
        finally {
            System.out.println("Hello");
        }
    }
    public void check(int age){
        if(age < 18){
            throw new ArithmeticException("Age incorrect");
        }
    }
}

