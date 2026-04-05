# Write your MySQL query statement below
-- SELECT 
--     (SELECT DISTINCT salary
--      FROM Employee 
--      ORDER BY salary DESC 
--      LIMIT 1 OFFSET 1) AS SecondHighestSalary;

select(
    select distinct salary
    from employee 
    order by salary desc
     limit 1 offset 1) as SecondHighestSalary;
