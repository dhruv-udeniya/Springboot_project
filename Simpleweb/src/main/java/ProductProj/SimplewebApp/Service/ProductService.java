package ProductProj.SimplewebApp.Service;

import ProductProj.SimplewebApp.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"SmartPhone",200000), new Product(102,"Iphone",23454)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getproductbyId(int prodId) {
        return products.stream()
                .filter(p -> p.getId() == prodId)
                .findFirst().orElse( new Product(100 , "No item" , 0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }
}
