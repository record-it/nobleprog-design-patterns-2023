package adapter.example2;

/**
 * Przykład adaptera opartego na implementacji interfejsu.
 * Klasa OldController steruje urządzeniami implementującymi interfejs
 * TVSetOldInterface
 * Adapter to nowa implementacja tego interfejsu, która
 * steruje nowoczesnym odbiornikiem klasy TVSetModern.
 *
 */
public class Demo {
    public static void main(String[] args) {
        TVSetModern set = new TVSetModern();
        TVSetAdapterForOldInterface adapter = new TVSetAdapterForOldInterface(set);
        OldController controller = new OldController(adapter);
        // kod niezmienialny
        controller.setVolume(49);
        System.out.println(set.getVolume());
    }
}
