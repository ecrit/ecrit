package at.ecrit.document.model.methods;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import at.ecrit.document.model.ecritdocument.Depictable;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.ecritdocument.DocumentedPerspective;

public class DepictableItemMethods {

	private static int width = 400;
	private static int height = 200;

	
	public static byte[] generatePNGDepictionImageForPerspective(
			DocumentedPerspective dp) {
		// crashes
		Font font = new Font("TimesRoman", Font.BOLD, 20);
		BufferedImage bi = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_ARGB);
		Graphics2D ig2 = bi.createGraphics();

		ig2.setFont(font);
		String message = dp.getModelElement().getLabel();
		FontMetrics fontMetrics = ig2.getFontMetrics();
		int stringWidth = fontMetrics.stringWidth(message);
		int stringHeight = fontMetrics.getAscent();
		ig2.setPaint(Color.black);
		ig2.drawString(message, (width - stringWidth) / 2, height / 2
				+ stringHeight / 4);

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			ImageIO.write(bi, "PNG", bos);
			bos.close();
			return bos.toByteArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static void generateDepictableItemPNGImages(Document documentImpl,
			String targetDirectory) throws IOException {
		File targetDir = new File(targetDirectory);

		for (TreeIterator<EObject> i = documentImpl.eAllContents(); i.hasNext();) {
			EObject eObject = (EObject) i.next();
			System.out.println(eObject);
			if (eObject instanceof Depictable) {
				Depictable depictable = (Depictable) eObject;
				byte[] pngImage = depictable.generatePNGDepictionImage();
				File outputFile = new File(targetDir,
						depictable.getElementDepictionImageName() + ".png");
				FileUtils.writeByteArrayToFile(outputFile, pngImage);
			}
		}

	}

}
