
public class Main {

	public static void main(String[] args) {
		// object oriented programming
		//Java OOP bir programlama dilidir
		// Nesneleri nesne yapan sadece ismi de�il di�er �zellikleri de onu tan�ml�yor ve tamaml�yor
		//Bu nesnelere Java'da class ddiyoruz bunlar �zellik tutucu classlar
		//�zellik tutucu ve operasyon classlar�
		
		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
				
		// class de�i�keni olu�turman�n y�ntemi
		        //set value	
		      
		       //get value
		
	/*	System.out.println(product1.name);
		System.out.println(product1.unitPrice);
		System.out.println(product1.discount);
		System.out.println(product1.unitsInStock);
		System.out.println(product1.imageUrl);
	*/
		
		Product product2 = new Product();
		
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
	
		Product product3 = new Product();
		
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		
		//ger�ek hayatta bu veriler databaseden gelir
		
		Product[] products = {product1,product2,product3};
		//foreach ile
		System.out.println("<ul>"); //html etiketi
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>"); //kapan���
		
    //Inheritance
		
		//Halk bank sitesinde internet subesi linkinde bireysel ve kurumsal olmak �zere2 tip m��teri var
		//bireyselin tc'si var kurumsal�n vergi numaras� var
		//bireyselin ki�i ad doyad� kurumsal�n firma ad� var
		//�z�nde bunlar�n ikisi de m��teri
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setCustomerNumber("123");
		individualCustomer.setId(1);
		individualCustomer.setPhone("12345678912");
		individualCustomer.setFirstName("engin");
		individualCustomer.setLastName("demiro�");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0533333333");
		corporateCustomer.setTaxNumber("1111111");
		corporateCustomer.setCustomerNumber("133456");
		
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
		
	}

}
