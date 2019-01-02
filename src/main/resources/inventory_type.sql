INSERT INTO inventory_type(name) VALUES('Tool');
INSERT INTO inventory_type(name) VALUES('Machinery');
INSERT INTO inventory_type(name) VALUES('Equipment');
INSERT INTO inventory_type(name) VALUES('Building');
INSERT INTO inventory_type(name) VALUES('Animal');
INSERT INTO inventory_type(name) VALUES('Consumable');
INSERT INTO inventory_type(name) VALUES('Software');

UPDATE inventory_type SET created_date = NOW();