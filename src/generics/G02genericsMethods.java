package generics;

import java.util.Arrays;

public class G02genericsMethods {
    //parameter tipleri non-primitive olmali
    // ERASURE process==> jvm derleyici compile time asamasinda generic methodu java byte kodlara ceviriken
    // parametere tiplerini kaldirir
    // ve yerine gercek parametre koyar.


    //generik veri tipleri sadece non-primitive olabilir
    //binary operatorler (+ - * / < > ) ise non-primitive veri tiplerindee kullanilmazlar
    //dolayisiyla birgeneric methodda karsilastirma icin ne kullanilabilir
    //cevap => comparable interface i kullanilmali
    public static void main(String[] args) {
        Integer[] intDizi = {1, 2, 3, 3, 6, 4, 6, 5, 6, 4, 6, 9};
        Double[] doubleDizi = {1.2, 2.6, 3.2, 3.8, 6.3};
        Character[] charDizi = {'a', 's', 'w', 'r'};
    //task 1 generic method create ederek bu dizileri yazdirirniz

     //task 2 max sayiyi bulan generic method yazinir. 3 pmli olsun



        System.out.println(" - generic method ");
    }













}
