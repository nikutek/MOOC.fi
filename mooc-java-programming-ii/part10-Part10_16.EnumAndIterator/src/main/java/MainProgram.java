
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Employees t = new Employees();
        Person h = new Person("Arto", Education.PHD);
        t.add(h);
        t.print();
        t.fire(Education.PHD);
        t.print();
    }

}
