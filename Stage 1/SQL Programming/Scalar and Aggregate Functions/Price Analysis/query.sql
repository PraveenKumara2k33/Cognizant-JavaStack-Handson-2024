select 
    isbn, 
    title, 
    author, 
    case
        when price < 400 then 'Affordable'
        when price >= 400 and price < 600 then 'Moderate'
        else 'Expensive'
    end as price_category
from 
    BOOK
order by
    isbn desc;
