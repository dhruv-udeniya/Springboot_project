package ProductProj.SimplewebApp.Controller;

import ProductProj.SimplewebApp.Service.ProductService;
import ProductProj.SimplewebApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getString(){
        return service.getProducts();
    }

}
