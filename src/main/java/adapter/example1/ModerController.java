package adapter.example1;

import adapter.example2.TVSetModern;

public class ModerController {

    private final TVSetModern set;

    public ModerController(TVSetModern set) {
        this.set = set;
    }

    public void volumeUp(){
        set.volumeUp();
    }

    public void volumeDown(){
        set.volumeDown();
    }

    public int getVolume(){
        return set.getVolume();
    }
}
