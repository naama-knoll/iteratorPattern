import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
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
