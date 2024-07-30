select 
    p.first_name, 
    p.last_name, 
    p.email, 
    SUM(d.amount) as total
from
    profiles p
join
    deals d on p.id = d.profile_id
where 
    d.dt >= '2022-06-01' and d.dt < '2022-07-01'
group by
    p.id, p.first_name, p.last_name, p.email
order by
    total desc
limit
    3