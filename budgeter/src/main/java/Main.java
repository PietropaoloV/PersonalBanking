
import java.io.File; import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class Main {
    public static void main(String[] args) throws IOException {

       Main m = new Main();
       m.convertPdf();
    }


    public void convertPdf() throws IOException{
        PDDocument document = PDDocument.load(new File("test.pdf"));
        if (document.isEncrypted()) {
            PDFTextStripper stripper = new PDFTextStripper();
            String text = stripper.getText(document);
            String lines[] = text.split("\n");
            System.out.println(lines);
            for (String line : lines) {
                System.out.println(line);
            }
        }
        document.close();
    }

}
