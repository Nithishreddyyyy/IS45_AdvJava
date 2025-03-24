package Unit_1;

class nw{
    public static void main(String [] args){
        int[] arr ={10,11};
        try{
            System.out.println(arr[4]);
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bounds error has been prompted");
        }
        finally{
            System.out.println("This is finally");
        }

    }
}
