SELECT TO_CHAR(datetime, 'FMHH24') AS hour, COUNT(*) AS count
FROM animal_outs 
WHERE TO_CHAR(datetime, 'HH24') BETWEEN '09' AND '19'
GROUP BY TO_CHAR(datetime, 'FMHH24')
ORDER BY TO_NUMBER(TO_CHAR(datetime, 'FMHH24'));