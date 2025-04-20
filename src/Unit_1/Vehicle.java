package Unit_1;

class Vehicle{
    String VehNo;
    Vehicle(){
        VehNo="KA40";
    }
    public void print(){
        System.out.println("I am vehicle");
    }
}

class Car extends Vehicle{
    String company, Year_Manu;
    Car(){
        company="Kia";
        Year_Manu="2021";
    }
    public void print(){
        System.out.println("I am car");
    }
    public static void main(String [] args){
        Car C = new Car();
        System.out.println("C.Veh no: "+C.VehNo+"\nCompany: "+ C.company+"\nYear of Manu: "+C.Year_Manu);
        C.print();
    }
}
