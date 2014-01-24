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
  <p>Document created on ${doc.creationDate?string("EEEE, MMMM dd, yyyy, hh:mm:ss a '('zzz')'")}</p>
  
  
  <h2>Introduction</h2>
  
  <h2>Conventions used in this documentation</h2>
  
  <h2>Concept of operations</h2>
  
  <h3>Software installation and uninstallation</h3>
  <h3>Orientation to use the features of the graphical user interface</h3>
  <h3>Access, or log-on and sign-off from the software</h3>
  <h3>Navigation through the software to access and to exit from functions</h3>
  
  <#-- # Windows -->
  <#if (doc.applicationLayout.window?size > 1)>
  The application consists of ${doc.applicationLayout.window?size} window(s).
  <#else>
  The application has one main window presented to the user on startup.
  </#if> 
  
  There are ${doc.applicationLayout.perspective?size} perspectives available to the user.
  
  <#list doc.applicationLayout.perspective as perspective>
  	<h4>Perspective ${perspective.modelElement.label}</h4>
  	<p><i>Description</i> ${perspective.description!""}<p>
  	
  	<p><i>Parts</i>
  		<ul>
  	
  		</ul>
  	<p>
  </#list>
  
  
  <h2>Procedures</h2>

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
    
    <h2>Error messages and problem resolution</h2>
    
    <h2>Glossary</h2>
    
    <h2>Related information sources</h2>
    
    <h2>Navigational features</h2>
    
    <h2>Index</h2>
</body>
</html> 