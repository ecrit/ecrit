package html.to.latex.io;

import html.to.latex.exception.FatalErrorException;

import java.io.IOException;

public interface IReader {
	public int read() throws IOException;
	
	public void close() throws FatalErrorException;
}
