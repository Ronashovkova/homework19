alter table profiles_table rename to profiles;

select * from profiles order by department, skill;

select job_title, count(*) from profiles group by job_title having count(*) > 3;

select * from accounts order by city;

select department, count(department) as most_frequent
from profiles group by department order by count(department) desc;

select count(profiles), profiles.job_title, accounts.city from accounts inner
                                                                        join profiles on accounts.id = profiles.id group by profiles.job_title, accounts.city;

select * from accounts order by city;

update profiles set job_title = replace(job_title, '%Engineer%', '%Developer%') where job_title like '%Engineer%';
select * from profiles where job_title like '%Developer%';