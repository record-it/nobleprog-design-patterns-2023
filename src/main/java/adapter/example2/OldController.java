package adapter.example2;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class OldController {
    final TVSetOldInterface tv;
    @Getter
    @Setter
    Date date;

    public OldController(TVSetOldInterface tv) {
        this.tv = tv;
    }

    public void setVolume(int volume){
        tv.setVolume(volume);
    }
}
