package stringPractice;

class nn{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Nith");
        System.out.println(sb.length());
        sb.append(" Reddy");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);

        sb.delete(0,3);
        System.out.println(sb);


        sb.insert(0,"java ");
        System.out.println(sb);

        sb.replace(0,4,"Nith");
        System.out.println(sb);

        sb.setLength(5);
        System.out.println(sb);

        //STRING BUILDER

        int num = 7;
        Integer obj = num;     // autoBoxing


        String str2 = "11";
        int num3 = Integer.parseInt(str2);
        System.out.println(num3+5);

    }
}