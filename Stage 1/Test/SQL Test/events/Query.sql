select 
    period,
    string_agg(concat(type, '=', event_count), '; ') within group (order by event_count desc, type asc) as events
from (
    select 
        case 
            when month(dt) in (1, 2, 3) then 'Q1''21'
            when month(dt) in (4, 5, 6) then 'Q2''21'
            when month(dt) in (7, 8, 9) then 'Q3''21'
            when month(dt) in (10, 11, 12) then 'Q4''21'
        end as period,
        type,
        COUNT(*) as event_count
    from events
    where YEAR(dt) = 2021
    group by period, type
) as subquery
group by period
order by period;