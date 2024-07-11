select 
    user_id, 
    username, 
    coalesce(phoneno, email, 'Not Available') as contact
from 
    USER
where 
    month(dob) = 5
order by
    user_id asc;
