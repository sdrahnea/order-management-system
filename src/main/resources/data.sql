SELECT 1;
-- TO RUN default scrips for another tables, use the specific .sql files
-- insert into constant(name) values ('true'), ('false');
-- insert into order_type(name) values ('INPUT'), ('OUTPUT');
-- insert into order_status(name) values ('OPEN'), ('PREPARATION'), ('READY'), ('SHIPPING'), ('DELIVERED'), ('PAID'), ('CLOSED'), ('ARCHIVED');

-- INSERT INTO users(username, password) VALUES ('admin', '$2a$10$GIkct28TsCYqOgF4h/KefOVtViBQhhSFdCiyKAmxGYz2tX.JYVEfa');
--TODO add refrences on for entities {{package}} : com.omsentities.history

-- random data
-- update the created_date with random datetime +/-14 days as from NOW
-- UPDATE i_order SET created_date = (NOW() - INTERVAL FLOOR(RAND() * 14) DAY);
-- UPDATE i_order SET created_date = (NOW() - INTERVAL FLOOR(RAND() * 1000) DAY);
-- UPDATE inventory SET created_date = (NOW() - INTERVAL FLOOR(RAND() * 1000) DAY);