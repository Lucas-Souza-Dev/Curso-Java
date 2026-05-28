package Secao15Arquivos.application.Exercicio01.entities;

public class Item {
    private String name;
    private Integer quantity;
    private Double price;

    public Item(){}

    public Item(String name, Integer quantity, Double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double calculateTotalValue(){
        return quantity * price;
    }
}
