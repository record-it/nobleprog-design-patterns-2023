package state.design;

public class OpenDoorState implements DoorState{
    @Override
    public void open(DoorController ctx) {
        System.out.println("Door already opened!");
    }

    @Override
    public void close(DoorController ctx) {
        ctx.state = new CloseDoorState();
    }

    @Override
    public void lock(DoorController ctx) {
        System.out.println("Cant lock when door is  open, close and then lock");
    }

    @Override
    public void unlock(DoorController ctx) {
        System.out.println("Cant unlock when door is  open, close, lock and then unlock");
    }

    @Override
    public String toString() {
        return "OpenDoorState{}";
    }
}
