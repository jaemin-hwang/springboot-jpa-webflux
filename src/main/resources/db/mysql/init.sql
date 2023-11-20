CREATE USER 'luke'@'%' IDENTIFIED WITH mysql_native_password BY 'lukewas@!local';
CREATE DATABASE luke;

GRANT ALL ON luke.* TO 'luke'@'%';

FLUSH PRIVILEGES;
