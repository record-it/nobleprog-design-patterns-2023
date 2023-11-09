package factory;

import java.util.HashMap;
import java.util.Map;

public class MessageFactoryProvider {
    private Map<String, AbstractFactory<Message>> factories = new HashMap<>();

    public void register(AbstractFactory<Message> factory, String selector){
        factories.put(selector, factory);
    }

    public AbstractFactory<Message> getFactory(String selector){
        return factories.get(selector);
    }
}
