SELECT
    c.car_id as CAR_ID
FROM
    CAR_RENTAL_COMPANY_CAR c
JOIN
    CAR_RENTAL_COMPANY_RENTAL_HISTORY h
    ON
    c.CAR_ID = h.CAR_ID
WHERE
    c.CAR_TYPE = '세단'
    AND
    TO_CHAR(h.start_date, 'MM') = '10'
GROUP BY
    c.CAR_ID
ORDER BY
    CAR_ID desc
;