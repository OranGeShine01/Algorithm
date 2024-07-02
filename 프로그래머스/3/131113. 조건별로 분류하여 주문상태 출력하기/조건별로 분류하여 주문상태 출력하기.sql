select 
    ORDER_ID, 
    PRODUCT_ID, 
    TO_CHAR(OUT_DATE,'YYYY-MM-DD') AS OUT_DATE, 
    CASE 
        WHEN OUT_DATE IS NULL THEN '출고미정'
        WHEN TO_CHAR(OUT_DATE, 'MM-DD') <= '05-01' THEN '출고완료'
        ELSE '출고대기'
    END AS 출고여부 
from food_order 
order by ORDER_ID