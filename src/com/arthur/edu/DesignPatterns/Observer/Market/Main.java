package com.arthur.edu.DesignPatterns.Observer.Market;

public class Main {
    public static void main(String[] args) {

        Observer arthur = new Subscriber("Arthur");
        Observer knar = new Subscriber("Knar");
        Observer anna = new Subscriber("Anna");
        Observer vahe = new Subscriber("Vahe");

        AdidasShop shop = new AdidasShop();

        shop.register(arthur);
        shop.register(knar);
        shop.register(anna);
        shop.register(vahe);

//        shop.notifySubscribers("Notify message");

        shop.unRegister(arthur);

        shop.notifySubscribers("Notify message");

    }
}
