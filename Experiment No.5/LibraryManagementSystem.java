class Book {
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void displayBook() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

class Member {
    String name;
    int memberId;

    Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    void displayMember() {
        System.out.println("Member Details:");
        System.out.println("Name: " + name);
        System.out.println("Member ID: " + memberId);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "James Gosling", "12345");
        Member m1 = new Member("Shruti", 101);

        b1.displayBook();
        System.out.println("----------------------");
        m1.displayMember();
    }
}