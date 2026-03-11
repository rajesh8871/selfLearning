package Composition;

import java.util.*;

/*Let’s understand the composition in Java with the example of books and library.
  In this example, we create a class Book that contains data members like author,
  and title and create another class Library that has a reference to refer to the
  list of books. A library can have no. of books on the same or different subjects.
  So, If the Library gets destroyed then All books within that particular library
  will be destroyed. i.e., books can not exist without a library. The relationship
  between the library and books is composition.*/
class Book {
    String name;
    String author;
    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}

class Library {
    List<Book> listOfbook;
    Library(List<Book> listOfbook) {
        this.listOfbook = listOfbook;
    }
    public List<Book> getListOfbook() {
        return listOfbook;
    }
}
public class Composition {
    public static void main(String[] args) {
        Book book = new Book("Physics", "HC VERMA");
        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        Library library = new Library(bookList);
        library.getListOfbook().stream().forEach(x -> System.out.println(x.author + ", name:" + x.name));
    }
}
