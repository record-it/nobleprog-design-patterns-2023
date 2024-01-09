package state.design;

public class CloseDoorState implements DoorState{

    @Override
    public void open(DoorController ctx) {
        ctx.state = new OpenDoorState();
    }

    @Override
    public void close(DoorController ctx) {
        System.out.println("Door is already closed!");
    }

    @Override
    public void lock(DoorController ctx) {
        ctx.state = new LockDoorState();
    }

    @Override
    public void unlock(DoorController ctx) {
        System.out.println("Can't unlock when door is not locked, you meay lock and then unlock!");
    }

    @Override
    public String toString() {
        return "CloseDoorState{}";
    }
}
