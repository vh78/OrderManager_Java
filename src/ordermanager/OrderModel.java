/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanager;

import java.awt.Color;


/**
 *
 * @author 453
 */
public class OrderModel {
    
    private int OrderNum;
    private String CustomerName;
    private String OrderName;
    private String OrderDate;
    private String PhoneNumber;
    private String InternalMessage;
    private Color color;
            
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    
    
    public OrderModel(){
        this.color = Color.BLACK;
    }
    
    public OrderModel(int OrderNum, String CustomerName, String OrderName, String OrderDate, String PhoneNumber, String InternalMessage) {
        this.OrderNum = OrderNum;
        this.CustomerName = CustomerName;
        this.OrderName = OrderName;
        this.OrderDate = OrderDate;
        this.PhoneNumber = PhoneNumber;
        this.InternalMessage = InternalMessage;
    }

    public int getOrderNum() {
        return OrderNum;
    }

    public void setOrderNum(int OrderNum) {
        this.OrderNum = OrderNum;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String OrderName) {
        this.OrderName = OrderName;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getInternalMessage() {
        return InternalMessage;
    }

    public void setInternalMessage(String InternalMessage) {
        this.InternalMessage = InternalMessage;
    }
    
    
 
    @Override
    public String toString() {
        return "Order: " + "OrderNum:" + OrderNum + ", CustomerName:" + CustomerName + ", "
                + ""
                + ""
                + "OrderName:" + OrderName + ", OrderDate:" + OrderDate + ", PhoneNumber:" + PhoneNumber + ", InternalMessage:" + InternalMessage + "\n"+
                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";    
    }
}
