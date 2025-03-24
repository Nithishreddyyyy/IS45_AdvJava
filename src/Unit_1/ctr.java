package Unit_1;

class Counter{
    static int count;
    public Counter(){
        count++;
    }
    public static int getCount(){
        return count;
    }


}

class Main{
    public static void main(String [] args){
        Counter C1 = new Counter();
        Counter C2 = new Counter();
        int test = Counter.getCount();

    }
}