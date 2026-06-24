interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Document");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document");
    }
}

class DocumentFactory {

    public static Document getDocument(String type) {

        if(type.equalsIgnoreCase("word"))
            return new WordDocument();

        return new PdfDocument();
    }
}

public class FactoryMethod {
    public static void main(String[] args) {

        Document doc1 = DocumentFactory.getDocument("word");
        doc1.open();

        Document doc2 = DocumentFactory.getDocument("pdf");
        doc2.open();
    }
}