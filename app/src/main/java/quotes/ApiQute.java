package quotes;

public class ApiQute {
    private  String quoteText;
    private String quoteAuthor;

    public ApiQute(String quoteText, String quoteAuthor) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
    }

    @Override
    public String toString() {
        return "ApiQute{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                '}';
    }
}
