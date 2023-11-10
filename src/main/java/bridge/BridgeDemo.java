package bridge;

public class BridgeDemo {
    public static void main(String[] args) throws InterruptedException {
        TV tv = new SonyTV();
        RemoteController controller = new SonyRemoteController(tv);
        process(controller);
    }

    public static void process(RemoteController controller) throws InterruptedException {
        controller.powerOn();
        controller.setChannel(5);
        Thread.sleep(5000);
        controller.powerOff();
    }
}
