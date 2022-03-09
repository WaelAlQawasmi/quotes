package quotes;

public class wisdom {
private String author;
    private String text;



    public wisdom(String author, String text) {
        this.author = author;
        this.text = text;
    }

    @Override
    public String toString() {
        return
                "'" + text + '\''+ "    author:'" + author + '\'';

    }
}
