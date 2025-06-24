package Test;

//class inter implements Runnable{
//    public void run(){
//        for (int i = 0; i < 5; i++) {
//            System.out.println("hi");
//            try{
//                Thread.sleep(500);
//            }catch(Exception e){
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//}
//class inter1 implements Runnable{
//    public void run(){
//        for (int i = 0; i < 5; i++) {
//            System.out.println("hello");
//        }
//    }
//}
public class Threads {
    public static void main(String[] args) throws Exception{
        Runnable obj1 = () -> {
            for (int i = 0 ; i < 5 ; i++) {
                System.out.println("MEOW");
            }
        };
        Runnable obj2 = () ->{
            for (int i = 0 ; i < 5 ; i++) {
                System.out.println("hello");
                try{
                    Thread.sleep(500);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread t1 = new Thread(obj1);
        System.out.println(t1.getState());
        System.out.println(t1.isAlive());
        Thread t2 = new Thread(obj2);

        t1.start();
        System.out.println("Stae:"+t1.getState());

        System.out.println("CHEC"+t1.isAlive());
        t2.start();
        System.out.println("Stae:"+t1.getState());


        t1.join(); t2.join();
        System.out.println("Stae:"+t1.getState());




        System.out.println("BYEEEEE");

    }
}
