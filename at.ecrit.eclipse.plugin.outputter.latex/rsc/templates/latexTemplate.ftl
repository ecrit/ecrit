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

\section{Orientation to use the features of the graphical user interface}\index{Feature orientation}
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
%------------------------------------------------

\subsection{Perspectives}\index{Perspectives}
There are ${doc.applicationLayout.perspective?size} perspectives available to the user.
Perspectives can be switched by using the tabs, selecting the respective perspective
item.

<#list doc.applicationLayout.perspective as perspective>
\subsubsection{Perspective ${perspective.modelElement.label}}
\begin{figure}[h]
	\centering
		\includegraphics[scale=0.6]{{${perspective.modelElement.elementId}}.png}
	\caption{Perspective ${perspective.modelElement.label}}
\end{figure}
\newline
${perspective.description}

This perspective contains the following parts

\begin{itemize}
<#list perspective.containedParts as containedPart>
	\item ${containedPart.modelElement.label}
 </#list>
\end{itemize}
</#list>

\subsection{Parts}\index{Parts}
 <#list doc.applicationLayout.part as part>
	 \subsubsection{${part.modelElement.label}} 
	 ${part.description}
 </#list>

%----------------------------------------------------------------------------------------
%	CHAPTER - Procedures
%----------------------------------------------------------------------------------------
%\chapterimage{chapter_head_2.pdf} % Chapter heading image
%\chapter{Procedures}
%	Not available. Requires cheat-sheets.
	
%----------------------------------------------------------------------------------------
%	CHAPTER - Information on software commands
%----------------------------------------------------------------------------------------
\chapterimage{img/chapter_head_2.pdf} % Chapter heading image
\chapter{Information on Software commands}
\section{Commands}\index{Commands}

%----------------------------------------------------------------------------------------
<#list doc.step as st>
 	\subsection{${st.command.commandName!""}}
 	${st.description!""} \\[2ex]
 	\textsf{Requirements}
 		${st.precondition!""} \\[2ex]
 	\textsf{Executable by}
	 	<#list st.initiatableBy as it>
	 	\begin{itemize}
	 		<#list it.locationDescription?split("|") as loc>
	 			 \item ${loc}
	 		</#list>
	 	\end{itemize}
		</#list>
	\\[2ex]
    \textsf{Completion information}
    ${st.postcondition!""}
 </#list>

%----------------------------------------------------------------------------------------
%	CHAPTER - Error messages and problem resolution
%----------------------------------------------------------------------------------------
\chapter{Error messages and problem resolution}


%----------------------------------------------------------------------------------------
%	CHAPTER - Glossary
%----------------------------------------------------------------------------------------
\chapter{Glossary}


%----------------------------------------------------------------------------------------
%	CHAPTER - Related information sources
%----------------------------------------------------------------------------------------
\chapter{Related information sources}


%----------------------------------------------------------------------------------------
%	CHAPTER - Navigational features
%----------------------------------------------------------------------------------------
\chapter{Navigational features}


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
\addcontentsline{toc}{section}{\textcolot{black}{Index}}
\printindex

%----------------------------------------------------------------------------------------

\end{document}