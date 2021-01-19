--liquibase formatted sql
--changeset kalqa:7
insert into shoppinglist(shoppinglist_id, name)
values (1, 'lista poniedziałkowa');
insert into shoppinglist(shoppinglist_id, name)
values (2, 'lista wtorkowa');
insert into shoppinglist(shoppinglist_id, name)
values (3, 'lista środowa');
insert into shoppinglist(shoppinglist_id, name)
values (4, 'bez nazwy');