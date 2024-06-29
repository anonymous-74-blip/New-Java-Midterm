/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midterm;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Midterm {
            
          int PID;
          String pName;
          int stockQTY;
          double price;
          
          public Midterm(int pID, String name, int sQTY, double price){
                    this.PID = pID;
                    this.pName = name;
                    this.stockQTY = sQTY;
                    this.price = price;
          }
          
          @Override
          public String toString() {
              return PID + "\t\t" + pName + "\t\t" + stockQTY + "\t\t" + price;
          }
          
          public static void storeProduct(HashMap<Integer, Midterm> products){
                    Scanner getProduct = new Scanner(System.in);
                    System.out.print("Enter Numbers of Product you want to add: ");
                    int getProductNumbers = getProduct.nextInt();
                    
                    for(int i=1; i<=getProductNumbers; i++){
                               int productID = i;
                               System.out.print("Enter Product Name: ");
                               String productName = getProduct.next();
                               System.out.print("Enter Product Stock QTY: ");
                               int productStock = getProduct.nextInt();
                               System.out.print("Enter Product Unit Price: ");
                               double productPrice = getProduct.nextDouble(); 
                               
                              
                               Midterm addProduct = new Midterm(productID, productName, productStock, productPrice);
                               products.put(addProduct.PID, addProduct);
                               
                    }
          }
          
          public static void main(String[] args) {
              
                    HashMap<Integer, Midterm> productMap = new HashMap<>();
                    Scanner sc = new Scanner(System.in);
                    System.out.print("1. Add to Inventory\n2. Create Order\nPlease select one process: \n");
                    int choice = sc.nextInt();
                    
                    switch (choice) {
                        case 1:
                                    storeProduct(productMap);
                                    System.out.print("PID\t\tName\t\tStockQTY\t\tUnit Price\n");
                                    for (Midterm product : productMap.values()) {
                                         System.out.println(product.toString());
                                    }
                            break;
                        case 2:
                                    
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
                            break;
                        case 5:
                            System.out.println("Exiting...");
                            return;
                        default:
                            System.out.println("Invalid choice!");
                    }
           }
}
