package state.design;

public class DoorController {
    DoorState state = new CloseDoorState();
    public void open(){
        state.open(this);
    }

    public void close(){
       state.close(this);
    }

    public void lock(){
        state.lock(this);
    }

    public void unlock(){
        state.unlock(this);
    }

    public void printStatus(){
        System.out.println("Current status " + state);
    }
}
