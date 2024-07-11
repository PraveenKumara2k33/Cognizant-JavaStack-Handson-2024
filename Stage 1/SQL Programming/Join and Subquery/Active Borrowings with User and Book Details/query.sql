select 
    u.user_id,
    u.username,
    br.borrowing_id,
    br.isbn,
    b.title,
    br.borrow_date,
    br.due_date
from 
    USER u
join 
    BORROWING br on u.user_id = br.user_id
join 
    BOOK b on br.isbn = b.isbn
where 
    br.return_date is null
order by 
    u.user_id desc;
