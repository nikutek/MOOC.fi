
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(10, 20);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

    }
}
