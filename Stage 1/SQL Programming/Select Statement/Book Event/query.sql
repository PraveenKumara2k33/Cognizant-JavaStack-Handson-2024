select isbn, title, author, price
from
BOOK 
where
price between 350 and 450
order by
price desc; 