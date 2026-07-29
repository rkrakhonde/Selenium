package S1_Method_With_ReturnType;

public class Sample1 {
    //void->return type->returns nothing
    public static int add(int n1, int n2) {
        int addValue = n1 + n2;
        return addValue;
    }

    public int mult(int n1, int n2) {
        int multValue = n1 * n2;
        return multValue;
    }

    public static void main(String[] args) {
        //Apr1
        int n3 = add(6, 7);
        System.out.println(n3 * n3);
        System.out.println("----");

//Apr2
        System.out.println(add(8, 9));
        System.out.println("-------");
        Sample1 s1 = new Sample1();
        int n4 = s1.mult(3, 4);
        System.out.println(n4);
        System.out.println("----");
        System.out.println(s1.mult(2, 9));
    }


}













