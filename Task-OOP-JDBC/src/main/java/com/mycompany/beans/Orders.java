package beans;

import com.mycompany.task.oop.jdbc.OrdersInterface;
import java.time.LocalDate;
import java.util.LinkedList;

public class Orders  implements OrdersInterface{
    
    public static LinkedList<OrderDetail> orderDetails;

    public  int orderNo;
    protected LocalDate orderDate;
    protected String status;
    private String comments;
    public  Customers customerNo;
    
    
    
   public int printId(){
    return orderNo;
   }
            
            
  Customers customer = new Customers();


  
  
  
  
  

}
