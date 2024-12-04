import java.util.Comparator;

public class OrderPageComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getNumberOfPages() - o2.getNumberOfPages();
    }
}
