%dw 2.0
output application/java
---
payload.employee.first_name ++ " " ++ payload.employee.last_name ++ " " ++ "employee profile is created in HRMS System."