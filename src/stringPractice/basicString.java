package stringPractice;

class _1 {
    public static void main(String[] args) {
        char [] b = {'w','e','l'};
        String s = new String(b);
        String s2 = s.concat("!!!!");
        String res = String.join(", ","Java","Python","C++");
        System.out.println(res);
        char ch = s.charAt(0);
        System.out.println(ch);
        char [] dest = new char[3];
        s.getChars(0,3,dest,0);
        System.out.println(dest);
        System.out.println(s.lastIndexOf("l"));
        String s5 = "Nithis h Reddy   ";
        System.out.println(s5.length());
        System.out.println(s5.substring(1,4));
        s5= s5.trim();
        System.out.println(s5.length());

        char [] arr = s5.toCharArray();
        byte [] by = s5.getBytes();
        int num = 1243;
        String ss = String.valueOf(num);
        System.out.println(ss);
    }
}

