# Write your MySQL query statement below

-- 2nd approach where "using" is use instead of "ON"

SELECT E.name , B.bonus FROM Employee E
LEFT JOIN Bonus B USING (empId) 
WHERE B.bonus<1000 OR B.bonus IS NULL; 