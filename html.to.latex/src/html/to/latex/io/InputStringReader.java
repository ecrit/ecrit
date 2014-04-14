package html.to.latex.io;

import html.to.latex.exception.FatalErrorException;

import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.io.IOUtils;

public class InputStringReader implements IReader {
	
	private InputStreamReader _reader;
	
	public InputStringReader(String input){
		_reader =
			new InputStreamReader(IOUtils.toInputStream("<input-text>" + input + "</input-text>"));
	}
	
	@Override
	public int read() throws IOException{
		return _reader.read();
	}
	
	@Override
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
