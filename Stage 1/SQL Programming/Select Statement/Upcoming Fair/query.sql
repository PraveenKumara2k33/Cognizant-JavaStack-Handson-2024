select isbn, title, author, publication_date
from 
BOOK 
where 
genre in ('Fiction', 'Mystery')
order by
isbn desc;
