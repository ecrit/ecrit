package html.to.latex.io;

import html.to.latex.exception.FatalErrorException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputFileReader implements IReader {
	/** Input file. */
	private BufferedReader _reader;
	
	public InputFileReader(File inputFile) throws FatalErrorException{
		try {
			_reader = new BufferedReader(new FileReader(inputFile));
		} catch (IOException e) {
			throw new FatalErrorException("Can't open the input file: " + inputFile.getName());
		}
	}
	
	public int read() throws IOException{
		return _reader.read();
	}
	
	public void close() throws FatalErrorException{
		if (_reader != null) {
			try {
				_reader.close();
			} catch (IOException e) {
				throw new FatalErrorException("Can't close the input file");
			}
		}
	}
}
