-- 코드를 입력하세요
SELECT title, b.board_id, reply_id, r.writer_id, r.contents, 
to_char(r.created_date, 'YYYY-MM-DD') created_date
from used_goods_board b join used_goods_reply r on b.board_id = r.board_id
where extract(year from b.created_date) = 2022 and extract(month from b.created_date) = 10
order by r.created_date, title