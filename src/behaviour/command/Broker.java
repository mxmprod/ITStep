package behaviour.command;

import java.util.List;
import java.util.ArrayList;

public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order: orderList){
            order.execute();
        }
        orderList.clear();
    }
}
