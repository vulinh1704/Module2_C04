package app;

public class Book extends Document {
    private String nameAuthor;
    private int numbersOfPage;

    public Book(int id, String name, String nameAuthor, int numbersOfPage) {
        super(id, name);
        this.nameAuthor = nameAuthor;
        this.numbersOfPage = numbersOfPage;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getNumbersOfPage() {
        return numbersOfPage;
    }

    public void setNumbersOfPage(int numbersOfPage) {
        this.numbersOfPage = numbersOfPage;
    }
}
