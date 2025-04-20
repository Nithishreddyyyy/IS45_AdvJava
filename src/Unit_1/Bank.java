package Unit_1;

class bankAccount{
    static int totalAcc;
    double Balance;

    public bankAccount(double B) {
        Balance =B;
        totalAcc++;
    }
    static int get_Total_Acc(){
        return totalAcc;

    }
    void deposit(double dep){
        Balance +=dep;
    }
    double getBal(){
        return Balance;
    }

    public static void main(String[] args) {
        bankAccount B1 = new bankAccount(1200);
        bankAccount B2 = new bankAccount(1500);
        B1.deposit(500);
        B2.deposit(1000);
        System.out.println("Balance of B1: "+B1.getBal());
        System.out.println("Balance of B2: "+B2.getBal());
        System.out.println("Total Acc are:"+totalAcc);
    }
}
