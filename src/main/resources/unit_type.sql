INSERT INTO unit_type(name) VALUES('CLIENT');
INSERT INTO unit_type(name) VALUES('PROVIDER');
INSERT INTO unit_type(name) VALUES('PERSON');

UPDATE unit_type SET created_date = NOW();