select 
    concat('Mr/Ms.', author, ' published a book on ', year(publication_date)) as book_info
from 
    BOOK
order by 
    year(publication_date) desc;
