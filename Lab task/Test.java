import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
		
		System.out.println("Product Management System.");
		System.out.println("---------------------------------");
		
		System.out.println("Enter 1 to Add product");
		System.out.println("Enter 2 to Sale product");
		System.out.println("Enter 3 to Modify product");
		System.out.println("Enter 4 to Remove product");
		System.out.println("Enter 5 to Display product");
		System.out.println("Enter 0 to Exit ");
		
		System.out.println("----------------------------------");
		
		

        Shop shop= new Shop(new Person("John", "email"),"Lahore");
        Scanner sc = new Scanner(System.in);
        while(true) {
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
					shop.addProduct();
					break;
                case 2:
                    shop.sale();
                    break;
				case 3:
					shop.modifyProduct();
					break;
				case 4:
					shop.removeProduct();
					break;
				case 5: 
					shop.displayProducts();
					break;
                case 0:
                   System.exit(0);
                   break;
                default:
            }
			



        }



    }
}