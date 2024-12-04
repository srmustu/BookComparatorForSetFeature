import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*
        TreeSet<Book> books = new TreeSet<>(new OrderNameComparator());

        books.add(new Book("Namık Kemal","Ciguli",2,398));
        books.add(new Book("Mehmet Akif","Baytar",5,435));
        books.add(new Book("John Flanagan","Lord of shadow : Poison Arrow",4,376));
        books.add(new Book("Sait Faik Abasıyanık", "Güzellemeler", 6,897));
        books.add(new Book("Osman Kurt", "Hayat Bazen Samuray", 1, 57));



        for (Book b : books){
            System.out.println(b.getBookName());
        }

         */
        TreeSet<Book> books = new TreeSet<>(new OrderPageComparator());

        books.add(new Book("Namık Kemal","Ciguli",2,398));
        books.add(new Book("Mehmet Akif","Baytar",5,435));
        books.add(new Book("John Flanagan","Lord of shadow : Poison Arrow",4,376));
        books.add(new Book("Sait Faik Abasıyanık", "Güzellemeler", 6,897));
        books.add(new Book("Osman Kurt", "Hayat Bazen Samuray", 1, 57));

        for (Book b : books){
            System.out.println(b.getBookName());
        }
    }
}