package com.fpt.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long siNo;
    private String salesmanID;
    private String salesmanName;
    private long dos;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<Product> products;

    public long getSiNo() {
        return siNo;
    }

    public void setSiNo(long siNo) {
        this.siNo = siNo;
    }

    public String getSalesmanID() {
        return salesmanID;
    }

    public void setSalesmanID(String salesmanID) {
        this.salesmanID = salesmanID;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public long getDos() {
        return dos;
    }

    public void setDos(long dos) {
        this.dos = dos;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}