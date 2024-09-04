# Write your MySQL query statement below

SELECT P.product_id , IFNULL(ROUND(SUM(units*price) / SUM(units),2) ,0 )AS average_price
FROM prices AS P
LEFT JOIN UnitsSold AS U
ON P.product_id = U.product_id AND purchase_date BETWEEN start_date AND end_date
GROUP BY 1;
