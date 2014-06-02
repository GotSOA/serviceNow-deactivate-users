CREATE TABLE IF NOT EXISTS userinfo (
      networkAlias      VARCHAR(50) PRIMARY KEY,
      enable            INTEGER
) AS SELECT
      networkAlias,
      enable
      FROM CSVREAD('classpath:/jdbc/dax-users.csv');
