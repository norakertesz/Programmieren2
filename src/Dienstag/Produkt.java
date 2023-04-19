package Dienstag;

import java.util.Objects;

public class Produkt {
    private String title;
    private double price;
    private int discount;
    private String description;

    public Produkt(String title, double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public Produkt(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        String result = "title=" + title + " " +
                "price=" + getPriceWithDiscount() + " EUR" + " "+"discount="+discount+"% ";
        if (description != null) {
            result += "description=" + description;
        }
        return result;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Double.compare(produkt.price, price) == 0 && discount == produkt.discount && title.equals(produkt.title) && description.equals(produkt.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    public double getPriceWithDiscount() {
        double price2;
        price2 = this.price / 100 * this.discount;
        double priceWithDiscount = this.price - price2;

        return priceWithDiscount;
    }

}
