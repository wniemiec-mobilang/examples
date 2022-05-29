USE `close2booking`;

DROP TABLE IF EXISTS `stay`;
DROP TABLE IF EXISTS `site`;
DROP TABLE IF EXISTS `site_stays`;
DROP TABLE IF EXISTS `user_favorites`;
DROP TABLE IF EXISTS `user_reviews`;
DROP TABLE IF EXISTS `review`;
DROP TABLE IF EXISTS `stay_reviews`;
DROP TABLE IF EXISTS `user`;

CREATE TABLE `site` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `site`
(`id`, `image`,`name`, `type`)
VALUES (1, "campos-do-jordao.png", "Campos do Jordão", "quick");

INSERT INTO `site`
(`id`, `image`,`name`, `type`)
VALUES (2, "gramado.png", "Gramado", "quick");

INSERT INTO `site`
(`id`, `image`,`name`, `type`)
VALUES (3, "monte-verde.png", "Monte Verde", "quick");

INSERT INTO `site`
(`id`, `image`,`name`, `type`)
VALUES (4, "torres.png", "Torres", "nature");

INSERT INTO `site`
(`id`, `image`,`name`, `type`)
VALUES (5, "urubici.png", "Urubici", "nature");

INSERT INTO `site`
(`id`, `image`,`name`, `type`)
VALUES (6, "garopaba.png", "Garopaba", "nature");

CREATE TABLE `stay` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eco` bit(1) DEFAULT NULL,
  `breakfast` bit(1) DEFAULT NULL,
  `fee` double DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `mobile` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `new_price` double DEFAULT NULL,
  `old_price` double DEFAULT NULL,
  `price_description` varchar(255) DEFAULT NULL,
  `room_type` varchar(255) DEFAULT NULL,
  `total_beds` int(11) DEFAULT NULL,
  `site_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKthok6fxnn2vt3kbqy6swl34mf` (`site_id`),
  CONSTRAINT `FKthok6fxnn2vt3kbqy6swl34mf` FOREIGN KEY (`site_id`) REFERENCES `site` (`id`)
);

INSERT INTO `stay`
(`id`,`eco`,`breakfast`,`fee`, `image`, `location`, `mobile`, `name`, `new_price`, `old_price`, `price_description`, `room_type`, `total_beds`)
VALUES (1, 0, 1, 0.0, "flat1.jpg", "400m from center", 0, "Encantos Torres Hotel", 160.0, 178.0, "Price for 1 night, 2 adults", "Deluxe Twin Room", 2);

INSERT INTO `stay`
(`id`,`eco`,`breakfast`,`fee`, `image`, `location`, `mobile`, `name`, `new_price`, `old_price`, `price_description`, `room_type`, `total_beds`)
VALUES (2, 1, 0, 115.0, "flat2.png", "650m from center", 1, "Paraiso Beira Mar", 154.0, 190.0, "Price for 1 night, 2 adults", "Studio Apartment", 2);

INSERT INTO `stay`
(`id`,`eco`,`breakfast`,`fee`, `image`, `location`, `mobile`, `name`, `new_price`, `old_price`, `price_description`, `room_type`, `total_beds`)
VALUES (3, 0, 1, 0.0, "flat1.jpg", "2.6km from center", 0, "Pousada Fazenda da Invernada", 315.0, 330.0, "Price for 1 night, 2 adults", "Superior Suite", 3);

INSERT INTO `stay`
(`id`,`eco`,`breakfast`,`fee`, `image`, `location`, `mobile`, `name`, `new_price`, `old_price`, `price_description`, `room_type`, `total_beds`)
VALUES (4, 1, 1, 0.0, "flat2.png", "150m from center", 1, "Império Cabanas", 460.0, 554.0, "Price for 1 night, 2 adults", "Villa", 3);

INSERT INTO `stay`
(`id`,`eco`,`breakfast`,`fee`, `image`, `location`, `mobile`, `name`, `new_price`, `old_price`, `price_description`, `room_type`, `total_beds`)
VALUES (5, 0, 1, 0.0, "flat1.jpg", "4.6km from center", 0, "Pousada Bem te vi", 111.0, 124.0, "Price for 1 night, 2 adults", "Family Suite", 3);

INSERT INTO `stay`
(`id`,`eco`,`breakfast`,`fee`, `image`, `location`, `mobile`, `name`, `new_price`, `old_price`, `price_description`, `room_type`, `total_beds`)
VALUES (6, 0, 1, 0.0, "flat2.png", "5km from center", 0, "Pousada Bem te vi", 137.0, 155.0, "Price for 1 night, 2 adults", "Family Room with Balcony", 3);

INSERT INTO `stay`
(`id`,`eco`,`breakfast`,`fee`, `image`, `location`, `mobile`, `name`, `new_price`, `old_price`, `price_description`, `room_type`, `total_beds`)
VALUES (7, 0, 1, 72.0, "flat1.jpg", "4.6km from center", 1, "Hotel Platanus", 743.0, 884.0, "Price for 1 night, 2 adults", "Standard Double Room", 1);

INSERT INTO `stay`
(`id`,`eco`,`breakfast`,`fee`, `image`, `location`, `mobile`, `name`, `new_price`, `old_price`, `price_description`, `room_type`, `total_beds`)
VALUES (8, 1, 1, 72.0, "flat2.png", "2.2km from center", 1, "Pousada Plazzale", 2631.0, 1896.0, "Price for 1 night, 2 adults", "Family Suite with Balcony", 3);

INSERT INTO `stay`
(`id`,`eco`,`breakfast`,`fee`, `image`, `location`, `mobile`, `name`, `new_price`, `old_price`, `price_description`, `room_type`, `total_beds`)
VALUES (9, 1, 1, 3.0, "flat1.jpg", "1.1km from center", 1, "Pousada Plazzale", 473.0, 590.0, "Price for 1 night, 2 adults", "Luxury Room", 1);

INSERT INTO `stay`
(`id`,`eco`,`breakfast`,`fee`, `image`, `location`, `mobile`, `name`, `new_price`, `old_price`, `price_description`, `room_type`, `total_beds`)
VALUES (10, 0, 1, 3.0, "flat2.png", "950km from center", 0, "Pousada Plazzale", 416.0, 470.0, "Price for 1 night, 2 adults", "Deluxe Double Room", 1);

INSERT INTO `stay`
(`id`,`eco`,`breakfast`,`fee`, `image`, `location`, `mobile`, `name`, `new_price`, `old_price`, `price_description`, `room_type`, `total_beds`)
VALUES (11, 0, 1, 0.0, "flat1.jpg", "900m from center", 1, "Pousada Recando da Natureza", 1203.0, 1485.0, "Price for 1 night, 2 adults", "Standard Bungalow with Fireplace", 1);

INSERT INTO `stay`
(`id`,`eco`,`breakfast`,`fee`, `image`, `location`, `mobile`, `name`, `new_price`, `old_price`, `price_description`, `room_type`, `total_beds`)
VALUES (12, 1, 1, 0.0, "flat2.png", "1.6km from center", 1, "Estalagem Serra de Minas", 2672.0, 2969.0, "Price for 1 night, 2 adults", "Superior Chalet", 1);

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `level` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `user`
(`id`, `name`,`level`)
VALUES (1, "William", 1);

INSERT INTO `user`
(`id`, `name`,`level`)
VALUES (2, "Rafael", 1);

INSERT INTO `user`
(`id`, `name`,`level`)
VALUES (3, "Érika", 1);

CREATE TABLE `user_favorites` (
  `user_id` int(11) NOT NULL,
  `favorites_id` int(11) NOT NULL,
  UNIQUE KEY `UK_dk8ngwbk9dgeuegrx1nuktdv1` (`favorites_id`),
  KEY `FK848qdyqh37xmekek29npyyjuo` (`user_id`),
  CONSTRAINT `FK67x0h5y39724p1misbp0gjd04` FOREIGN KEY (`favorites_id`) REFERENCES `stay` (`id`),
  CONSTRAINT `FK848qdyqh37xmekek29npyyjuo` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
);

INSERT INTO `user_favorites`
(`user_id`, `favorites_id`)
VALUES (1, 1);

INSERT INTO `user_favorites`
(`user_id`, `favorites_id`)
VALUES (1, 6);

CREATE TABLE `review` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rating` double DEFAULT NULL,
  `author_id` int(11) DEFAULT NULL,
  `stay_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKhaxvalsvi9mqlu2kq5ev0wgys` (`author_id`),
  KEY `FKrd29ptrok3auumda2tqi92iry` (`stay_id`),
  CONSTRAINT `FKhaxvalsvi9mqlu2kq5ev0wgys` FOREIGN KEY (`author_id`) REFERENCES `user` (`id`),
  CONSTRAINT `FKrd29ptrok3auumda2tqi92iry` FOREIGN KEY (`stay_id`) REFERENCES `stay` (`id`)
);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (1, 9.6, 1);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (2, 9.3, 1);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (3, 9.6, 2);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (4, 9.6, 3);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (5, 9.6, 1);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (6, 9.6, 3);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (7, 8.6, 1);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (8, 8.3, 2);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (9, 8.3, 2);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (10, 8.8, 3);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (11, 8.9, 3);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (12, 8.7, 3);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (13, 9.2, 2);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (14, 9.2, 2);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (15, 9.2, 2);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (16, 9.2, 2);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (17, 9.0, 3);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (18, 8.9, 2);

INSERT INTO `review`
(`id`, `rating`, `author_id`)
VALUES (19, 9.6, 1);

CREATE TABLE `site_stays` (
  `site_id` int(11) NOT NULL,
  `stays_id` int(11) NOT NULL,
  UNIQUE KEY `UK_2wa1vi55ml9lx20nls48ixiqx` (`stays_id`),
  KEY `FKsfrrmaryk1n1horq15wrlm73` (`site_id`),
  CONSTRAINT `FK10x8plkvggpj6s6gftg65q2d6` FOREIGN KEY (`stays_id`) REFERENCES `stay` (`id`),
  CONSTRAINT `FKsfrrmaryk1n1horq15wrlm73` FOREIGN KEY (`site_id`) REFERENCES `site` (`id`)
);

INSERT INTO `site_stays`
(`stays_id`, `site_id`)
VALUES (1, 4);

INSERT INTO `site_stays`
(`stays_id`, `site_id`)
VALUES (2, 4);

INSERT INTO `site_stays`
(`stays_id`, `site_id`)
VALUES (3, 5);

INSERT INTO `site_stays`
(`stays_id`, `site_id`)
VALUES (4, 5);

INSERT INTO `site_stays`
(`stays_id`, `site_id`)
VALUES (5, 6);

INSERT INTO `site_stays`
(`stays_id`, `site_id`)
VALUES (6, 6);

INSERT INTO `site_stays`
(`stays_id`, `site_id`)
VALUES (7, 1);

INSERT INTO `site_stays`
(`stays_id`, `site_id`)
VALUES (8, 1);

INSERT INTO `site_stays`
(`stays_id`, `site_id`)
VALUES (9, 2);

INSERT INTO `site_stays`
(`stays_id`, `site_id`)
VALUES (10, 2);

INSERT INTO `site_stays`
(`stays_id`, `site_id`)
VALUES (11, 3);

INSERT INTO `site_stays`
(`stays_id`, `site_id`)
VALUES (12, 3);

CREATE TABLE `user_reviews` (
  `user_id` int(11) NOT NULL,
  `reviews_id` int(11) NOT NULL,
  UNIQUE KEY `UK_63oe4q3ebxsiwoskr5fmxxr8i` (`reviews_id`),
  KEY `FKmpa6y70qlh5ktrbf4kgxtlqxt` (`user_id`),
  CONSTRAINT `FK34lot9t78mgstbdgjx7tqt675` FOREIGN KEY (`reviews_id`) REFERENCES `review` (`id`),
  CONSTRAINT `FKmpa6y70qlh5ktrbf4kgxtlqxt` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (1, 1);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (1, 2);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (2, 3);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (3, 4);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (1, 5);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (3, 6);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (1, 7);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (2, 8);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (2, 9);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (3, 10);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (3, 11);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (3, 12);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (2, 13);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (2, 14);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (2, 15);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (2, 16);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (3, 17);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (2, 18);

INSERT INTO `user_reviews`
(`user_id`, `reviews_id`)
VALUES (1, 19);

CREATE TABLE `stay_reviews` (
  `stay_id` int(11) NOT NULL,
  `reviews_id` int(11) NOT NULL,
  UNIQUE KEY `UK_59n5ybpg2noqr3m2t0hgoo2ij` (`reviews_id`),
  KEY `FKhor57r1gshis31cln8mln9v47` (`stay_id`),
  CONSTRAINT `FKgaoj9b2wuopgemuubaped8yt3` FOREIGN KEY (`reviews_id`) REFERENCES `review` (`id`),
  CONSTRAINT `FKhor57r1gshis31cln8mln9v47` FOREIGN KEY (`stay_id`) REFERENCES `stay` (`id`)
);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (1, 1);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (2, 2);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (3, 3);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (4, 3);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (5, 4);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (6, 5);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (7, 5);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (8, 6);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (9, 6);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (10, 6);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (11, 7);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (12, 8);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (13, 8);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (14, 9);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (15, 9);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (16, 10);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (17, 11);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (18, 11);

INSERT INTO `stay_reviews`
(`reviews_id`, `stay_id`)
VALUES (19, 12);