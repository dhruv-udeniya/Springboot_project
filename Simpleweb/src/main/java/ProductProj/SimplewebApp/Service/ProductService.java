package ProductProj.SimplewebApp.Service;

import ProductProj.SimplewebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101,"SmartPhone",200000), new Product(102,"Iphone",23454));

    public List<Product> getProducts(){
        return products;
    }

}
