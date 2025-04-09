package list.task.product;

import list.task.DBConnecter;

public class SellProduct {
	public static void main(String[] args) {
		Product product1 = new Product();
		Product product2 = new Product();
		Service service = new Service();
		
		product1.setName("공책");
		product1.setPrice(3000);
		product1.setStock(5);

		product2.setName("연필");
		product2.setPrice(1000);
		product2.setStock(10);
		
		service.save(product1);
		service.save(product2);
		
		System.out.println(service.findTarget("연필"));
		
//		boolean check =product1.getName().equals("공책");
//		System.out.println(check);
		
		System.out.println(service.findTarget(product1));
		
		service.update(product2, "신발", 10000, 2);
		
//		System.out.println(service.findAll());
		
		service.delete(product1);
		System.out.println(service.findAll());
		
		service.delete("신발");
		System.out.println(service.findAll());
		
		DBConnecter.products.add(0, product2);
		DBConnecter.products.add(1, product1);
		System.out.println(service.findAll());
	}
}
