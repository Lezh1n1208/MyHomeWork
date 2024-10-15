package lab4.baitap2;

public class Book extends Document {

    private String author;
    private int numerPage;

    public Book() {
    }

    public Book(String id, String nxb, int number, String author, int numberPage) {
        super(id, nxb, number);
        this.author = author;
        this.numerPage = numberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumerPage() {
        return numerPage;
    }

    public void setNumerPage(int numerPage) {
        this.numerPage = numerPage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{"
                + "author='" + author + '\''
                + ", numerPage=" + numerPage
                + ", id='" + id + '\''
                + ", nxb='" + nxb + '\''
                + ", number='" + number + '\''
                + '}';
    }
}
