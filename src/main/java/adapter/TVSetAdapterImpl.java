package adapter;

public class TVSetAdapterImpl implements TVSetAdapter {
    final TVSet set;

    public TVSetAdapterImpl(TVSet set) {
        this.set = set;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > set.getVolume()) {
            while (set.getVolume() < volume) {
                set.volumeUp();
            }
        }
        if (volume < set.getVolume()){
            while(set.getVolume() > volume){
                set.volumeDown();
            }
        }
    }
}
