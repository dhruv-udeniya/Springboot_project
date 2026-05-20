package ProductProj.SimplewebApp.model;


import org.springframework.stereotype.Component;


@Component
public class Product {
    public Product() {
    }

    private int id;
    private String prodname;
    private int price;

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int id, String prodname, int price) {
        this.id = id;
        this.prodname = prodname;
        this.price = price;
    }



}
