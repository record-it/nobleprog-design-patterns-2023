package adapter.example1;

import lombok.Getter;

@Getter
public class TVSetOld {
    private int volume;

    public void setVolume(int volume){
        this.volume = volume <= 100 && volume >= 0 ? volume : this.volume;
        System.out.println("Volume set to " + volume);
    }
}
