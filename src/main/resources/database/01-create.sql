--liquibase formatted sql
--changeset kalqa:1
CREATE TABLE list_of_products
(
    id              BIGINT AUTO_INCREMENT,
    product_id      BIGINT,
    shoppinglist_id BIGINT,
    primary key (id)
);

--changeset kalqa:2
CREATE TABLE product
(
    product_id BIGINT AUTO_INCREMENT,
    name       varchar(400),
    price      double,
    primary key (product_id)
);

--changeset kalqa:3
CREATE TABLE shoppinglist
(
    shoppinglist_id BIGINT AUTO_INCREMENT,
    name            varchar(400),
    primary key (shoppinglist_id)
);

--changeset kalqa:4
ALTER TABLE list_of_products
    ADD CONSTRAINT product_id_list_of_products
        FOREIGN KEY (product_id) REFERENCES product (product_id);

--changeset kalqa:5
ALTER TABLE list_of_products
    ADD CONSTRAINT shoppinglist_id_list_of_products
        FOREIGN KEY (shoppinglist_id) REFERENCES shoppinglist (shoppinglist_id);