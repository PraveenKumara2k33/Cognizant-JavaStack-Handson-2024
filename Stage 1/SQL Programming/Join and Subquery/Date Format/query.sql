select 
    u.username,
    b.borrowing_id,
    date_format(b.borrow_date, '%M, %Y') as borrowed_date
from 
    USER u
join 
    BORROWING b on u.user_id = b.user_id
order by 
    b.borrowing_id desc;
