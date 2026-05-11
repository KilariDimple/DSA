# Write your MySQL query statement below
select  w1.id as id
from Weather w1
join Weather w2
on DATEDIFF(W1.recordDate,W2.recordDate)=1
WHERE w1.temperature>w2.temperature ;