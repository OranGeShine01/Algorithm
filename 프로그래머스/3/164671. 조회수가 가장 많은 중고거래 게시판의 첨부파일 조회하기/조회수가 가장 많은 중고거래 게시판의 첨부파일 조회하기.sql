SELECT
    '/home/grep/src/' || b.BOARD_ID || '/'|| FILE_ID || FILE_NAME || FILE_EXT as FILE_PATH
FROM
    USED_GOODS_FILE f
JOIN
    USED_GOODS_BOARD b
    ON
    f.BOARD_ID = b.BOARD_ID
WHERE
    VIEWS = (SELECT
                MAX(VIEWS)
            FROM
            USED_GOODS_BOARD b
            )
ORDER BY
    FILE_ID desc
;

