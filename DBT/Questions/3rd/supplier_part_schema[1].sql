
CREATE TABLE suppliers
  (
	SNUM int NOT NULL PRIMARY KEY,
	SNAME varchar(16) NOT NULL UNIQUE,
	STATUS int NOT NULL,
	CITY varchar(20) NOT NULL
  );

  CREATE TABLE parts
  (
	PNUM int NOT NULL PRIMARY KEY,
	PNAME varchar(18) NOT NULL,
	COLOR varchar(10) NOT NULL,
	WEIGHT decimal(4,1) NOT NULL,
	CITY varchar(20) NOT NULL,
	UNIQUE (PNAME, COLOR, CITY)
  );

  CREATE TABLE orders
  (
	SNUM int NOT NULL REFERENCES S,
	PNUM int NOT NULL REFERENCES P,
	QTY int NOT NULL,
	PRIMARY KEY (SNUM, PNUM)
  );

  INSERT INTO suppliers VALUES (1, 'Smith', 20, 'London');
  INSERT INTO suppliers VALUES (2, 'Jones', 10, 'Paris');
  INSERT INTO suppliers VALUES (3, 'Blake', 30, 'Paris');
  INSERT INTO suppliers VALUES (4, 'Clark', 20, 'London');
  INSERT INTO suppliers VALUES (5, 'Adams', 30, 'Athens');
  INSERT INTO parts VALUES (1, 'Nut', 'Red', 12, 'London');
  INSERT INTO parts VALUES (2, 'Bolt', 'Green', 17, 'Paris');
  INSERT INTO parts VALUES (3, 'Screw', 'Blue', 17, 'Oslo');
  INSERT INTO parts VALUES (4, 'Screw', 'Red', 14, 'London');
  INSERT INTO parts VALUES (5, 'Cam', 'Blue', 12, 'Paris');
  INSERT INTO parts VALUES (6, 'Cog', 'Red', 19, 'London');
  INSERT INTO orders VALUES (1, 1, 300);
  INSERT INTO orders VALUES (1, 2, 200);
  INSERT INTO orders VALUES (1, 3, 400);
  INSERT INTO orders VALUES (1, 4, 200);
  INSERT INTO orders VALUES (1, 5, 100);
  INSERT INTO orders VALUES (1, 6, 100);
  INSERT INTO orders VALUES (2, 1, 300);
  INSERT INTO orders VALUES (2, 2, 400);
  INSERT INTO orders VALUES (3, 2, 200);
  INSERT INTO orders VALUES (4, 2, 200);
  INSERT INTO orders VALUES (4, 4, 300);
  INSERT INTO orders VALUES (4, 5, 400);