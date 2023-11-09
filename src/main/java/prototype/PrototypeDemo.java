package prototype;

import factory.Message;
import factory.SMS;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) {
        List<String> phones = List.of("23432", "89887", "898797");
        List<Message> messages = new ArrayList<>();
        SMS prototype = new SMS("", "3456546754", "Hello");
        for(String phone: phones){
            SMS clone = (SMS) prototype.clone();
            clone.setPhoneTo(phone);
            messages.add(clone);
        }
        for(var msg: messages){
            System.out.println(msg);
            System.out.println(msg.clone());
        }
    }
}
