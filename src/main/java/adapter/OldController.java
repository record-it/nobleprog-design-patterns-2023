package adapter;

import java.util.Date;

public class OldController {
    final TVSetOldInterface tv;
    Date date;

    public OldController(TVSetOldInterface tv) {
        this.tv = tv;
    }

    public void setVolume(int volume){
        tv.setVolume(volume);
    }

    void setDate(Date date){
        this.date = date;
    }
}
