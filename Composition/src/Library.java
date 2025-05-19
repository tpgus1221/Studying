import java.util.ArrayList;

public class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();
    public Library (String name){
        this.name = name;

        Book a = new Book("a");
        Book b = new Book("b");
        Book c = new Book("c");

        books.add(a);
        books.add(b);
        books.add(c);

    }

    public void showBooks(){
        for (Book show : books){
            System.out.print(show.getName() + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }
}
