DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
    id int,
    first_name varchar(255),
    last_name varchar(255),
    address varchar(255),
    city varchar(255)
);

DROP TABLE IF EXISTS product;
CREATE TABLE product (
    id int,
    description varchar(255),
    weight double
);

DROP TABLE IF EXISTS shipping;
CREATE TABLE shipping (
    id int,
    customer_id int,
    state varchar(255),
    send_date DATE,
    arrive_date DATE,
    priority int
);

DROP TABLE IF EXISTS shipping_item;
CREATE TABLE shipping_item (
    id int,
    shipping_id int,
    product_id int,
    product_count int
);