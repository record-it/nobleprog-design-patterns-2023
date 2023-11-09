package adapter.example2;

public class TVSetAdapterForOldInterface implements TVSetOldInterface {
    final TVSetModern set;

    public TVSetAdapterForOldInterface(TVSetModern set) {
        this.set = set;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > set.getVolume()) {
            while (set.getVolume() < volume) {
                int prev = set.getVolume();
                set.volumeUp();
                if (prev == set.getVolume()){
                    break;
                }
            }
        }
        if (volume < set.getVolume()){
            while(set.getVolume() > volume){
                int prev = set.getVolume();
                set.volumeDown();
                if (prev == set.getVolume()){
                    break;
                }
            }
        }
    }
}
