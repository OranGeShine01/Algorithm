-- 코드를 입력하세요
SELECT member_id, member_name, gender, to_char(date_of_birth, 'YYYY-MM-DD') date_of_birth from member_profile
where extract(month from date_of_birth) = 3 and gender = 'W' and tlno is not null
order by member_id;