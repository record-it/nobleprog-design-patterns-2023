package adapter.example1;

/**
 * Pakiet zawiera przykład adaptera opartego na dziedziczeniu.
 * Z klasy ModernController została wyprowadzona klasa adaptera.
 * Adapter jest kompozycją, zawiera pole ze starym odbiornikiem, którym adapter steruje.
 * W tym przypadku adapter jest jednocześnie obiektem sterującym obiektem adaptowanym.
 */
public class Demo {
    public static void main(String[] args) {
        TVSetOld tvSet = new TVSetOld();
        ModerController controller = new ModerControllerForOldTvAdapter(tvSet);

        controller.volumeUp();
        controller.volumeUp();
    }
}
