# Coffee Store REST API

## Model Layer

```java

/*
    Menu class 
*/

public class Menu {

    private LocalDate menuDate;
    private String timeOfDay; // morning, noon, evening
    private Set<Item> menuItems;

}

/*
    Item class
*/

public class Item {

    private String name;
    private String description;
    private float price;
    private String category; // snack or beverage
    private String type; // veg or non veg
    private String image;
}


/*
    Order class
*/

public class Order {

    private String name;
    private String mobileNumber;
    private LocalDateTIme orderDate;
    private float totalPrice;
    private Set<Item> items;

}

```
