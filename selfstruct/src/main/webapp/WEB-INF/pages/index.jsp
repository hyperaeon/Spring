<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@page contentType="text/html;charset=GB2312"%>
<html>
<head>
<title>��һ��JSF����</title>
</head>
<body>
	<f:view>
		<h:form>
			<h3>��������������</h3>
		����: <h:inputText value="#{user.userName}" />
			<p>
				<h:commandButton value="�ͳ�" action="login" />
		</h:form>
	</f:view>
</body>
</html>