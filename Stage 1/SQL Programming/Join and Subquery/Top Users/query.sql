select 
    u.username
from 
    USER u
join 
    (
        select 
            user_id,
            count(*) AS num_borrowed
        from 
            BORROWING
        group by 
            user_id
        order by 
            num_borrowed desc
        limit 1
    ) as max_borrowed on u.user_id = max_borrowed.user_id;
