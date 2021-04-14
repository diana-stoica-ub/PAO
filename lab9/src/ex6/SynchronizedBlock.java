package ex6;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedBlock {
    String name = "";
    public int count = 0;

    public void changeName(String name, List<String> list) {
        // Only one thread is permitted
        synchronized(this) {
            this.name = name;
            count++;  // how many threads changed the name.
        }

        // All other threads are permitted
        // to add name into list.
        list.add(name);
    }
}

class MainSyncBlock {
    public static void main (String[] args) {
        SynchronizedBlock sb = new SynchronizedBlock();
        List<String> list = new ArrayList<String>();
        sb.changeName("name", list);
        System.out.println(sb.name);

    }
}
