SELECT
    u.user_id as USER_ID,
    u.nickname as NICKNAME,
    sum(b.price) as TOTAL_SALES
FROM
    USED_GOODS_USER u
JOIN
    USED_GOODS_BOARD b
    ON
    u.user_id = b.writer_id
WHERE
    b.status = 'DONE'
GROUP BY
    u.user_id, u.nickname
HAVING
    sum(b.price) >= 700000
ORDER BY
    TOTAL_SALES
;