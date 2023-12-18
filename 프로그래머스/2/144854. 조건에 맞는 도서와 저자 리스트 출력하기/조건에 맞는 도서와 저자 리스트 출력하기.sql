-- 코드를 입력하세요
SELECT book_id, author_name, to_char(published_date, 'yyyy-mm-dd') published_date
from book b inner join author a on b.author_id = a.author_id
where category = '경제'
order by published_date asc;