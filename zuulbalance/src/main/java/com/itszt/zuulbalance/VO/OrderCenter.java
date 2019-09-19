package com.itszt.zuulbalance.VO;

import com.itszt.basespringclouddemo.entity.Order;
import com.itszt.basespringclouddemo.entity.User;

public class OrderCenter {

    private User user;
    private Order order;

    public OrderCenter() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
