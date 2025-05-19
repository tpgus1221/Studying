public class Main {
    public static void main(String[] args) {
        Library A = new Library("A");
        Library B = new Library("B");

        System.out.print(A.getName() + "의 책 목록: ");
        A.showBooks();

        System.out.print(B.getName() + "의 책 목록: ");
        B.showBooks();
        
    }
}