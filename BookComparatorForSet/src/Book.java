public class Book {
    private String authorName;
    private String bookName;
    private int numberOfValumes;
    private int numberOfPages;

    public Book(String authorName , String bookName , int numberOfValumes , int numberOfPages){
        this.authorName = authorName;
        this.bookName = bookName;
        this.numberOfValumes = numberOfValumes;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName(){
        return this.authorName;
    }

    public void setAuthorName(String authorName){
        this.authorName =authorName;
    }

    public String getBookName(){
        return this.bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public int getNumberOfValumes(){
        return this.numberOfValumes;
    }

    public void setNumberOfValumes(int numberOfValumes){
        this.numberOfValumes = numberOfValumes;
    }

    public int getNumberOfPages(){
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
}
