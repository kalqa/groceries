--liquibase formatted sql
--changeset kalqa:1
CREATE TABLE LIST_OF_PRODUCTS
(
    id              BIGINT AUTO_INCREMENT,
    product_id      BIGINT,
    shoppinglist_id BIGINT,
    primary key (id)
);

--changeset kalqa:2
CREATE TABLE PRODUCT
(
    product_id BIGINT AUTO_INCREMENT,
    name       varchar(400),
    price      double,
    primary key (product_id)
);

--changeset kalqa:3
CREATE TABLE SHOPPINGLIST
(
    shoppinglist_id BIGINT AUTO_INCREMENT,
    name            varchar(400),
    primary key (shoppinglist_id)
);

--changeset kalqa:4
ALTER TABLE LIST_OF_PRODUCTS
    ADD CONSTRAINT PRODUCT_ID_LIST_OF_PRODUCTS
        FOREIGN KEY (product_id) REFERENCES PRODUCT (product_id);

--changeset kalqa:5
ALTER TABLE LIST_OF_PRODUCTS
    ADD CONSTRAINT SHOPPINGLIST_ID_LIST_OF_PRODUCTS
        FOREIGN KEY (shoppinglist_id) REFERENCES SHOPPINGLIST (shoppinglist_id);