public class Main {
    public static void main(String[] args)
    { BoxV1 aBox1 = new BoxV1(); BoxV1 aBox2 = new BoxV1();
    aBox1.d = 10.0;
    aBox1.w = 5.0;
    aBox1.h = 7.0;
    aBox2.d = 1000.0;
    aBox2.w = 5440.0;
    aBox2.h = 7222.0;
    System.out.println(aBox1.volume());
    System.out.println(aBox1.surfaceArea());
    System.out.println(aBox2.volume());
    System.out.println(aBox2.surfaceArea());
    }
}
