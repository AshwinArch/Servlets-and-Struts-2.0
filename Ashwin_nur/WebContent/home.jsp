<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean"%>
<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html"%>
		
		
		<font color="red">
			<html:errors/>
		</font>
<table>
<html:form action="/login.do">



<tr><bean:message key="welcome.key"/></tr>

<tr><TD><bean:message key="welcome.uname"/></TD>
<TD><html:text property="username"/></TD></tr>

<tr><TD><bean:message key="welcome.pword"/></TD>
<TD><html:password property="password"/></TD></tr>

<tr><td><html:submit value="Submit"/></td>
<td><html:reset value="Reset"/></td></tr>

</html:form>
</table>