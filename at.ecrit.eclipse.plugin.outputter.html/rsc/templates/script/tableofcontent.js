var element, name, link, tagName;
$(document).ready(function() {
    $("h1, h2, h3, h4, h5").each(function(i) {
    	element = $(this);
    	name = element.text();
    	link = "#"+element.attr("id");  
    	tagName = element.attr("tagName");
    	
    	$("#toc").append("<a href='" + link + "' title='" + tagName + "'>" + name + "</a>");
    });
});