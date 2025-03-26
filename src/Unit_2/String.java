package Unit_2;

class Test {
    public static void main(String[] args) {
        String name1 = "Nithish";
        String name2 = " Reddy is : ";
        int age = 10;
        String name3 = name1 + name2 + age;
        System.out.println(name3);

        String N = "Hello";
        String I = "Hello";
        if(N.equals(I)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

        //Substring
        System.out.println(name1.substring(2));


        //Replace
        System.out.println(name2);
        System.out.println(name2.trim());           //This method is used to remove the white space in the beginning and the end of the string

        //Case conversion
        System.out.println("Original: "+name1);
        System.out.println("Upper: "+name1.toUpperCase());
        System.out.println("Lower: "+name1.toLowerCase());

        //Joining Strings

        String ans = String.join(name1,name2);
        System.out.println("ans: "+ans);

        for (int i = 0 ; i <= name1.length() ; i++){
            System.out.println(i);
        }


        for (char i : name1.toCharArray()){
            System.out.println(i);
        }



    }
}