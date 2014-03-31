package at.ecrit.e4.tools.extension.core.assistance;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ContextInformationValidator;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

public class TextileContentAssistProcessor implements IContentAssistProcessor {
	private String lastError = null;
	private IContextInformationValidator contextInfoValidator;
	private TextileTagTracker tracker;
	
	public TextileContentAssistProcessor(TextileTagTracker tracker){
		super();
		contextInfoValidator = new ContextInformationValidator(this);
		this.tracker = tracker;
	}
	
	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset){
		// current document
		IDocument doc = viewer.getDocument();
		int currOffset = offset - 1;
		
		try {
			String currWord = "";
			char currChar;
			while (currOffset >= 0 && !Character.isWhitespace(currChar = doc.getChar(currOffset))) {
				currWord = currChar + currWord;
				System.out.println(currWord);
				currOffset--;
			}
			
			Map<String, String> proposalList = tracker.suggest(currWord);
			ICompletionProposal[] proposals = null;
			if (proposalList.size() > 0) {
				proposals = buildProposals(proposalList, currWord, offset - currWord.length());
				lastError = null;
			}
			// return proposals
			return proposals;
		} catch (BadLocationException e) {
			e.printStackTrace();
			lastError = e.getMessage();
			return null;
		}
	}
	
	private ICompletionProposal[] buildProposals(Map<String, String> proposalList,
		String replacedWord, int offset){
		ICompletionProposal[] proposals = new ICompletionProposal[proposalList.size()];
		int index = 0;
		for (Iterator<String> i = proposalList.keySet().iterator(); i.hasNext();) {
			String currSuggestion = (String) i.next();
			proposals[index] =
				new CompletionProposal(currSuggestion, offset, replacedWord.length(),
					currSuggestion.length(), null, proposalList.get(currSuggestion), null, null);
			index++;
		}
		return proposals;
	}
	
	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset){
		lastError = "No Context Information available";
		return null;
	}
	
	@Override
	public char[] getCompletionProposalAutoActivationCharacters(){
		// we wait till the user explicitly triggers the completion
		return null;
	}
	
	@Override
	public char[] getContextInformationAutoActivationCharacters(){
		// we have no context information
		return null;
	}
	
	@Override
	public String getErrorMessage(){
		return lastError;
	}
	
	@Override
	public IContextInformationValidator getContextInformationValidator(){
		return contextInfoValidator;
	}
	
}
