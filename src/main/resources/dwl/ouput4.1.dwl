%dw 2.0
output application/json
var input2_empid=vars.input2.scoreBoard.id
---
{
	certificate: vars.input1.employee filter contains(input2_empid, $.id) map (employee , indexOfEmployee ) -> {
		id: employee.id,
		firstName: employee.first_name,
		LastName: employee.last_name,		
		MarksBySubjectWise: vars.input2.scoreBoard filter contains(employee.id, $.id) map (sb, indexofsb)	->
		{
			(sb.subjects map '$' : sb.score[$$])
		}
		
	}
}