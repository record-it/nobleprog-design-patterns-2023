package adapter;

import java.time.LocalDate;

public class Controller{
    // data pobrana z telewizora
    LocalDate date;
    public void setVolume(int volume, TVSetAdapter adapter){
        adapter.setVolume(volume);
    }

    void setDate(LocalDate date){
        this.date = date;
    }
}
