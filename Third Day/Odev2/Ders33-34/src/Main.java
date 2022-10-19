public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1,"Laptop","Asus Laptop",5000,3,"Silver","");

        /*
        product1.name = "Laptop";
        product1.id = 1;
        product1.description = "Asus Laptop";
        product1.price = 5000;
        product1.stockAmount = 3;
        System.out.println(product1.name); // çıktı --> Laptop
        */

        ProductManager productManager1 = new ProductManager();

        productManager1.Add(product1); // çıktı --> Ürün eklendi...Laptop
        // ProductManager class'ından product1 nesnesi oluşturduk ve içindeki bir metoda ulaştık

        System.out.println(product1.getCode());
    }
}
