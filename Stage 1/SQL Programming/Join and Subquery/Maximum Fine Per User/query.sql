select 
    u.user_id,
    u.username,
    (
        select 
            max(b.fine) 
        from 
            BORROWING b 
        where 
            b.user_id = u.user_id
    ) as max_fine
from 
    USER u
order by 
    u.user_id desc;
