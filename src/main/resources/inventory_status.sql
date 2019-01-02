INSERT INTO inventory_status(name) VALUES('New');
INSERT INTO inventory_status(name) VALUES('Active');
INSERT INTO inventory_status(name) VALUES('Consumed');
INSERT INTO inventory_status(name) VALUES('Inactive');
INSERT INTO inventory_status(name) VALUES('Destroyed');
INSERT INTO inventory_status(name) VALUES('Sold');

UPDATE inventory_status SET created_date = NOW();