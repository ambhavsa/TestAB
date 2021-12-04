package entity;

public class Item {

    private String label;
    private Double price;
    private String barCode;


    public Item(String label, Double price,String barCode){

        this.label = label;
        this.price = price;
        this.barCode = barCode;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getLabel() {
        return label;
    }

    public Double getPrice() {
        return price;
    }

    public String getBarCode() {
        return barCode;
    }
}
