package state.design;

public interface DoorState {
    void open(DoorController ctx);
    void close(DoorController ctx);
    void lock(DoorController ctx);
    void unlock(DoorController ctx);
}
