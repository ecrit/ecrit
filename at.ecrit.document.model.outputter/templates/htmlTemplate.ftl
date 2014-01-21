<html>

<style>
   body{counter-reset: section}
   h2{counter-reset: sub-section}
   h3{counter-reset: composite}
   h4{counter-reset: detail}

   h2:before{
     counter-increment: section;
     content: counter(section) " ";
   }
   h3:before{
     counter-increment: sub-section;
     content: counter(section) "." counter(sub-section) " ";
   }
   h4:before{
     counter-increment: composite;
     content: counter(section) "." counter(sub-section) "." counter(composite) " ";
   }
   h5:before{
     counter-increment: detail;
     content: counter(section) "." counter(sub-section) "." counter(composite) "." counter(detail) " ";
   }
</style>

<head>
  <title>${doc.title}</title>
</head>
<body>
  <h1>Application Documentation - ${doc.title}</h1>
  
  <h2>Introduction</h2>
  
  <h2>Conventions used in this documentation</h2>
  
  <h2>Concept of operations</h2>
  
  <h2>Information on software commands</h2>
    <#list doc.step as st>
      <h3>${st.command.commandName}</h3>
      <p><i>Description</i> ${st.description!""}<p>
      <p><i>Requirements</i></p>
      <p><i>Executable by</i>
      	<ul>
      	<#list st.initiatableBy as it>
      		<li>${it.locationDescription}</li>
      	</#list>
      	</ul>
      </p>
      <p><i>Completion information</i> ${st.postcondition!""}</p> 
    </#list>
</body>
</html> 