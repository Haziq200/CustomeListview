package sg.edu.rp.dmsd.customelistview;

/**
 * Created by 17010603 on 17/7/2018.
 */

public class MovieItem {
    private String name;
    private String date;

    public MovieItem(String name,String date) {
        this.name = name;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}


