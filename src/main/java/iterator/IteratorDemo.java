package iterator;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Adam", "Ewa" ,"Karol"));
        Iterator<String> iterator = names.iterator();

        System.out.println("Wyjątek konkurencyjnego przeglądania kolekcji i usuwania elementów");
//        for(int i = 0 ; i < names.size(); i++){
//            if(names.get(i).endsWith("a")){
//                names.remove(i);
//            }
//        }
//        for(var name: names){
//            if(name.endsWith("a")){
//                names.remove(name);
//            }
//        }
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
            if (name.endsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(names);
        LinkedList<String> linkedList = new LinkedList<>(names);
        var descendingIterator = linkedList.descendingIterator();
        while(descendingIterator.hasNext()){
            System.out.println(descendingIterator.next());
        }
    }
}
