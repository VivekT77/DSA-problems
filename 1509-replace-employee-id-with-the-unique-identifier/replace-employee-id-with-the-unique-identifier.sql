# Write your MySQL query statement below

-- SELECT EmployeeUNI.unique_id , Employees.name FROM employees LEFT JOIN EmployeeUNI ON EmployeeUNI.id = Employees.id;

SELECT EmployeeUNI.unique_id , Employees.name FROM employees LEFT JOIN EmployeeUNI USING(id);