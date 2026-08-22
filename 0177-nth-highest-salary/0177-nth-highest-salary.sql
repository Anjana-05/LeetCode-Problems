CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      WITH RANKEDSALARY AS(
            SELECT SALARY, 
            DENSE_RANK() OVER(ORDER BY SALARY Desc) AS SALARY_RANK
            FROM EMPLOYEE
      )
      SELECT DISTINCT SALARY
      FROM RANKEDSALARY
      WHERE SALARY_RANK = N

  );
END