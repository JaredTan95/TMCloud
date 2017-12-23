INSERT INTO `role` (`role`) VALUES ("ADMIN");
INSERT INTO `role` (`role`) VALUES ("USER");
INSERT INTO `user` (`real_name`, `phone`, `password`,`last_password_reset_date`)
VALUES ("admin", "adminphone", "$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi","2017-10-30 06:48:46");
INSERT INTO `user_role` (`user_id`, `role_id`) VALUES (1, 1);
INSERT INTO `user_role` (`user_id`, `role_id`) VALUES (1, 2);