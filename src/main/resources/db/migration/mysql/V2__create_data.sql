INSERT INTO `pizza_order` (`id`,`amount`,`complete_date_time`,`completed`,`order_date_time`) VALUES (1,40.00,NULL,0,'2018-06-11 20:34:56');
INSERT INTO `pizza_order` (`id`,`amount`,`complete_date_time`,`completed`,`order_date_time`) VALUES (6,37.00,NULL,0,'2018-06-11 20:35:30');
INSERT INTO `pizza_order` (`id`,`amount`,`complete_date_time`,`completed`,`order_date_time`) VALUES (10,26.00,NULL,0,'2018-06-11 20:35:56');
INSERT INTO `pizza_order` (`id`,`amount`,`complete_date_time`,`completed`,`order_date_time`) VALUES (18,45.00,NULL,0,'2018-06-12 19:56:25');

INSERT INTO `order_item` (`id`,`description`,`pizza_order_id`) VALUES (2,'Margherita',1);
INSERT INTO `order_item` (`id`,`description`,`pizza_order_id`) VALUES (3,'Hawajska',1);
INSERT INTO `order_item` (`id`,`description`,`pizza_order_id`) VALUES (4,'Tea',1);
INSERT INTO `order_item` (`id`,`description`,`pizza_order_id`) VALUES (5,'Water',1);
INSERT INTO `order_item` (`id`,`description`,`pizza_order_id`) VALUES (7,'chipsy',6);
INSERT INTO `order_item` (`id`,`description`,`pizza_order_id`) VALUES (8,'Burger Pizza',6);
INSERT INTO `order_item` (`id`,`description`,`pizza_order_id`) VALUES (9,'Cola',6);
INSERT INTO `order_item` (`id`,`description`,`pizza_order_id`) VALUES (11,'Pizza Broccolli',10);
INSERT INTO `order_item` (`id`,`description`,`pizza_order_id`) VALUES (19,'Pizza Hawajska',18);
INSERT INTO `order_item` (`id`,`description`,`pizza_order_id`) VALUES (20,'Pizza Diabelska',18);
INSERT INTO `order_item` (`id`,`description`,`pizza_order_id`) VALUES (21,'Piwko',18);


INSERT INTO `hibernate_sequence` (`next_val`) VALUES (24);
INSERT INTO `hibernate_sequence` (`next_val`) VALUES (24);
INSERT INTO `hibernate_sequence` (`next_val`) VALUES (24);
INSERT INTO `hibernate_sequence` (`next_val`) VALUES (24);