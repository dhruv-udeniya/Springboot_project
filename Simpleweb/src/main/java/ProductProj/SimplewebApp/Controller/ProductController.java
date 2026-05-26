package ProductProj.SimplewebApp.Controller;

import ProductProj.SimplewebApp.Service.ProductService;
import ProductProj.SimplewebApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getString(){
        return service.getProducts();
    }


    @GetMapping("/products/{prodId}")
    public Product getproductbyId(@PathVariable int prodId){
        return service.getproductbyId(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

}
