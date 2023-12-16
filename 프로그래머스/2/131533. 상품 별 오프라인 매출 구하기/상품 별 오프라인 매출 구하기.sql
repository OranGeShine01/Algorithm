-- 코드를 입력하세요
-- SELECT product_code, price * sales_amount
-- from product p
-- inner join (select product_id, sum(sales_amount) from offline_sale group by product_id) o on p.product_id=o.product_id;

-- select product_id, sum(sales_amount) from offline_sale group by product_id;
select product_code, sum(price*sales_amount) sales from product p inner join offline_sale o on p.product_id = o.product_id group by product_code order by sales desc, product_code;