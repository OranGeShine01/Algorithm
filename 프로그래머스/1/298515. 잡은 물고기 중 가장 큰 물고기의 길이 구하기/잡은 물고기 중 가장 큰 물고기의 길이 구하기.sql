SELECT 
    CASE 
        WHEN MAX(length) > 10 THEN CONCAT(CAST(MAX(length) AS DECIMAL(10, 2)), 'cm')
        ELSE NULL
    END AS MAX_LENGTH
FROM fish_info;
