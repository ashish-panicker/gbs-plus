--      create table items 
--      (
--      id integer not null, category varchar(255), 
--      description varchar(255), image varchar(255), 
--      name varchar(255), price float, type varchar(255), 
--      primary key (id)
--      )

INSERT INTO items (id, category, item_description, item_image, item_name, price, item_type) 
VALUES (1, 'snack', 'Buttery and crunchy', 
        'https://d4t7t8y8xqo0t.cloudfront.net/resized/750X436/eazytrendz%2F1564%2Ftrend20170828054922.jpg', 
        'Buttery Croissants', 25.0, 'non veg');

INSERT INTO items (id, category, item_description, item_image, item_name, price, item_type) 
VALUES (2, 'snack', 'Flaky and spicy', 
        'https://us.123rf.com/450wm/aalaimages/aalaimages2104/aalaimages210400688/167791541-egg-puff-pastry-filled-with-spicy-and-tasty-egg-masala-and-placed-on-a-wooden-table-ware-with-grey-t.jpg?ver=6', 
        'Egg Puffs', 25.0, 'non veg');

INSERT INTO items (id, category, item_description, item_image, item_name, price, item_type) 
VALUES (3, 'beverage', 'Hot and fragrant', 
        'https://femina.wwmindia.com/content/2020/nov/smvegancappuccino1604596321.jpg', 
        'Milk Tea', 25.0, 'veg');

INSERT INTO items (id, category, item_description, item_image, item_name, price, item_type) 
VALUES (4, 'beverage', 'Souther filter coffee', 
        'https://static.toiimg.com/thumb/71520298.cms?resizemode=75&width=1200&height=900', 
        'Filter Coffee', 25.0, 'veg');