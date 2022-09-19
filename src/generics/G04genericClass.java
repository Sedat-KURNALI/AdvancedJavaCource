package generics;

public class G04genericClass {
    //T type parametrik class declaration yapalim <T> yaptin mi yeterli
    //1 bu class i generic yapiniz
    //2 bir field tanimla ve getter setter const olustur
    //3 main methoddan farkli tiplerde obj create edip yazdir
    public static void main(String[] args) {
        GenericClass<String> obj1 = new GenericClass<>();
        GenericClass<Double> obj2 = new GenericClass<>();
        GenericClass<Character> obj3 = new GenericClass<>();

        obj1.setOsmanAli("Recep");
        obj2.setOsmanAli(12.9);
        obj3.setOsmanAli('A');

        System.out.println(obj1.getOsmanAli());
        System.out.println(obj2.getOsmanAli());
        System.out.println(obj3.getOsmanAli());
    }
}

class GenericClass<T> {
    private T osmanAli;

    public T getOsmanAli() {
        return osmanAli;
    }

    public void setOsmanAli(T osmanAli) {
        this.osmanAli = osmanAli;
    }

    @Override
    public String toString() {
        return "GenericKlas{" +
                "osmanAli=" + osmanAli +
                '}';
    }

    public GenericClass() {
    }

    public GenericClass(T osmanAli) {
        this.osmanAli = osmanAli;
    }
}