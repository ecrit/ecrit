package html.to.latex.main;

import html.to.latex.parser.IParserHandler;
import html.to.latex.parser.Parser;
import html.to.latex.parser.ParserHandler;

import java.io.File;

public class EntryPoint {
	/**
	 * Creates {@link Parser Parser} instance and runs its
	 * {@link Parser#parse(File, IParserHandler) parse()} method.
	 * 
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args){
		try {
			ProgramInput programInput = new ProgramInput();
			programInput.processCmdLineArgs(args);
			
			if (programInput.getInputFile().equals("") || programInput.getOutputFile().equals("")) {
				System.err.println("Input or (and) output file not specified.");
				return;
			}
			
			File inputFile = new File(programInput.getInputFile());
			File outputFile = new File(programInput.getOutputFile());
			
			// TODO: check files exist & have write permissions
			
			ParserHandler handler = new ParserHandler(outputFile, programInput);
			new Parser(inputFile, handler).parse();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
