package week6.Generics;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }
    public void printContents(){
        for (T item : items){
            System.out.println(item);
        }
    }

}
