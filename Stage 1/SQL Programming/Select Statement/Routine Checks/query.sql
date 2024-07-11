select borrowing_id, user_id, borrow_date
from BORROWING
where due_date = return_date
order by
borrowing_id asc;
