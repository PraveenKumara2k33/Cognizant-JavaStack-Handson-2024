select 
    u.username,
    b.title,
    br.borrow_date
from 
    USER u
join 
    BORROWING br on u.user_id = br.user_id
join 
    BOOK b on br.isbn = b.isbn
order by
    br.borrow_date desc;
