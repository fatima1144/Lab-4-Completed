
import java.util.Scanner;

public class Shop {


    private Product productList[]= new Product[500];
    private Person owner;
    private String address;
    private static int productCount=0;

    private static double revenue;
	


    public Shop(Person owner, String address) {
        this.owner = owner;
        this.address = address;
        this.productList = new Product[100];
    }



    public void addProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product details");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        Product product = new Product(name, price, quantity);
        productList[productCount++]=product;
        System.out.println("Product added");


    }

    public void sale(){
        System.out.println("Sale Menu");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        String id= scanner.nextLine();
	

        for(int i=0; i<productCount; i++){

            if(productList[i].getId().equals(id))
            {
                productList[i].setQuantity(productList[i].getQuantity()-1);
                revenue+=productList[i].getPrice();
                System.out.println("Sale successful");
            }
			else {
				System.out.println("Product not found");
			}
            return;

        }


    }
	
	public void modifyProduct() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the product ID to modify: ");
    String id = scanner.nextLine();
	


    for (int i = 0; i < productCount; i++) {
        if (productList[i].getId().equals(id)) {
            System.out.println("Product found. Enter new details:");

            System.out.print("New Name: ");
            String newName = scanner.nextLine();
            if (!newName.isEmpty()) {
                productList[i].setName(newName);
            }

            System.out.print("New Price: ");
            double newPrice = scanner.nextDouble();
            if (newPrice >= 0) {
                productList[i].setPrice(newPrice);
            }

            System.out.print("New Quantity: ");
            int newQuantity = scanner.nextInt();
            if (newQuantity >= 0) {
                productList[i].setQuantity(newQuantity);
            }

            System.out.println("Product modified successfully.");
            return;
        }
    }

    System.out.println("Product not found.");
	}
	
	public void removeProduct() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the product ID to remove: ");
    String id = scanner.nextLine();
	

    for (int i = 0; i < productCount; i++) {
        if (productList[i].getId().equals(id)) {
        
            for (int j = i; j < productCount - 1; j++) {
                productList[j] = productList[j + 1];
            }
            productList[productCount - 1] = null; 
            productCount--;
            System.out.println("Product removed successfully.");
            return;
        }
    }

    System.out.println("Product not found.");
	}

	
	 public void displayProducts() {
        if (productCount == 0) {
            System.out.println("No products available.");
            return;
        }
        
        System.out.println("Product List:");
        for (int i = 0; i < productCount; i++) {
            Product product = productList[i];
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + 
                               ", Price: " + product.getPrice() + ", Quantity: " + product.getQuantity());
        }
    }
	

}