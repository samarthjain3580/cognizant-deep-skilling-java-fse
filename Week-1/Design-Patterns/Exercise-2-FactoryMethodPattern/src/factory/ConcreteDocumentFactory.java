package factory;

public class ConcreteDocumentFactory extends DocumentFactory {
	
	@Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
