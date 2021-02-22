
public class Order {

	private long orderId;
	private String orderTranCode;
	private long qty;
	
	
	public Order(long orderId, String orderTranCode, long qty) {
		super();
		this.orderId = orderId;
		this.orderTranCode = orderTranCode;
		this.qty = qty;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getOrderTranCode() {
		return orderTranCode;
	}
	public void setOrderTranCode(String orderTranCode) {
		this.orderTranCode = orderTranCode;
	}
	public long getQty() {
		return qty;
	}
	public void setQty(long qty) {
		this.qty = qty;
	}
	
}
