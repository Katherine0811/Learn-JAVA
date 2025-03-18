// import java.time.LocalDate;

public class BookBorrowingSystem {
    public static void main(String[] args) {
        User user = new User("Lee Yan Jie", "2001-08-11");

        Book book01 = new Book("The Road Less Travelled", "M.Scott Peck M.D.", 270);

        AudioBook audioBook01 = new AudioBook("Nan Hong", "Zhu Yi", 90000);

        EBook eBook01 = new EBook("Hello World", "Katherine Lee", 139, "PDF");

        System.out.printf("%s was born back in %s. \n", user.getName(), user.getBirthDay().toString());

        System.out.printf("He is now %d years old. \n", user.age());

        user.borrow(book01);

        System.out.printf("%s has borrowed these books: \n%s\n", user.getName(), user.borrowedBooks());

        System.out.println(audioBook01.toString());
        System.out.println(eBook01.toString());
    }
}
