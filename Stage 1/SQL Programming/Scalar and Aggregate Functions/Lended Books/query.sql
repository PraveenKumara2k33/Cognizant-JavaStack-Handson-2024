select 
    user_id,
    count(*) as book_count
from 
    BORROWING
where 
    year(borrow_date) = 2023
group by 
    user_id
order by
    user_id asc;
