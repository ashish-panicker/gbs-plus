package com.gbsplus;

import com.gbsplus.controller.BookController;
import com.gbsplus.service.BookService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        int option = 0;
        BookController controller = new BookController(new BookService());
        do {
            // menu
            System.out.println("1. Add book");
            System.out.println("2. Find by title");
            System.out.println("3. Find by author");
            System.out.println("4. Print");
            System.out.println("5. Exit");

            System.out.println("Enter option: ");
            option = Integer.parseInt(System.console().readLine());

            switch (option) {
                case 1:
                    controller.addBook();
                    break;
                case 2:
                   controller.findByTitle();
                    break;
                case 3:
                    controller.findByAuthor();
                    break;
                case 4:
                    controller.print();
                    break;
                case 5:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        } while (option != 5);
    }
}
