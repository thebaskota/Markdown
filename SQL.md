# SQL 
### Points
* SQL stands for Structured Query Language
* SQL lets you access and manipulate databases
* SQL keywords are NOT case sensitive: select is the same as SELECT
---
**Semicolon after SQL Statements?**
```
Some database systems require a semicolon at the end of each SQL statement.
Semicolon is the standard way to separate each SQL statement in database systems that allow more than one SQL
statement to be executed in the same call to the server.
```
---
**Some of The Most Important SQL Commands:**

**SELECT** - extracts data from a database

**UPDATE** - updates data in a database

**DELETE** - deletes data from a database

**INSERT INTO** - inserts new data into a database

**CREATE DATABASE** - creates a new database

**ALTER DATABASE** - modifies a database

**CREATE TABLE** - creates a new table

**ALTER TABLE** - modifies a table

**DROP TABLE** - deletes a table

**CREATE INDEX** - creates an index (search key)

**DROP INDEX** - deletes an index

---
### The Real Deal:

#### SELECT command

1. Select all records from a table Customer

    ```sql
    SELECT * FROM Customer;
    ```
    
    The data returned is stored in a result table, called the result-set.

2. Select column from table.

    ```sql
        SELECT column1, column2, ...
        FROM table_name
        
        SELECT CustomerName, City FROM Customers;
        
    ```
 3. SELECT DISTINCT syntax
 
    * The following SQL statement selects only the DISTINCT values from the "Country" 
    column in the "Customers" table:
    ```sql
        SELECT DISTINCT column1, column2, ...
        FROM table_name;
        
        SELECT DISTINCT Country FROM Customers;
    ```
    * The following SQL statement lists the number of different (distinct) customer countries:
    ```sql
        
        SELECT COUNT(DISTINCT Country) FROM Customers;
    ```
#### WHERE clause

The WHERE clause is used to filter records.

The WHERE clause is used to extract only those records that fulfill a specified condition.
```sql        
SELECT column1, column2, ...
FROM table_name
WHERE condition;

SELECT * FROM Customers
WHERE Country='Mexico';
```
SQL requires single quotes around text values (most database systems will also allow double quotes).

However, numeric fields should not be enclosed in quotes:
```sql
    SELECT * FROM Customers
    WHERE CustomerID=1;
    ```

Operators:

=	        Equal	
>	        Greater than	
<	        Less than	
>=	        Greater than or equal	
<=	        Less than or equal	
<>	        Not equal. Note: In some versions of SQL this operator may be written as !=	
BETWEEN	    Between a certain range	
LIKE	    Search for a pattern	
IN	        To specify multiple possible values for a column

```sql

SELECT * FROM Customers
WHERE Age BETWEEN 5 AND 20

SELECT * FROM customers 
WHERE City LIKE 's%';    #returns city name starting with s, for all cities just keep %'

SELECT * FROM Customers
WHERE City IN ('Paris','London');
```

##### AND , OR and NOT Operators

The WHERE clause can be combined with AND, OR and NOT operators.

```sql
SELECT column1, column2, ...
FROM table_name
WHERE conditional1 AND condition2 AND condition3 ...;

SELECT column1, column2, ...
FROM table_name
WHERE condition1 OR condition2 OR condition3 ...;

SELECT column1, column2, ...
FROM table_name
WHERE NOT condition;
```
--
#### ORDER BY
**Syntax**
```sql
SELECT column1,column2,...
FROM table_name
ORDER BY column1, column2, ... ASC|DESC;

```

eg:
```sql
SELECT CustomerName FROM Customers
ORDER BY Country;

SELECT * FROM Customers
ORDER BY Country DESC;
```
--
#### INSERT INTO
Used to insert new records in  a table.

```sql
INSERT INTO table_name (column1, column2, column3, ...)
VALUES (value1, value2, value3, ...);
```
example:
```sql
INSERT INTO Customers(CustomerName, ContactName, Address, City, Postalcode, Country)
VALUES('Ram Bahadur', 'Rame', 'Maitidevi' , 'Kathmandu','44100','Nepal');
```




















