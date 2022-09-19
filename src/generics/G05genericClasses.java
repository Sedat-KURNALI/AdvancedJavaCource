package generics;

import java.util.Arrays;

public class G05genericClasses {//non generic main class

    public static void main(String[] args) {
        //1     veri sakla adinda generic pojo class create ediniz
        //2     getter setter ve pm li const create
        //3     dataprint adinda non-generic class create ediniz
        //4     yazdir adinda pm li generic methoda create ediniz
        //      main method dan farkli tiplerde obj create ederek bunlari yazdirin

        VeriSakla<Integer[]> obj1 = new VeriSakla<>();
        VeriSakla<String[]> obj2 = new VeriSakla<>();
        VeriSakla<Boolean[]> obj3 = new VeriSakla<>();

        Integer[] arr = {1, 2, 45, 65};
        String[] strArr = {"recep", "ismail"};
        Boolean[] bolArr = {true, false, true};
        obj1.setIsmail(arr);
        obj2.setIsmail(strArr);
        obj3.setIsmail(bolArr);

        DataPrint.yazdir(obj1.getIsmail());
        System.out.println("\n=========");
        DataPrint.yazdir(obj2.getIsmail());
        System.out.println("\n=========");
        DataPrint.yazdir(obj3.getIsmail());
    }
}

class VeriSakla<T> {
    private T ismail;

    public VeriSakla() {
    }

    public VeriSakla(T ismail) {
        this.ismail = ismail;
    }

    @Override
    public String toString() {
        return "VeriSakla{" +
                "ismail=" + ismail +
                '}';
    }

    public T getIsmail() {
        return ismail;
    }

    public void setIsmail(T ismail) {
        this.ismail = ismail;
    }
}

class DataPrint {
    public static <T> void yazdir(T[] t) {
        for (T w : t) {
            System.out.print(w + " ");
        }
    }
}

