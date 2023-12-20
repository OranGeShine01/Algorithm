-- 코드를 입력하세요
SELECT ingredient_type, sum(total_order) from icecream_info i inner join first_half f on i.flavor = f.flavor group by ingredient_type;