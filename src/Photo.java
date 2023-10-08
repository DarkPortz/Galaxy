import java.util.Date;

public class Photo {

    private String url;
    private Date date;
    private Telescope telescope;

    public Photo(String url, Date date, Telescope telescope) {
        this.url = url;
        this.date = date;
        this.telescope = telescope;
    }
}
