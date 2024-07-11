select 
    b.title,
    b.author,
    (
        select 
            count(distinct user_id) 
        from 
            BORROWING 
        where 
            isbn = b.isbn
    ) as user_count
from 
    BOOK b
join 
    BORROWING bor on b.isbn = bor.isbn
where 
    bor.user_id = 'UN007';
