package oop1;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        oop1.Product product1 = new oop1.Product();
        // set value (altta productin içindeki değişkenlere değer atamış olduk.)
            product1.setName("Delonghi Kahve makinesi");
            product1.setDiscount(7);
            product1.setUnitPrice(7500);
            product1.setUnitsInStock(3);
            product1.setImageUrl("image1.jpg");
        //get value (okuma işlemi)
        //System.out.println(product1.name);

        oop1.Product product2 = new oop1.Product();
        product2.setName("Smeg Kahve makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");

        oop1.Product product3 = new oop1.Product();
        product3.setName("Kitchen Aid Kahve makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image1.jpg");


        oop1.Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (oop1.Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("<ul>");

        oop1.IndividualCustomer individualCustomer = new oop1.IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05222222222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiroğ");

        oop1.CorporateCustomer corporateCustomer = new oop1.CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("0533333333");
        corporateCustomer.setTaxNumber("11111111");
        corporateCustomer.setCustomerNumber("54321");

        oop1.Customer[] customers = {individualCustomer,corporateCustomer};



    }
}