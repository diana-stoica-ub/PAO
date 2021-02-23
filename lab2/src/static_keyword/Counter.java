package static_keyword;

public class Counter {

    static int count = 0;

    public Counter() {
        count++;
        System.out.println("Counter value " + count);
    }
}
