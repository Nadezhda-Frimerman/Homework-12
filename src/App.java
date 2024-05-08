public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Иван", "Ефремов");
        Author author2 = new Author("Леон", "Фейхтвангер");
        Book book1 = new Book("Лезвие бритвы", author1, 1976);
        Book book2 = new Book("Испанская Баллада", author2, 1969);
        book1.setYearOfPublishing(1982);

        System.out.println(book1);
        System.out.println(book2);


    }
}


