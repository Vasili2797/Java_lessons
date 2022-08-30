package main.com.Personal_project_folder.API;

//import com.sun.scenario.effect.impl.prism.PrDrawable;

import java.util.AbstractList;
import java.util.*;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();

        for(Product product: getProducts()){
            if(product.getPrice() > 2500f){
                list.add(product);

            }
        }
        for(Product product : list){
            System.out.println(product);
        }
        System.out.println();
        //Doing the same exact thing as the code above but just by using stream API, which just uses one line of code

        List<Product> list2 =getProducts().stream()
                .filter((product) -> product.getPrice() > 2500f)
                .collect(Collectors.toList());
        list2.forEach(System.out::println);


    }

    private static List<Product> getProducts() {
        List<Product> productsList = new ArrayList<Product>();
        productsList.add(new Product(1,"HP Laptop",2500f));
        productsList.add(new Product(2,"Dell Laptop", 3000f));
        productsList.add(new Product(3,"Lenovo Laptop",2800f));
        productsList.add(new Product(4, "Sony Laptop",2800f));
        productsList.add(new Product(5,"Apple Laptop",9000f));
        return productsList;
    }
}
class Product{

    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Product [id = "+id+", name = "+name+", price: "+price+"]";
    }
}
