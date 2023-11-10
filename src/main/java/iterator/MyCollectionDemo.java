package iterator;

import java.util.Iterator;

public class MyCollectionDemo {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        collection.putAt("Adam",3);
        collection.putAt("Ewa",7);
        collection.putAt("Karol",1);

        for(String item: collection){
            System.out.println(item);
        }
        // generowany kod na podstawie pętli foreach
        for(Iterator<String> iterator = collection.iterator(); iterator.hasNext();){
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
