DROP TABLE city;

# 5-1
CREATE DATABASE world_0;

# 5-2
CREATE TABLE city (
	id INT NOT NULL auto_increment,
	name VARCHAR(50) NOT NULL,
	major VARCHAR(20),
	pop INT,
	PRIMARY KEY (id)
);

# 5-3
DESC city; #테이블의 간략한 정보를 보고싶을때

# 5-4
INSERT INTO city (name, major, pop) VALUES ('서울', '이명길', 20000000);
INSERT INTO city (name, major, pop) VALUES ('인천', '김동훈', 3500000);
INSERT INTO city (name, major, pop) VALUES ('대구', '강수복', 3000000);
INSERT INTO city (name, major, pop) VALUES ('부산', '남기문', 5000000);
INSERT INTO city (name, major, pop) VALUES ('목포', '신용현', 2000000);

# 5-5
SELECT *FROM city;

# 5-6
SELECT *FROM city WHERE pop > 3000000;

# 5-7
SELECT name,major FROM city WHERE pop < 3000000;

# 5-8
SELECT * FROM city WHERE name = '목포';

# 5-9
DELETE FROM city WHERE name = '목포';

# 5-10
UPDATE city SET name = '서울특별시' WHERE name = '서울';