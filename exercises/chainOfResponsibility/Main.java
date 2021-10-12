package exercises.chainOfResponsibility;

public class Main {

    public static void main(String... args) {
        var handler1 = new DutchCarFinder();
        var handler2 = new FrenchCarFinder();
        var handler3 = new EnglishCarFinder();

        handler1.setNext(handler2);
        handler2.setNext(handler3);

        var result  = handler1.find("BD342F");
        System.out.println("Car identified: " + result);
    }
}
