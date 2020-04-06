%dw 2.0
output application/json
var input2_empid=vars.input2.scoreBoard.id

---

	vars.input1.employee filter not contains(input2_empid, $.id) map 
	{
		employees: $	
		
	}