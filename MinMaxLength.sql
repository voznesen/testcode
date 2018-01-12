/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
select x.city, length(x.city) from (select city from station order by length(city) ASC, city ASC) x where rownum = 1;
select x.city, length(x.city) from (select city from station order by length(city) DESC, city ASC) x where rownum = 1;
