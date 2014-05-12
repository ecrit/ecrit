<html>

<head>
 	<link rel="stylesheet" type="text/css" href="css/light_blue.css">
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js" type="text/javascript"></script>
	<script src="script/tableofcontent.js" type="text/javascript"></script>
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
 
  <#if (doc.applicationProperties.requiresLogin)>
  	  <h3>Access, or log-on and sign-off from the software</h3>
  	  This application requires a login.
  </#if>
  
  <h3>Navigation through the software to access and to exit from functions</h3>
  
  <#-- # Windows -->
  <#if (doc.applicationLayout.window?size > 1)>
  The application consists of ${doc.applicationLayout.window?size} window(s).
  <#else>
  The application has one main window presented to the user on startup.
  </#if> 
	
	<#list doc.applicationLayout.window as win>
		  <h4>${win.modelElement.label} Main Menus</h4>
		  <#if win.containedMenus?has_content>
			  <#list win.containedMenus as mainMenu>
			  	<ul>
			  		<#list mainMenu.containedMenuItems as menu>
			  			<li id="${menu.elementId}">${menu.label}</li>
			  		</#list>
				</ul>
			  </#list>
		  </#if>
		  <#if win.containedTrimElements?has_content>
		  <h4>${win.modelElement.label} Toolbar</h4>
		  	<#list win.containedTrimElements as element>
		  		<ul>
		  			<li id="${element.elementId}">${element.elementId}</li>
		  		</ul>
		  	</#list>
		  </#if>
	</#list>
  
  <h4>Perspectives</h4>
  There are ${doc.applicationLayout.perspective?size} perspectives available to the user. <br>
  <h5>Switch Perspectives</h5>
  ${doc.applicationProperties.perspectiveSwitcher}
  
  <#list doc.applicationLayout.perspective as perspective>
  	<h5 id="${perspective.modelElement.elementId}">Perspective ${perspective.modelElement.label}</h5>
   	 <div class="content">
   	 	<div class="leftSide"><img src="${perspective.modelElement.elementId}.png" alt="${perspective.modelElement.elementId}"></div>
        <div class="rightSide"><p><i>Description</i> ${perspective.description}<p></div>
    </div>
  	
  	<div class="content">
  	<p><i>Parts</i>
  		<ul>
  		 <#list perspective.containedParts as containedPart>
  		 	<li><a href="#${containedPart.modelElement.elementId}">${containedPart.modelElement.label}</a></li>
  		 </#list>
  		</ul>
  	<p>
  	</div>
  </#list>
  
  <h4>Parts</h4>
  <#list doc.applicationLayout.part as part>
  	<h5 id="${part.modelElement.elementId}">Part ${part.modelElement.label}</h5>
  	<p><i>Description</i> ${part.description}<p>
  	<p><i>Executable tasks</i>
  	<ul>
  	<#list part.initiatableItems as ii>
  	<li><#if ii.associatedStep.commandStep>
  			<a href="#${ii.associatedStep.command.elementId}">${ii.associatedStep.command.commandName}</a>
  		<#else>
  			Direct Step
  		</#if></li>
  	</#list>
  	</ul>
  	</p>
  	<p><i>Menus</i>
  		<ul>
	  		<#if part.containedMenus?has_content>
		  		<#list part.containedMenus as containedMenu>
		  			<li>
		  				<h6 id="${containedMenu.modelElement.elementId}">${containedMenu.modelElement.label}</h6>
		  				${containedMenu.description}
		  			</li>
		  		 </#list>
	
	  		 <#else>
	  		 	<li>No part specific menus defined.</li>
	  		 </#if>
	  	</ul>
  	</p>
  </#list>
  
  <h2>Procedures</h2>

	Not available. Requires "cheat-sheets".

  <h2>Information on software commands</h2>
    <#list doc.step as st>
      <h3 id="${st.command.elementId}">${st.command.commandName}</h3>
      <p><i>Description</i> ${st.description!""}<p>
      <p><i>Requirements</i> ${st.precondition!""}</p>
      <p><i>Executable by</i>
      	<ul>
      	<#list st.initiatableBy as it>
      		<#assign map = it.locationDescription>
      		<#list map?keys as key>
      				<#if map[key]??>
      					<#-- <#if map[key]?contains("Menu")>  
      						<li>${key}</li> -->
      					<#if key == st.command.elementId>
      						 <#-- # Skip - we don't want the command to show itself! -->
      					<#else>
 	     					<li><a href="#${key}">${map[key]}</a></li>      					
      					</#if>
      				<#else>
      					<li>${key}</li>
      				</#if>
			</#list>
      	</#list>
      	</ul>
      </p>
      <p><i>Completion information</i> ${st.postcondition!""}</p> 
    </#list>
    
    <h2>Error messages and problem resolution</h2>
    Requires extension of the application model
    
    <h2>Glossary</h2>
    Requires deeper connection to the EMF data model
    
    <h2>Related information sources</h2>
    
    <h2>Navigational features</h2>
    
    <h2>Index</h2>
   <div id="toc"></div>
   
</body>
</html> 