SELECT
    o.animal_id as ANIMAL_ID,
    o.NAME
FROM
    ANIMAL_OUTS o
FULL JOIN
    ANIMAL_INS i
    ON
    o.animal_id = i.animal_id
WHERE
    i.animal_id is null
ORDER BY
    o.animal_id
;