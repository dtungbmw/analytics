INSERT INTO `portfolio`.`user` (`user_first_name`, `login`, `user_last_name`) VALUES ('David', 'dtung@greencharge.net', 'Tung');
INSERT INTO `portfolio`.`customer` (`customer_name`) VALUES ('Walmart');
INSERT INTO `portfolio`.`customer` (`customer_name`) VALUES ('7-Eleven');
INSERT INTO `portfolio`.`customer` (`customer_name`) VALUES ('UPS');
INSERT INTO `portfolio`.`customer` (`customer_name`) VALUES ('Walgreens');
INSERT INTO `portfolio`.`project` (`project_name`, `customer_id`, `user_id`) VALUES ('demo', '1', '1');
INSERT INTO `portfolio`.`site` (`site_name`, `project_name`, `address_one`, `city`, `state`, `zipcode`, `longitude`, `latitude`, `picture`, `project_id`) VALUES ('demo', 'demo', '4151 Burton Drive', 'Santa Clara', 'CA', '95054', '-121.963284', '37.407993', '/gs/assets/img/dashboard/a6fe.png', '1');
INSERT INTO `portfolio`.`meter` (`meter_name`, `total_savings`, `currency`, `currency_symbol`, `inverter_size_kw`, `battery_size_kwh`, `site_id`, `status`) VALUES ('demo', '45667.98', 'USD', '$', '60', '60', '1', 'Under Construction');
