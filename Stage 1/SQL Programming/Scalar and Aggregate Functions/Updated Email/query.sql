select
    user_id,
    username,
    case
        when address = 'Boston' then concat(substring_index(email, '@', 1), '@gmail.com')
        else email
    end as updated_email
from
    USER
order by
    user_id desc;
