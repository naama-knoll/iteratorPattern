import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ProductCollection {
    private ArrayList<Product> products=new ArrayList<>();
    private int count=0;

    public Iterator getIterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator{
        int index=0;
        @Override
        public boolean hasNext() {
            return index<count;
        }

        @Override
        public Product next() {
            if(this.hasNext()){
                return products.get(index++);
            }
            return null;
        }
    }


    public void add(Product product){
        products.add(product);
        count++;
    }


    @Override
    public String toString() {
        return "" + products +
                "";
    }
}
