CREATE DATABASE shopping;
USE shopping;

CREATE TABLE Customer(
Customer_ID INT,
CONSTRAINT customer_pk PRIMARY KEY(Customer_ID),
Name VARCHAR(20),
Ph_no INT
);

CREATE TABLE Product(
Product_ID INT,
CONSTRAINT product_pk PRIMARY KEY(Product_ID),
PRICE INT
);

CREATE TABLE BAG(
Bag_ID INT PRIMARY KEY,
Customer_ID INT,
Product_ID INT,
FOREIGN KEY (Customer_ID) REFERENCES Customer(Customer_ID),
FOREIGN KEY (Product_ID) REFERENCES Product(Product_ID),
Quantity INT,
ADATE DATE
);

INSERT INTO Customer VALUES(1001, 'ABC', 123);
INSERT INTO Customer VALUES(1002, 'DEF', 456);
INSERT INTO Customer VALUES(1003, 'GHI', 789);
INSERT INTO Customer VALUES(1004, 'JKL', 147);
INSERT INTO Customer VALUES(1005, 'MNO', 584);

INSERT INTO Product VALUES(101, 20);
INSERT INTO Product VALUES(102, 25);
INSERT INTO Product VALUES(103, 10);
INSERT INTO Product VALUES(104, 15);
INSERT INTO Product VALUES(105, 30);

INSERT INTO BUY VALUES(1, 1001, 102, 2, '2023-02-01');
INSERT INTO BUY VALUES(2, 1005, 103, 1, '2023-02-04');
INSERT INTO BUY VALUES(3, 1004, 102, 1, '2023-02-11');
INSERT INTO BUY VALUES(4, 1001, 101, 2, '2023-02-21');
INSERT INTO BUY VALUES(6, 1003, 104, 5, '2023-02-19');
INSERT INTO BUY VALUES(7, 1005, 105, 1, '2023-02-24');
INSERT INTO BUY VALUES(8, 1004, 101, 2, '2023-02-27');
INSERT INTO BUY VALUES(9, 1004, 102, 1, '2023-02-13');
INSERT INTO BUY VALUES(10, 1005, 105, 1, '2023-02-16');
INSERT INTO BUY VALUES(11, 1001, 102, 1, '2023-02-18');

SELECT Customer.Name
FROM Customer
INNER JOIN Buy ON Customer.Customer_ID=Bag.Customer_ID
WHERE Buy.Product_ID = 102;

SELECT Product.Product_ID
FROM Product
INNER JOIN Buy ON Buy.Product_ID = Product.Product_ID
WHERE Price IN (SELECT MAX(Price) FROM Product);

SELECT Product_Id, SUM(Quantity)
FROM BUY
GROUP BY Product_ID
HAVING SUM(QUANTITY) >= ALL (SELECT SUM(QUANTITY) FROM BUY GROUP BY Product_ID);



