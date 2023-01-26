-- 코드를 입력하세요
SELECT i.flavor flavor from icecream_info i left outer join first_half f on i.flavor = f.flavor where total_order>3000 and ingredient_type = 'fruit_based';