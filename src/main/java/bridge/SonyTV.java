package bridge;

public class SonyTV implements TV{
    private boolean isPower;
    private int channel;
    @Override
    public void togglePower() {
        isPower = !isPower;
        System.out.println("Power " + isPower);
    }

    @Override
    public void setChannel(int channel) {
        if (isPower){
            this.channel = channel;
            System.out.println("Channel " + channel);
        }
    }

    @Override
    public boolean isPowerOn() {
        return isPower;
    }
}
