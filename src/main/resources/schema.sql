CREATE TABLE PRODUCT
(
    id              BIGINT AUTO_INCREMENT PRIMARY KEY,
    name            VARCHAR(400) NOT NULL,
    shoppinglist_id BIGINT       NOT NULL
);

CREATE TABLE SHOPPINGLIST
(
    id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(400) NOT NULL
);

ALTER TABLE PRODUCT
    ADD CONSTRAINT product_shoppinglist_id
        FOREIGN KEY (shoppinglist_id) REFERENCES product (id)