CREATE TABLE `database1`.`Employee`  (
  `EmpId` int(10) NOT NULL,
  `FullName` varchar(255) NULL,
  `ManagerId` int(10) NULL,
  `DateOfJoining` varchar(255) NULL,
  PRIMARY KEY (`EmpId`)
);

CREATE TABLE `database1`.`Salary`  (
  `EmpId` int(10) NOT NULL,
  `Porject` varchar(255) NULL,
  `Salary` varchar(255) NULL,
  PRIMARY KEY (`EmpId`)
);

SELECT Project from Salary;
SELECT COUNT(*) 
FROM Salary 
WHERE Project = 'P1';

SELECT FullName 
FROM Employee
WHERE EmpId IN 
(SELECT EmpId FROM Salary 
WHERE Salary BETWEEN 5000 AND 10000);

SELECT Project, count(EmpId) EmpProjectCount 
FROM EmployeeSalary 
GROUP BY Project 
ORDER BY EmpProjectCount DESC;

SELECT Project FROM Salary WHERE count(Project)>1;


SELECT E.FullName, S.Salary  
FROM Employee E LEFT JOIN Salary S
ON E.EmpId = S.EmpId;

SELECT DISTINCT E.FullName
FROM Employee E
INNER JOIN Employee M
ON E.EmpID = M.ManagerID;

SELECT FullName, COUNT(*)
FROM Employee
GROUP BY FullName
HAVING COUNT(*) > 1;

SELECT NOW();
SELECT CURRENT_TIMESTAMP;


SELECT * FROM Employee
WHERE YEAR(DateOfJoining) = '2016';

SELECT E.FullName, S.Salary  
FROM Employee E LEFT JOIN Salary S
ON E.EmpId = S.EmpId
WHERE Month(DateOfJoining) = '1';