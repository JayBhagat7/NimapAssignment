package com.example.demo.model;
import jakarta.persistence.*;


@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String colour;

    @Column(nullable = false)
    private int warrenty;

    @Column(nullable = false)
    private int returnpolicy;


    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)

    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWarrenty() {
        return warrenty;
    }

    public void setWarrenty(int warrenty) {
        this.warrenty = warrenty;
    }

    public int getReturnpolicy() {
        return returnpolicy;
    }

    public void setReturnpolicy(int returnpolicy) {
        this.returnpolicy = returnpolicy;
    }

    public Product(Long id, String name, String description, double price, String colour, int warrenty, int returnpolicy, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.colour = colour;
        this.warrenty = warrenty;
        this.returnpolicy = returnpolicy;
        this.category = category;
    }
}



