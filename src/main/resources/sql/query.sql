DROP
DATABASE IF EXISTS kade;

CREATE
DATABASE IF NOT EXISTS kade;

USE kade;

CREATE TABLE customer (
    id      VARCHAR(35) PRIMARY KEY,
    name    VARCHAR(155) NOT NULL,
    address TEXT         NOT NULL,
    tel     VARCHAR(15)  NOT NULL
);

CREATE TABLE item(
    code        VARCHAR(35) PRIMARY KEY,
    description TEXT NOT NULL,
    qty_on_hand INT  NOT NULL,
    unit_price DOUBLE NOT NULL
);

SHOW TABLES;

DESC customer;