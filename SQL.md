# SQL 
### Points
* SQL stands for Structured Query Language
* SQL lets you access and manipulate databases
* SQL keywords are NOT case sensitive: select is the same as SELECT
* Tutorial Based on w3schools , the database table can be found there to practice.
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
---
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
---
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
---

#### NULL Value
A NULL value is different from a zero value or a field that contains spaces. A field
with a NULL value is one that has been left blank during record creation!

It is not possible to test for NULL values with comparison operators, such as =, <, or <>.

We will have to use the IS NULL and IS NOT NULL operators instead.
```sql
SELECT column_names
FROM table_name
WHERE column_nmae IS NULL;

SELECT column_names
FROM table_name
WHERE column_nmae IS NOT NULL;
```
Always use IS NULL to look for NULL values.

---

#### SQL UPDATE Statement

Syntax:
```sql
UPDATE table_name
SET column1 = value1, column2 = value2,...
WHERE condition;
```
Be careful when updating records in a table! Notice the WHERE clause in the UPDATE 
statement. The WHERE clause specifies which record(s) that should be updated. If you 
omit the WHERE clause, all records in the table will be updated!

```sql
UPDATE Customers
SET ContactName = 'Ram Prasad', City = 'Pokhara'
WHERE ContactName = 'Ram Bahadur';
```

---
#### SQL DELETE Statement
```sql
DELETE FROM table_name WHERE condition;
```
```sql
DELETE FROM Customers WHERE ContactName = 'Ram bahadur';
```
##### Delete All Records
```sql
DELETE FROM table_name;
```
The following SQL statement deltes all rows in the "Customers" table, without deleting the table:

```sql
DELETE FROM Customers
```
---
#### SELECT TOP Clause

The SELECT TOP clause is used to specify the number of records to return.

The SELECT TOP clause is useful on large database, to return only the top results which couldbe more relevant.

**Note :** Not all database systems support the SELECT TOP clause. MySQL supports the LIMIT clause to select a limited number of records, while Oracle uses ROWNUM.

**SQL server/MS Access Syntax:**
```sql
SELECT TOP number|percent column_name(s)
FROM table_name
WHERE condition;

SELECT TOP 3 * FROM Customers;
```
**MySQL Syntax**
```sql
SELECT column_name(s)
FROM table_name
WHERE condition
LIMIT number;

SELECT * FROM Customers
LIMIT 3;
```
**Oracle Syntax:**
```sql
SELECT column_name(s)
FROM table_name
WHERE ROWNUM <= number;

SELECT * FROM Customers
WHERE ROWNUM <= 3;
```
example with PERCENT and WHERE clause:
```sql
SELECT TOP 50 PERCENT * FROM Customers Where City = 'Kathmandu';
```
---
#### SQL MIN() and MAX() Function:

MIN() Syntax
```sql 
SELECT MIN(column_name)
FROM table_name
WHERE condition;

SELECT MIN(Price) AS SmallestPrice
FROM Products;
```
MAX() Syntax
```sql
SELECT MAX(column_name)
FROM table_name
WHERE condition;

SELECT MAX(Price) AS LargestPrice
FROM Products;
```
---
#### SQL COUNT(), AVG() and SUM() Function:
##### Count() Syntax
```sql
SELECT COUNT ( column_name )
FROM table_name
WHERE condition;

SELECT COUNT(ProductID)
FROM Products;
```
NULL values are not counted.
```sql 
SELECT AVG(column_name)
FROM table_name
WHERE condition;

SELECT AVG(Price)
FROM Products
WHERE Name = ' Himalaya ';
```
```sql
SELECT SUM(column_name)
FROM Table_name
WHERE condition;

SELECT SUM(Price)
FROM Products
WHERE Name = 'Himalaya';
```
---
#### SQL LIKE Operator

```sql
SELECT column1, column2, ...
FROM table_name
WHERE column LIKE pattern;

```
You can also combine any number of conditions using AND or OR operators.

Some Examples:

| **LIKE Operator	                |              Description**                                                    |
|-----------------------------------|-------------------------------------------------------------------------------|
| WHERE CustomerName LIKE 'a%'	    | Finds any values that start with "a"                                          |
| WHERE CustomerName LIKE '%a'	    | Finds any values that end with "a"                                            |
| WHERE CustomerName LIKE '%or%'	|    Finds any values that have "or" in any position                            |
| WHERE CustomerName LIKE '\_r'	    | Finds any values that have "r" in the second position                         |
| WHERE CustomerName LIKE 'a__%'    | Finds any values that start with "a" and are at least 3 characters in length  |
| WHERE ContactName LIKE 'a%o'	    | Finds any values that start with "a" and ends with "o"                        |


NOT operator can also be used
```sql
SELECT * FROM Customers
WHERE CustomerName NOT LIKE '%a';

#returns all names that dont end with 'a'
```

---

#### Wildcard Characters in SQL Server:

|**Symbol	    |        Description	                                        |     Example**                        |
|---------------|---------------------------------------------------------------|--------------------------------------|
|%	            | Represents zero or more characters	                        | bl% finds bl, black, blue, and blob  |
|_	            | Represents a single character	                                | h_t finds hot, hat, and hit          |
|[]	            | Represents any single character within the brackets           | h[oa]t finds hot and hat, but not hit|
|               | within the brackets                     	| but not hit                          |
|^	            | Represents any character not in           | h[^oa]t finds hit, but not           |
|               | the brackets	                            | hot and hat                          |
|-	            | Represents a range of characters	        | c[a-b]t finds cat and cbt            |

---




















