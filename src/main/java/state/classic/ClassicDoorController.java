package state.classic;

public class ClassicDoorController {
    private DoorState state = DoorState.CLOSE;
    public void request(String operation){
        switch (operation){
            case "open":
                if (state == DoorState.CLOSE){
                    state = DoorState.OPEN;
                    confirm();
                    return;
                }
                throwExceptionForInvalidOperation(" open when state is not close!");
            case "close":
                if (state == DoorState.OPEN){
                    state = DoorState.CLOSE;
                    confirm();
                    return;
                }
                throwExceptionForInvalidOperation(" close when state is not open!");
            case "lock":
                if (state == DoorState.CLOSE){
                    state = DoorState.LOCK;
                    confirm();
                    return;
                }
                throwExceptionForInvalidOperation(" lock when state is not close!");
            case "unlock":
                if (state == DoorState.LOCK){
                    state = DoorState.CLOSE;
                    confirm();
                    return;
                }
                throwExceptionForInvalidOperation(" unlock when state is not lock!");
        }
    }
    private void throwExceptionForInvalidOperation(String message){
        throw new IllegalArgumentException("Invalid operation for" + message);
    }

    private void confirm(){
        System.out.println("Operation confirmed, now state is " + state.name());
    }
}
