select 
    user_id, 
    username, 
    concat(substring(username, 1, 3), substring(phoneno, 1, 3)) as password
from 
    USER
order by
    user_id desc;
