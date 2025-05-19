public class Main {

    public static void main(String[] args) {

        Document a = new Document("a");
        Document b = new Document("b");
        Document c = new Document("c");
        Document d = new Document("d");

        Printer printer = new Printer();

        System.out.println("문서 목록");
        printer.print(a);
        printer.print(b);
        printer.print(c);
        printer.print(d);
    }
}