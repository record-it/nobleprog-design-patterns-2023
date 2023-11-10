package bridge;

public class SonyRemoteController implements RemoteController{
    private final TV tv;

    public SonyRemoteController(TV tv) {
        this.tv = tv;
    }

    @Override
    public void setChannel(int channel) {
        tv.setChannel(channel);
    }

    @Override
    public void powerOn() {
        if(!tv.isPowerOn()){
            tv.togglePower();
        }
    }

    @Override
    public void powerOff() {
        if(tv.isPowerOn()){
            tv.togglePower();
        }
    }
}
