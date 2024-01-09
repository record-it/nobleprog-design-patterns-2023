package state.design;

public class LockDoorState implements DoorState{
    @Override
    public void open(DoorController ctx) {
        System.out.println("Cant open locked door, unlock and then open!");
    }

    @Override
    public void close(DoorController ctx) {
        System.out.println("Cant open locked door, unlock and then door is closed!");
    }

    @Override
    public void lock(DoorController ctx) {
        System.out.println("Door is already locked!");
    }

    @Override
    public void unlock(DoorController ctx) {
        ctx.state = new CloseDoorState();
    }

    @Override
    public String toString() {
        return "LockDoorState{}";
    }
}
