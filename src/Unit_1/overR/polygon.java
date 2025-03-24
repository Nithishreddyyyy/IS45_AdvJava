package Unit_1.overR;

class poly{
    double dim1,dim2;
    poly(double dim1, double dim2) {
    }
}

class Rect extends poly{
    Rect(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public void area(){
        System.out.println("The are is the area for rect: "+dim1*dim2);
    }
}
class tri extends poly{
    tri(double dim1, double dim2){
        super(dim1,dim2);
    }
    public void area(){
        System.out.println("The area of tri is: "+(0.5*dim1*dim2));
    }
}


class Test{
    public static void main(String [] args){
        Rect R = new Rect(10,20);
        tri T = new tri(15,30);
        
        R.area();
        T.area();
    }
}
//Herberts schildt JAVA the complete refference