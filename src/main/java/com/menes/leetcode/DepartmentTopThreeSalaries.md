# Write your MySQL query statement below

# select d.name as Department, e.name as Employee, e.salary as Salary
# from Employee e left join Department d on e.departmentId = d.id
# order by e.salary desc
# limit 6;

SELECT
dep.name AS 'Department',
emp.name AS 'Employee',
emp.salary AS 'Salary'
FROM
Employee emp
JOIN
Department dep
ON emp.departmentId = dep.id
WHERE
3 > ( SELECT
COUNT(DISTINCT(emp2.salary))
FROM
Employee emp2
WHERE
emp2.salary > emp.salary
AND
emp2.DepartmentId = emp.DepartmentId        
)
;