package html.to.latex.io;

import java.io.IOException;

public interface IWriter {
	public void write(String str) throws IOException;
	
	public void close();
	
	public String getOutput();
}
