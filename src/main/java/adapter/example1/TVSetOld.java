package adapter.example1;

public class TVSetOld {
    private int volume;

    public void setVolume(int volume){
        this.volume = volume <= 100 && volume >= 0 ? volume : this.volume;
        System.out.println("Volume set to " + volume);
    }

    public int getVolume(){
        return volume;
    }
}
