import java.util.*;

public class Catalog {
    private String storeName;
    private ArrayList<Item> items;


    public Catalog(String name) {
        storeName = name;
        items = new ArrayList<Item>();

    }

    public void add(Item next) {
        items.add(next);
    }

    public int size() {
        return items.size();
    }

    public Item get(int index) {
        return items.get(index);
    }

    public String getName() {
        return storeName;
    }
}