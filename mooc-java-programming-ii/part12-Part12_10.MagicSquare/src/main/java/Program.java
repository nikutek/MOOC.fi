
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        MagicSquare ms = msFactory.createMagicSquare(3);
        System.out.println(ms);
    }
}
