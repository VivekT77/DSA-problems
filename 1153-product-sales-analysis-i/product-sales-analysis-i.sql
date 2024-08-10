# Write your MySQL query statement below

SELECT Product.product_name, Sales.year, Sales.price from product right join sales on Sales.product_id = product.product_id;