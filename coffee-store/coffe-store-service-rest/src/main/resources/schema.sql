create table items (
    id integer not null, 
    category varchar(255), 
    item_description varchar(255), 
    item_image varchar(255), 
    item_name varchar(255), 
    price float, 
    item_type varchar(255), 
    primary key (id)
);