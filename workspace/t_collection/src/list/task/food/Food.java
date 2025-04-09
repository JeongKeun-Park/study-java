package list.task.food;

import java.util.Objects;

public class Food {
	private String name;
	private int price;
	private String type;

	public Food() {
		;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", type=" + type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(name, other.name);
	}

	

	
	
}
