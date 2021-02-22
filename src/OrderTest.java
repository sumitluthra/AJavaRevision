import java.util.ArrayList;
import java.util.List;

public class OrderTest {

	public static void main(String[] args) {
		
		List<Order> list = new ArrayList<Order>();
		list.add(new Order(1, "Buy", 1000));
		list.add(new Order(2, "Sell", 2000));
		list.add(new Order(3, "Buy Cover", 3000));
		list.add(new Order(4, "Short Shell", 4000));
		list.add(new Order(5, null, 1000));
		list.add(new Order(1, "Buy", 1000));
		list.add(new Order(1, "Buy", 1000));
		list.add(new Order(1, "Buy", 1000));
		list.add(new Order(1, "Buy", 1000));
		list.add(new Order(1, "Buy", 1000));
		list.add(new Order(1, "Buy", 1000));
		list.add(new Order(1, "Buy", 1000));
		
		StringBuilder s = new StringBuilder();
		s.append("OrderId,Ordertrancode, Qty \n");
		for (Order order : list) {
			s.append(order.getOrderId()+","+order.getOrderTranCode()+","+order.getQty()+"\n");
		}
		System.out.println(s.toString());
	}
}
