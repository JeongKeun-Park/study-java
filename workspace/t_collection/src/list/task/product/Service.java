package list.task.product;

import java.util.List;

import list.task.DBConnecter;

public class Service {

//	-상품 추가
	public void save(Product product) { // Product클래스를 입력받아
//		ArrayList 의 명령어중 추가해주는 명령어인 add를 사용한다
		DBConnecter.products.add(product);
	}

//	-상품 조회
//	overloading으로 두가지 메소드를 생성한다.
//	상품 통째로 입력했을 경우
	public Product findTarget(Product newProduct) { // 상품 전체의 정보를 입력받는다
//		빠른 for문으로 Product의 ArrayList를 확인한다
		for (Product product : DBConnecter.products) {
//			입력받은 newProduct의 필드요소가
//			검사중인 product ArrayList에 있다면
			if (product.equals(newProduct)) {
//				product를 리턴한다
				return product;
			}
		}
		return null;
	}

//	상품의 이름만 가지고 조회를 원할 경우
//	위와 같은 검사방법이지만 입력받는 값이 다르기때문에 
//	overloading 하여 원하는 값을 사용 할 수 있도록 한다.
	public Product findTarget(String name) {
		for (Product product : DBConnecter.products) {
			if (product.getName().equals(name)) {
				return product;
			}
		}
		return null;
	}

//	-상품 목록
	public List<Product> findAll() {
		return DBConnecter.products;
	}

//	-상품 수정
	
	public void update(Product newProduct, String name, int price, int stock) {
		Product product = findTarget(newProduct);
		if (product != null) {	
			product.setName(name);
			product.setPrice(price);
			product.setStock(stock);
		}
	}

//	-상품 삭제
//	overloading으로 두가지 메소드를 생성한다.
//	상품 통째로 입력했을 경우
	public void delete(Product deleteProduct) {
		DBConnecter.products.remove(deleteProduct);
	}

//	상품의 이름만 가지고 삭제하길 원할 경우
	public void delete(String name) {
		Product product = findTarget(name);

		if (product != null) {
//			상품 전체를 삭제하기때문에 product 객체가 들어간다.
			DBConnecter.products.remove(product);
		}

	}
}
