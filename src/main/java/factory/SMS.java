package factory;

import prototype.Cloneable;

public class SMS extends Message implements Cloneable<Message> {
    private String phoneTo;
    private String phoneFrom;

    public void setPhoneTo(String phoneTo) {
        this.phoneTo = phoneTo;
    }

    public SMS(String phoneTo, String phoneFrom, String  content) {
        this.phoneTo = phoneTo;
        this.phoneFrom = phoneFrom;
        this.content = content;
    }

    @Override
    public String format() {
        return "phoneTo: " + phoneTo +"\n phoneFrom: " + phoneFrom +  "\ncontent: " + content;
    }

    @Override
    public Message clone() {
        return new SMS(phoneTo, phoneFrom, content);
    }
}
