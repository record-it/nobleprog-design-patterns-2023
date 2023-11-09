package adapter.example1;

public class ModerControllerForOldTvAdapter extends ModerController {
    private final TVSetOld set;

    public ModerControllerForOldTvAdapter(TVSetOld set) {
        super(null);
        this.set = set;
    }

    @Override
    public void volumeUp() {
       set.setVolume(set.getVolume() + 1);
    }

    @Override
    public void volumeDown() {
       set.setVolume(set.getVolume() - 1);
    }

    @Override
    public int getVolume() {
        return super.getVolume();
    }
}
