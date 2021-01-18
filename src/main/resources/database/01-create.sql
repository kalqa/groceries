--liquibase formatted sql
--changeset kalqa:1
CREATE TABLE list_of_products
(
    id              BIGINT AUTO_INCREMENT,
    product_id      BIGINT,
    shoppinglist_id BIGINT,
    primary key (id)
);

CREATE TABLE product
(
    product_id BIGINT AUTO_INCREMENT,
    name       varchar(400),
    price      double,
    primary key (product_id)
);

CREATE TABLE shoppinglist
(
    shoppinglist_id BIGINT AUTO_INCREMENT,
    name            varchar(400),
    primary key (shoppinglist_id)
);

alter TABLE list_of_products
    add constraint product_id_list_of_products foreign key (product_id) references product;

alter TABLE list_of_products
    add constraint shoppinglist_id_list_of_products foreign key (shoppinglist_id) references shoppinglist;