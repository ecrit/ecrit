%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% The Legrand Orange Book
% LaTeX Template
% Version 1.3 (21/8/13)
%
% This template has been downloaded from:
% http://www.LaTeXTemplates.com
%
% Original author:
% Mathias Legrand (legrand.mathias@gmail.com)
%
% License:
% CC BY-NC-SA 3.0 (http://creativecommons.org/licenses/by-nc-sa/3.0/)
%
% Compiling this template:
% This template uses biber for its bibliography and makeindex for its index.
% When you first open the template, compile it from the command line with the 
% commands below to make sure your LaTeX distribution is configured correctly:
%
% 1) pdflatex main
% 2) makeindex main.idx -s StyleInd.ist
% 3) biber main
% 4) pdflatex main x 2
%
% After this, when you wish to update the bibliography/index use the appropriate
% command above and make sure to compile with pdflatex several times 
% afterwards to propagate your changes to the document.
%
% This template also uses a number of packages which may need to be
% updated to the newest versions for the template to compile. It is strongly
% recommended you update your LaTeX distribution if you have any
% compilation errors.
%
% Important note:
% Chapter heading images should have a 2:1 width:height ratio,
% e.g. 920px width and 460px height.
%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%----------------------------------------------------------------------------------------
%	PACKAGES AND OTHER DOCUMENT CONFIGURATIONS
%----------------------------------------------------------------------------------------

\documentclass[11pt,fleqn]{book} % Default font size and left-justified equations

\usepackage[top=3cm,bottom=3cm,left=3.2cm,right=3.2cm,headsep=10pt,a4paper]{geometry} % Page margins

\usepackage{xcolor} % Required for specifying colors by name
\definecolor{ocre}{RGB}{243,102,25} % Define the orange color used for highlighting throughout the book

% Font Settings
\usepackage{avant} % Use the Avantgarde font for headings
%\usepackage{times} % Use the Times font for headings
\usepackage{mathptmx} % Use the Adobe Times Roman as the default text font together with math symbols from the Sym­bol, Chancery and Com­puter Modern fonts

\usepackage{microtype} % Slightly tweak font spacing for aesthetics
\usepackage[utf8]{inputenc} % Required for including letters with accents
\usepackage[T1]{fontenc} % Use 8-bit encoding that has 256 glyphs

% Bibliography
\usepackage[style=alphabetic,sorting=nyt,sortcites=true,autopunct=true,babel=hyphen,hyperref=true,abbreviate=false,backref=true,backend=biber]{biblatex}
\addbibresource{bibliography.bib} % BibTeX bibliography file
\defbibheading{bibempty}{}

% Index
\usepackage{calc} % For simpler calculation - used for spacing the index letter headings correctly
\usepackage{makeidx} % Required to make an index
\makeindex % Tells LaTeX to create the files required for indexing

%----------------------------------------------------------------------------------------

\input{structure} % Insert the commands.tex file which contains the majority of the structure behind the template

\usepackage{hyperref}
\hypersetup{hidelinks,backref=true,pagebackref=true,hyperindex=true,colorlinks=false,breaklinks=true,urlcolor= blue,bookmarks=true,bookmarksopen=false,pdftitle={book title},pdfauthor={book author}}
% compression pdf
\pdfminorversion=5
\pdfobjcompresslevel=6
\pdfcompresslevel=9


\begin{document}

%----------------------------------------------------------------------------------------
%	TITLE PAGE
%----------------------------------------------------------------------------------------

\begingroup
\thispagestyle{empty}
\AddToShipoutPicture*{\put(6,5){\includegraphics[scale=1]{img/background}}} % Image background
\centering
\vspace*{9cm}
\par\normalfont\fontsize{35}{35}\sffamily\selectfont
${doc.title}\par % Book title
\vspace*{1cm}
${doc.creationDate?string("EEEE, MMMM dd, yyyy, hh:mm:ss a '('zzz')'")}
\endgroup

%----------------------------------------------------------------------------------------
%	COPYRIGHT PAGE
%----------------------------------------------------------------------------------------

\newpage
~\vfill
\thispagestyle{empty}

\noindent Copyright \copyright\ 2013 John Smith\\ % Copyright notice

\noindent \textsc{Published by Publisher}\\ % Publisher

\noindent \textsc{book-website.com}\\ % URL

\noindent Licensed under the Creative Commons Attribution-NonCommercial 3.0 Unported License (the ``License''). You may not use this file except in compliance with the License. You may obtain a copy of the License at \url{http://creativecommons.org/licenses/by-nc/3.0}. Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an \textsc{``AS IS'' BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND}, either express or implied. See the License for the specific language governing permissions and limitations under the License.\\ % License information

\noindent \textit{First printing, March 2013} % Printing/edition date

%----------------------------------------------------------------------------------------
%	TABLE OF CONTENTS
%----------------------------------------------------------------------------------------

\chapterimage{img/chapter_head_1.pdf} % Table of contents heading image

\pagestyle{empty} % No headers

\tableofcontents % Print the table of contents itself

\cleardoublepage % Forces the first chapter to start on an odd page so it's on the right

\pagestyle{fancy} % Print headers again

%----------------------------------------------------------------------------------------
%	CHAPTER - Concept of operations
%----------------------------------------------------------------------------------------

\chapterimage{img/chapter_head_2.pdf} % Chapter heading image
\chapter{Introduction}
\section{About ${doc.title}}\index{About ${doc.title} }
${doc.applicationProperties.about}

\chapter{Concept of operations}

\section{Software un/installation}\index{Software un/installation}
\mbox{}
${doc.applicationProperties.requiresInstallation}

\section{Orientation to use the features of the graphical user interface}
General usage; extract from Eclipse documentation

<#if (doc.applicationProperties.requiresLogin)>
\section{Access, or log-on and sign-off from the software}
This application requires a login.
</#if>

\section{Navigation through the software to access and to exit from functions}
 <#if (doc.applicationLayout.window?size > 1)>
  The application consists of ${doc.applicationLayout.window?size} window(s).
 <#else>
  The application has one main window presented to the user on startup.
 </#if> 
 
 <#list doc.applicationLayout.window as win>
 	\subsection{${win.modelElement.label} Main Menus}
 	<#if win.containedMenus?has_content>
 		<#list win.containedMenus as mainMenu>
 			\begin{itemize}
 				<#list mainMenu.containedMenuItems as menu>
 					<#if menu.label??>
 						\item ${menu.label?replace("%","")}
 					<#else>
 						\item ${menu.elementId?replace("%","")}
 					</#if>
 				</#list>
 			\end{itemize}
 		</#list>
 	</#if>
 	<#if win.containedTrimElements?has_content>
 		\subsection{${win.modelElement.label?replace("%","")} Toolbar}
 		\begin{itemize}
	 		<#list win.containedTrimElements as element>
	 				\item ${element.elementId?replace("%","")}
	 		</#list>
 		\end{itemize}
 	</#if>
 </#list>
 
%------------------------------------------------

\subsection{Perspectives}\index{Perspectives}
There are ${doc.applicationLayout.perspective?size} perspectives available to the user.
\subsubsection{Switch Perspectives}
${doc.applicationProperties.perspectiveSwitcher}

<#list doc.applicationLayout.perspective as perspective>
<#if perspective.modelElement.label??>
	\subsubsection{Perspective ${perspective.modelElement.label?replace("%","")}}
<#else>
	\subsubsection{Perspective ${perspective.modelElement.elementId?replace("%","")}}
</#if>
\begin{figure}[h]
	\centering
		\includegraphics[scale=0.6]{{${perspective.modelElement.elementId?replace("%","")}}.png}
	<#if perspective.modelElement.label??>
		\caption{Perspective ${perspective.modelElement.label?replace("%","")}}
	<#else>
		\caption{Perspective ${perspective.modelElement.elementId?replace("%","")}}
	</#if>
\end{figure}
${perspective.description}

This perspective contains the following parts

\begin{itemize}
<#list perspective.containedParts as containedPart>
	<#if containedPart.modelElement.label??>
		\item ${containedPart.modelElement.label?replace("%","")}
	<#else>
		\item ${containedPart.modelElement.elementId?replace("%","")}
	</#if>
 </#list>
\end{itemize}
</#list>

\subsection{Parts}\index{Parts}
 <#list doc.applicationLayout.part as part>
 	<#if part.modelElement.label??>
	 	\subsubsection{${part.modelElement.label?replace("%","")}}
	<#else>
		\subsubsection{${part.modelElement.elementId?replace("%","")}}
	</#if>
	 ${part.description}
	 \vspace{2ex}	 
	 \textsf{Menus}
	 \begin{itemize}
		 <#if part.containedMenus?has_content>
			 	<#list part.containedMenus as containedMenu>
			 		<#if containedMenu.modelElement.label??>
			 			\item ${containedMenu.modelElement.label?replace("%","")}
			 		<#else>
			 			\item ${containedMenu.modelElement.elementId?replace("%","")}
			 		</#if>
			 		${containedMenu.description}
			 	</#list>
		 <#else>
		 	\item No part specific menus defined.
		 </#if>
	 \end{itemize}
 </#list>
	
%----------------------------------------------------------------------------------------
%	CHAPTER - Information on software commands
%----------------------------------------------------------------------------------------
\chapterimage{img/chapter_head_2.pdf} % Chapter heading image
\chapter{Information on Software commands}
\section{Commands}\index{Commands}

%----------------------------------------------------------------------------------------
<#list doc.step as st>
 	\subsection{${st.command.commandName?replace("%","")!""}}
 	${st.description!""}
 	\vspace{2ex}
 	\textsf{Requirements}
 		${st.precondition!""}
 	\textsf{Executable by}
 		\begin{itemize}
		 	<#list st.initiatableBy as it>
		 	<#assign map = it.locationDescription>
			 	
			 		<#if map?has_content>
				 		<#list map?keys as key>
				 			<#if map[key]??>
				 				<#if key == st.command.elementId?replace("%","")>
				 					<#-- # Skip - we don't want the command to show itself -->
				 				<#else>
				 					\item ${map[key]}				
			      				</#if>
				 			<#else>
				 				\item ${key}
				 			</#if>
				 		</#list>
				 	<#else>
				 		\item unknown
				 	</#if>
			</#list>
			<#if st.keybinding??>
				\item KeySqeuence: ${st.keybinding.keySequence}
			</#if>
		\end{itemize}
    \textsf{Completion information}
    ${st.postcondition!""}
 </#list>

%----------------------------------------------------------------------------------------
%	CHAPTER - Error messages and problem resolution
%----------------------------------------------------------------------------------------
\chapter{Error messages and problem resolution}
Document any error messages an problem resolutions in this chapter.

%----------------------------------------------------------------------------------------
%	CHAPTER - Glossary
%----------------------------------------------------------------------------------------
\chapter{Glossary}
Room for the glossary.

%----------------------------------------------------------------------------------------
%	CHAPTER - Related information sources
%----------------------------------------------------------------------------------------
\chapter{Related information sources}
Put any relatd information sources in this chapter.

%----------------------------------------------------------------------------------------
%	CHAPTER - Navigational features
%----------------------------------------------------------------------------------------
\chapter{Navigational features}
Add information to navigational features here.

%----------------------------------------------------------------------------------------
%	BIBLIOGRAPHY
%----------------------------------------------------------------------------------------

\chapter*{Bibliography}
\addcontentsline{toc}{chapter}{\textcolor{ocre}{Bibliography}}
\section*{Books}
\addcontentsline{toc}{section}{Books}
\printbibliography[heading=bibempty,type=book]
\section*{Articles}
\addcontentsline{toc}{section}{Articles}
\printbibliography[heading=bibempty,type=article]

%----------------------------------------------------------------------------------------
%	INDEX
%----------------------------------------------------------------------------------------

\cleardoublepage
\setlength{\columnsep}{0.75cm}
\addcontentsline{toc}{chapter}{\textcolor{ocre}{Index}}
\printindex

%----------------------------------------------------------------------------------------


\end{document}