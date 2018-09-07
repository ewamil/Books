package isajdqz2.books;

import java.util.Scanner;

public class Books {
    private String author;
    private String title;
    private String bookDescription;
    private String numOfPages;

    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", numOfPages='" + numOfPages + '\'' +
                '}';
    }

    public Books(String author, String title, String bookDescription, String numOfPages) {
        this.author = author;
        this.title = title;
        this.bookDescription = bookDescription;
        this.numOfPages = numOfPages;
    }

}
