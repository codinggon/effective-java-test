package com.gon.effectivejavatest.chapter01.item01;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

    //문제 : 아래와 같이 같은 타입이지만 다른 값을 받아야할 경우 어떻게 해야하나??
//    public Order(boolean prime, Product product) {
//        this.prime = prime;
//        this.product = product;
//    }
//
//    public Order(boolean urgent, Product product) {
//        this.urgent = urgent;
//        this.product = product;
//    }

    //방법 1) 정적 팩토리 -> 메서드 이름을 다르게 사용 가능
    //static 매서드 안에 들어오는 변수는 무조건 static -> 변수도 객체 생성 후 만들어지는게 아니기 때문
    //static 내서드 안에 인스턴스 객체를 생성할 수 있지만 지양하는 방법임.
    public static Order primeOrder(Product product){
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product){
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    //방법 2) Order를 꼭 새로 만들어야하나?

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println("order.orderStatus = " + order.orderStatus);
        if (order.orderStatus == OrderStatus.PREPARING) {
            System.out.println("Order.PREPARING");
        }
        //null point 에러 발생 , enum 비교시에는 equals 비교를 지양하라
        if (order.orderStatus.equals(OrderStatus.PREPARING)) {
            System.out.println("Order.PREPARING");
        }

    }

}



//prime 가장 중요한, 주요한
//urgent 긴급한







