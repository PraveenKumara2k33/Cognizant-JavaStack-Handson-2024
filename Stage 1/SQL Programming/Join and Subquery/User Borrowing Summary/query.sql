select 
    u.username,
    count(b.borrowing_id) as Number_of_books
from 
    USER u
left join 
    BORROWING b on u.user_id = b.user_id
group by 
    u.user_id
order by 
    u.user_id desc;
