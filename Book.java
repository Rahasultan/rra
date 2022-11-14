import java.util.Objects;

public abstract class Book {
    private int id;
    private String name;
    private String contentbook;//محتوى الكتاب

    public Book(int id, String name, String contentbook) {
        this.id = id;
        this.name = name;
        this.contentbook = contentbook;

    }
    public abstract double calculateprice();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContentbook() {
        return contentbook;
    }

    public void setContentbook(String contentbook) {
        this.contentbook = contentbook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contentbook='" + contentbook + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && name.equals(book.name) && contentbook.equals(book.contentbook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, contentbook);
    }
}
