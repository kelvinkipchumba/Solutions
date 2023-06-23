-- This common table expression (CTE) filters the employees based on age and salary conditions
WITH filtered_employees AS (
  SELECT id, name, age, salary
  FROM employees
  WHERE age > 30 AND salary > 50000
)
-- Select all columns from the filtered_employees CTE
SELECT *
FROM filtered_employees;
