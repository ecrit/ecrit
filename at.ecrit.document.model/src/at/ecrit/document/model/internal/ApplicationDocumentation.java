package at.ecrit.document.model.internal;

import at.ecrit.document.model.DocumentFactory;

public class ApplicationDocumentation {
	
	private String about, install, multiUser, userRolesDesc, requiresLogin, perspectiveSwitcher,
			faq;
	
	public ApplicationDocumentation(String about, String install, String multiUser,
		String userRolesDesc, String requiresLogin, String perspectiveSwitcher, String faq){
		this.about = about;
		this.install = install;
		this.multiUser = multiUser;
		this.userRolesDesc = userRolesDesc;
		this.requiresLogin = requiresLogin;
		this.perspectiveSwitcher = perspectiveSwitcher;
		this.faq = faq;
	}
	
	public String getAbout(){
		if (about == null) {
			about = "";
		}
		return DocumentFactory.outputConverter.parse(about);
	}
	
	public String getInstall(){
		if (install == null) {
			install = "";
		}
		return DocumentFactory.outputConverter.parse(install);
	}
	
	public boolean getMultiUser(){
		if (multiUser == null || multiUser.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public String getUserRolesDesc(){
		if (userRolesDesc == null || userRolesDesc.isEmpty()) {
			return "";
		}
		return DocumentFactory.outputConverter.parse(userRolesDesc);
	}
	
	public boolean getRequiresLogin(){
		if (requiresLogin == null || requiresLogin.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public String getPerspectiveSwitcher(){
		if (perspectiveSwitcher == null) {
			perspectiveSwitcher = "";
		}
		return DocumentFactory.outputConverter.parse(perspectiveSwitcher);
	}
	
	public String getFAQ(){
		if (faq == null) {
			faq = "";
		}
		return DocumentFactory.outputConverter.parse(faq);
	}
	
}
