SELECT user_id, username, gender
FROM USER
WHERE email LIKE '%@yahoo.com'
ORDER BY user_id DESC;
