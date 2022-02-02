package chapter7_OOP2;

public class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if (p.price <= money) {
            money -= p.price;
            add(p);
        } else {
            return;
        }
    }

    void add(Product p) {
        if (cart.length <= i) {
            Product[] newCart = new Product[cart.length * 2];
            for (int j = 0; j < cart.length; j++) {
                newCart[j] = cart[j];
            }

            cart = newCart;
            newCart[i++] = p;
        } else {
            cart[i++] = p;
        }
    }

    void summary() {
        String list = "구입한 물건:";
        int price_sum = 0;
        for (int j = 0; j < i; j++) {
            price_sum += cart[j].price;
            list += cart[j].toString() + ",";
        }
        list += "\n사용한 금액:" + price_sum + "\n";
        list += "남은 금액:" + money + "\n";

        System.out.println(list);
    }
}
