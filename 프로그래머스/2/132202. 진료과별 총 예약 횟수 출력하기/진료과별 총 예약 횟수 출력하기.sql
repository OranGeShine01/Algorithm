-- 코드를 입력하세요
SELECT mcdp_cd 진료과코드, count(*) 
from appointment 
where extract(year from apnt_ymd)=2022 and extract(month from apnt_ymd)=5  
group by mcdp_cd 
order by 2, 1;