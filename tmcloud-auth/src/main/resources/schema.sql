CREATE TABLE `role` (
  `role_id` INT AUTO_INCREMENT
    PRIMARY KEY,
  `role`    VARCHAR(255) NULL
)
  CHARACTER SET = utf8;

CREATE TABLE `user` (
  `user_id`                  BIGINT AUTO_INCREMENT
    PRIMARY KEY,
  `gender`                   VARCHAR(255),
  `age`                      VARCHAR(255),
  `identity`                 VARCHAR(255),
  `last_password_reset_date` DATETIME,
  `password`                 VARCHAR(255) NOT NULL,
  `phone`                    VARCHAR(255) NOT NULL,
  `real_name`                VARCHAR(255)
)
  CHARACTER SET = utf8;


CREATE TABLE `user_role` (
  `user_id` BIGINT NOT NULL,
  `role_id` INT    NOT NULL,
  FOREIGN KEY (`user_id`) REFERENCES user (`user_id`),
  FOREIGN KEY (`role_id`) REFERENCES role (`role_id`)
)
  CHARACTER SET = utf8;






