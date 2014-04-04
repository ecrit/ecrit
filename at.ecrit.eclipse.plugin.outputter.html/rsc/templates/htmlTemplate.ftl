<html>

<style>
	<#include "css/light_blue.css">
</style>

<head>
  <title>${doc.title}</title>
</head>
<body>
  <h1>Application Documentation - ${doc.title}</h1>
  <p>Document created on ${doc.creationDate?string("EEEE, MMMM dd, yyyy, hh:mm:ss a '('zzz')'")}</p>
  
  <h2>Introduction</h2>
  <p>${doc.applicationProperties.about}</p>
  
  <h2>Conventions used in this documentation</h2>  
  <h2>Concept of operations</h2>
  
  <h3>Software installation and uninstallation</h3>
  <p>${doc.applicationProperties.requiresInstallation}</p>
  
  <h3>Orientation to use the features of the graphical user interface</h3>
  
  <h3>Access, or log-on and sign-off from the software</h3>
  <p>${doc.applicationProperties.requiresLogin?string("Yes", "No login required!")}</p>
  
  <h3>Navigation through the software to access and to exit from functions</h3>
  
  <#-- # Windows -->
  <#if (doc.applicationLayout.window?size > 1)>
  The application consists of ${doc.applicationLayout.window?size} window(s).
  <#else>
  The application has one main window presented to the user on startup.
  </#if> 
  
  <h4>Perspectives</h4>
  
  There are ${doc.applicationLayout.perspective?size} perspectives available to the user.
  
  <#list doc.applicationLayout.perspective as perspective>
  	<h5>Perspective ${perspective.modelElement.label}</h5>
  	<img src="${perspective.modelElement.elementId}.png" alt="${perspective.modelElement.elementId}">
  	<p><i>Description</i> ${perspective.description}<p>
  	
  	<p><i>Parts</i>
  		<ul>
  		 <#list perspective.containedParts as containedPart>
  		 	<li>${containedPart.modelElement.label}</li>
  		 </#list>
  		</ul>
  	<p>
  </#list>
  
  <h4>Parts</h4>
  
  <#list doc.applicationLayout.part as part>
  	<h5>Part ${part.modelElement.label}</h5>
  	<p><i>Description</i> ${part.description}<p>
  </#list>
  
  <h2>Procedures</h2>

	Not available. Requires "cheat-sheets".

  <h2>Information on software commands</h2>
    <#list doc.step as st>
      <h3>${st.command.commandName}</h3>
      <p><i>Description</i> ${st.description!""}<p>
      <p><i>Requirements</i> ${st.precondition!""}</p>
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