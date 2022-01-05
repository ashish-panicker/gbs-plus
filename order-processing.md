# Assignment  - OrderProcessing

Create a java program with the following features.

- This will be a menu driven program with `3` options.
  
  ```
  1. Process an order
  2. View all orders
  3. Exit
  ```
- Oprion 1 would ask the users to provide the item details. Once an item is entered a promt will ask the user if they want to add another item. If answer is `Y` then the user will be prompted to enter the item details.
- The program must have a class called `OrderProcessing`.
- The program will have a class called `Order` for repreenting the order.
- Order class will have the following attributes.
  
  ```
  Order Id
  Customer Name
  Item List
  Net Price
  ```

- The program will have a class called `Item` for repreenting the items in the order.
- Item class will have the following attributes

    ```
    Item Code
    Item Name
    Unit Price
    Quantity
    Total Price 
    ```
  

- The order and item detaisl must be collected from the user.
- The order id must be uniquely generated.
- Once the items are completely entered the order must be processed and it must printed into the screen.
- Once the order is processed the order must be saved into a file.
- The file must be created inside the `orders` folder.
- The file name must be int the following format `order-#order_id`.
- Orders must be printed in a tabular format

    ```
    --------------------------------------------------------------------------
     Order Id:  1                                   Customer:    Ashish         

     Item Name             Qty     Unit Price     Total Price
     --------------------------------------------------------------------------
      Book - Animal Farm    1       72.99           72.99 
             Soap - Dove    2       44.99           89.98 
     Noodles - Spaghetti    3       23.99           71.97 
      Softdrinks - Pepsi    3       33.99           101.97 
            Flour - Atta    1       23.99           23.99 
    ---------------------------------------------------------------------------
     Net Total: 199.95 

    ```

- Option 2 will generate an output in the following format.
  
    ```
    Order Id          File name           Modified date
    -----------------------------------------------------------------------
    1                order-1              2020-01-01 12:00:00
    2                order-2              2020-01-02 12:00:00
    -----------------------------------------------------------------------

    Enter the order number you want to view

    ```
