select 
    author,
    count(*) as total_books
from 
    BOOK
group by 
    author
having
    count(*) >= 2
order by 
    total_books desc;
