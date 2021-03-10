package generics;

public class GenericClassTest_Box<T> {
        private T t;

        public void add(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }

        public static void main(String[] args) {
            GenericClassTest_Box<Integer> integerBox = new GenericClassTest_Box<Integer>();
            GenericClassTest_Box<String> stringBox = new GenericClassTest_Box<>();

            integerBox.add(new Integer(10));
            stringBox.add(new String("Hello World"));

            System.out.printf("Integer Value :%d\n\n", integerBox.get());
            System.out.printf("String Value :%s\n", stringBox.get());
        }
    }
