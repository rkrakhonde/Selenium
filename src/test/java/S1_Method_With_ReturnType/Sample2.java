package S1_Method_With_ReturnType;

public class Sample2 {
    public static String convertNameToUpperCase(String s1) {
        s1 = s1.toUpperCase();
        return s1;
    }

    public static int getRollNul() {
        int rollNum = 10;
        return rollNum;
    }

    public static void main(String[] args) {
        String s3 = convertNameToUpperCase("ganesh");
        System.out.println(s3);

        System.out.println("-----");

        System.out.println(convertNameToUpperCase("suresh"));

        System.out.println("----");

        int num = getRollNul();
        System.out.println(num);

        System.out.println("----");
        System.out.println(getRollNul());
    }

    }






