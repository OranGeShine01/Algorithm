SELECT
    user_id,
    nickname,
    CITY || ' ' || STREET_ADDRESS1 || ' ' || STREET_ADDRESS2 AS 전체주소,
    subSTR(TLNO, 1, 3) || '-' || subSTR(TLNO, 4, 4) || '-' || substr(TLNO, 8) AS 전화번호
FROM
    USED_GOODS_BOARD b
JOIN
    USED_GOODS_USER u
    ON
    u.user_id = b.writer_id
GROUP BY
    user_id,
    nickname,
    CITY,
    STREET_ADDRESS1,
    STREET_ADDRESS2,
    TLNO
HAVING
    count(b.writer_id) >= 3
ORDER BY
    user_id desc
;