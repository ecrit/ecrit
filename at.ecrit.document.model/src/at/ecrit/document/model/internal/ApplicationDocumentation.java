package at.ecrit.document.model.internal;

import at.ecrit.document.model.DocumentFactory;

public class ApplicationDocumentation {
	
	private String about, install, multiUser, requiresLogin;
	
	public ApplicationDocumentation(String about, String install, String multiUser,
		String requiresLogin){
		this.about = about;
		this.install = install;
		this.multiUser = multiUser;
		this.requiresLogin = requiresLogin;
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
	
	public boolean getRequiresLogin(){
		if (requiresLogin == null || requiresLogin.isEmpty()) {
			return false;
		}
		return true;
	}
	
}
