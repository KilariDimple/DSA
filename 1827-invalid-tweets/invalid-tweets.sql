# Write your MySQL query statement below
SELECT tweet_id 
FROM Tweets
where LENGTH(CONTENT)>15;