package generics;

public class G06doubleParameterGenerics {
    public static void main(String[] args) {
        //1 iki pm li generic class create din
        //2 getter seter const crete edin
        //3 main methoddan farkli tiplerde obj ler create ederek key value tipinde obj leri yazdirin

        Jeneric<Integer, String> obj1 = new Jeneric<>();
        Jeneric<String, Integer> obj2 = new Jeneric<>();
        Jeneric<Byte, Integer> obj3 = new Jeneric<>();
        Jeneric<Object, Object> obj4 = new Jeneric<>();

        obj1.setKey(1);
        obj1.setValue("Sedat");
        obj2.setKey("Sadik");
        obj2.setValue(2);
        obj3.setKey((byte) 3);
        obj3.setValue(4);
        obj4.setKey(23);
        obj4.setValue("Metin");
        System.out.println(obj1.getKey() + " " + obj1.getValue());
        System.out.println(obj2.getKey() + " " + obj2.getValue());
        System.out.println(obj3.getKey() + " " + obj3.getValue());
        System.out.println(obj4.getKey() + " " + obj4.getValue());

    }
}

class Jeneric<N, T> {
    private N key;
    private T value;

    public Jeneric() {
    }

    public Jeneric(N id, T adiSoyadi) {
        this.key = id;
        this.value = adiSoyadi;
    }

    @Override
    public String toString() {
        return "Jeneric{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public N getKey() {
        return key;
    }

    public void setKey(N key) {
        this.key = key;
    }
}

