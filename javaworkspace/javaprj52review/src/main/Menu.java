package main;

public class Menu {
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) throws Exception {
		if(price <= 0) {
			throw new Exception("가겨은 0 이하일 수 없습니다.");
		}
		this.price = price;
		}
		
	@Override
	public String toString() {
		return "menu [name=" + name + ", price=" + price + "]";
	}
	
}
