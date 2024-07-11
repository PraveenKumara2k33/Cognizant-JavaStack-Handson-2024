select 
    user_id, 
    username, 
    email, 
    round(datediff(curdate(), dob) / 365) as age_in_years
from 
    USER
having 
    age_in_years > 35
order by 
    user_id desc;