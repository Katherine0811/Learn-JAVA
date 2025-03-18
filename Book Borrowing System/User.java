import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    // Properties
    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> books = new ArrayList<Book>();

    // Constructor
    User(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();

        return age;
    }

    public void borrow(Book book) {
        this.books.add(book);
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDay() {
        return this.birthDay.toString();
    }

    public String borrowedBooks() {
        return this.books.toString();
    }
}
