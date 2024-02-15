package fundumental1;

public class stringtest {

    public static void main(String[] args) {

        String sl = "Hello";
        sl +="World";
        String s2 = "Hello";
        s2 += " ";
        s2 += "World";
        String s3 = sl.intern();
        String s4 =s2.intern();
        boolean bl = s3==s4;
        boolean b2 = s3.equals(s4);

        System.out.println(bl);
        System.out.println(b2);

    }
}
