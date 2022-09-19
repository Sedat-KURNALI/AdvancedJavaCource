package generics;

import java.util.ArrayList;
import java.util.List;

public class G03nonGenericsClass {
    public static void main(String[] args) {

       // List<String> liste=new ArrayList<>();// ==>generic list
        List liste=new ArrayList<>();

        liste.add("sefer ser");
        liste.add(2121);

        System.out.println("liste = " + liste);



        //row List yerine Object super class data type
        List<Object> devList=new ArrayList<>();//object super class data type list create edili
        devList.add("isim soyisim");
        devList.add(2022);
        devList.add(20000.5);









    }

}
