import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        var hmCountry= new HashMap<String,String>();
//        hmCountry.put("ES","Spain");
//        hmCountry.put("DE","Germany");
//        hmCountry.put("FR","France");
//        hmCountry.put("CN","China");
//        hmCountry.put("US","United States");
//        hmCountry.put("RU","Russia");
//        hmCountry.put("GB","United Kingdom");
//        hmCountry.put("IN","India");
//        hmCountry.put("BR","Brazil");
//        hmCountry.put("SA","South Africa");
//        hmCountry.put("IL","Israel");
//
//        int size=hmCountry.size();
//        //System.out.println(size);
//
//        System.out.println(hmCountry);

        var p1=new Product(1,"soda");
        var p2=new Product(2,"kola");
        var p3=new Product(3,"water");
        var p4=new Product(4,"wine");
        var p5=new Product(5,"juice");

        var products=new ProductCollection();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        for(Iterator it= products.getIterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
}
