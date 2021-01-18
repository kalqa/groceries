--liquibase formatted sql
--changeset kalqa:1
insert into SHOPPINGLIST(shoppinglist_id, name)
values (1, 'lista poniedziałkowa');
insert into SHOPPINGLIST(shoppinglist_id, name)
values (2, 'lista wtorkowa');
insert into SHOPPINGLIST(shoppinglist_id, name)
values (3, 'lista środowa');
insert into SHOPPINGLIST(shoppinglist_id, name)
values (4, 'bez nazwy');