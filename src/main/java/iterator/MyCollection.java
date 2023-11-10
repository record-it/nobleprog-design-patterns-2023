package iterator;

import java.util.Iterator;

public class MyCollection implements Iterable<String>{
    private String[] items = new String[10];

    public void putAt(String item, int index){
        items[index] = item;
    }

    public int size(){
        return items.length;
    }
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                while(i < items.length){
                    if (items[i] != null){
                        return true;
                    }
                    i++;
                }
                return false;
            }

            @Override
            public String next() {
                return items[i++];
            }
        };
    }
}
