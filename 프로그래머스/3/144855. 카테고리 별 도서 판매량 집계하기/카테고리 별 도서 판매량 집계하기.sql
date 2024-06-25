SELECT CATEGORY, SUM(bs.SALES) TOTAL_SALES 
FROM BOOK_SALES bs 
    JOIN BOOK b 
    ON bs.BOOK_ID = b.BOOK_ID 
WHERE bs.SALES_DATE >= TO_DATE('2022-01-01', 'YYYY-MM-DD')
  AND bs.SALES_DATE <= TO_DATE('2022-01-31', 'YYYY-MM-DD')
GROUP BY CATEGORY 
ORDER BY CATEGORY;