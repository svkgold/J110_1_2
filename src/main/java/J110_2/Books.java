package J110_2;

public class Books {

    // Поля класса Books

    // Поле для названия книги
    private String name;

    // Имя автора книги
    private String[] authors;

    // Поле с названием компании издательства
    private PublishingCompanies publisher;

    // Год, в котором книга была издана издательством
    private int year;


    // Конструктор если автор отсутствует
    public Books(String name, PublishingCompanies publisher, int year){
        setName(name);
        setPublisher(publisher);
        setYear(year);
        this.authors = null;
    }

    // Конструктор, где автор строка
    public Books(String name, PublishingCompanies publisher, int year, String authors){
        setName(name);
        setPublisher(publisher);
        setYear(year);
        setAuthors(new String[]{authors});
    }

    // Конструктор, где несколько авторов массив
    public Books(String name, PublishingCompanies publisher, int year, String[] authors){
        setName(name);
        setPublisher(publisher);
        setYear(year);
        setAuthors(authors);
    }

    // Геттер для года издания книги
    public int getYear() {
        return year;
    }

    // Сеттер для года издания книги
    public void setYear(int year) {
        if (year <= 0)
            throw new IllegalArgumentException
                    ("Year can not be greater than zero or equal zero.");
        this.year = year;
    }

    // Геттер для названия книги
    public String getName()
    {
        return name;
    }

    // Сеттер для названия книги
    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException
                    ("Book name can not be null");
        this.name = name;
    }

    // Геттер информации о компании издательства
    public PublishingCompanies getPublisher()
    {
        return publisher;
    }

    // Сеттер информации о компании издательства
    public void setPublisher(PublishingCompanies publisher)
    {
        if (publisher == null)
            throw new IllegalArgumentException
                    ("Publisher company name can not be null");
        this.publisher = publisher;
    }

    // Геттер для имени автора
    public String[] getAuthors()
    { return authors; }


    // Сеттер для имени автора
    public void setAuthors(String[] authors)
    {
        if (authors != null) {
            for (String author : authors) {
                if (author == null) {
                    throw new IllegalArgumentException
                            ("The author name can not be empty");
                }
            }
        }
        this.authors = authors;
    }

    //Вывод и проверка индекса автора
    public String getAuthor(int index) {
        if (authors == null || index >= authors.length || index < 0) {
            throw new IllegalArgumentException("Invalid author index is entered");
        }
        return authors[index];
    }

    // Метод, который выводит информацию обо всех книгах
    public static void printAll(Books[] booksData) {
        for (Books books : booksData) {
                 books.print();
            System.out.println();
        }
    }

    // Метод, который выводит информацию по одной книге с проверкой если автор не указан
    public void print() {
        System.out.println("Название книги: " + getName());
        if(authors==null)
            System.out.println("Автор не известен");
        else
            System.out.println("Автор: " + String.join(", ", getAuthors()));
        System.out.println("Издательство: " + publisher.getPublisherName() + ", " + publisher.getCity() + "," +
                " " + year + " год ");

    }
}