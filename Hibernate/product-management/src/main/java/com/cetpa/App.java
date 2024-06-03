package com.cetpa;

import java.util.Scanner;

import com.cetpa.product.repositories.ProductRepository;
import com.cetpa.product.services.ProductService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ProductService productService = new ProductService();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	 System.out.println("......");
             System.out.println("Enter 1 for save product");
             System.out.println("Enter 2 for get product");
             System.out.println("Enter 3 for delete product");
             System.out.println("Enter 4 for product list");
             System.out.println("Enter 5 for exit");
             System.out.println("......");
             System.out.println("Enter your choice");
             int ch =Integer.parseInt(sc.nextLine());
             if(ch == 1) {
             	productService.saveProduct();
             	 System.out.println("Product has been saved successfully");
             }
             else if(ch == 2) {
            	 productService.getProduct();
             }
             else if(ch == 3) {
            	 productService.deleteProduct();
             }
             else if(ch == 4) {
            	 productService.showProduct();
             }

             else if(ch == 6) {
            	 System.out.println("Thanku ");
            	 break;
             }
            
        }
       
        
    }
}
