package testy;

class ShoppingCart {
    double totalPrice;
    double discount;

    ShoppingCart(double discount) {
        if (discount >= 0 && discount <= 99) {
            this.discount = (100 - discount) / 100;
        }
    }

    void add(int itemPrice) {
        totalPrice += itemPrice;
    }

    void remove(int itemPrice) {
        if (totalPrice >= itemPrice) {
            totalPrice -= itemPrice;
        }
    }

    double getPrice() {
        return totalPrice * discount * 1.21;
    }
}

class RentableLand {
    final int COST_PER_SQUARE_METER = 10;
    boolean farming;

    RentableLand(boolean farming) {
        this.farming = farming;
    }

    int rent(int width, int length, int days) {
        int size = width * length;
        int price = COST_PER_SQUARE_METER * size * days;
        if (farming && days > 182 && price >= 100000) {
            return price - 100000;
        }
        return price;
    }
}

public class Classes {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(30);
        cart.add(150);
        cart.remove(50);
        double totalPrice = cart.getPrice();
        System.out.println(totalPrice);

        System.out.println("----------------");

        RentableLand land = new RentableLand(true);
        int rentPrice = land.rent(10, 10, 30);
        System.out.println(rentPrice);
    }
}
