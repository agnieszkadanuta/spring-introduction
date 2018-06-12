CREATE TABLE `charge_result` (
  `id` bigint(20) NOT NULL,
  `charge_date_time` datetime DEFAULT NULL,
  `decline_message` varchar(255) DEFAULT NULL,
  `successful` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `order_item` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `pizza_order_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKh7sy1nqmc3xbo4wxiko4aj4cw` (`pizza_order_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `pizza_order` (
  `id` bigint(20) NOT NULL,
  `amount` decimal(19,2) DEFAULT NULL,
  `complete_date_time` datetime DEFAULT NULL,
  `completed` bit(1) NOT NULL,
  `order_date_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `receipt` (
  `id` bigint(20) NOT NULL,
  `amount` decimal(19,2) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `successful` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;