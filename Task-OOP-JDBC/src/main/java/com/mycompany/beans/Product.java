
package beans;

import com.mycompany.task.oop.jdbc.PraductInterface;
import java.util.LinkedList;

public class Product  implements PraductInterface{
    public int code;
    public String name;
    public double description;
    public double buyPrice;
    public  double qtyInStock;
    public double totalPriceByStock;
    public LinkedList<OrderDetail> orders;
    
 
}
