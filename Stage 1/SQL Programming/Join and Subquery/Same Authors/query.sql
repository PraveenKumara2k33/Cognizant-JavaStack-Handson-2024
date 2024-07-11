select 
    b1.title as title1,
    b2.title as title2,
    b1.author,
    b1.genre
from 
    BOOK b1
join 
    BOOK b2 on b1.author = b2.author and b1.genre = b2.genre and b1.title <> b2.title
order by 
    title1 desc;
