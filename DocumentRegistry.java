class DocumentRegistry {
    private PdfDocument         pdfPrototype;
    private TextDocument        textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype          = new PdfDocument("template.pdf", "Unknown", 0, "PDF Template");
        textDocumentPrototype = new TextDocument("template.txt", "UTF-8", 0);
        spreadsheetPrototype  = new SpreadsheetDocument("template.xlsx", 0, 0);
    }

    public PdfDocument createPdf(String fileName, String author, int pageCount, String name) {
        PdfDocument doc = (PdfDocument) pdfPrototype.clone();
        doc.setFileName(fileName);
        doc.setAuthor(author);
        doc.setPageCount(pageCount);
        doc.setName(name);
        return doc;
    }

    public TextDocument createTextDocument(String filePath, String encoding, int wordCount) {
        TextDocument doc = (TextDocument) textDocumentPrototype.clone();
        doc.setFilePath(filePath);
        doc.setEncoding(encoding);
        doc.setWordCount(wordCount);
        return doc;
    }

    public SpreadsheetDocument createSpreadsheet(String name, int rows, int cols) {
        SpreadsheetDocument doc = (SpreadsheetDocument) spreadsheetPrototype.clone();
        doc.setSpreadsheetName(name);
        doc.setRowCount(rows);
        doc.setColumnCount(cols);
        return doc;
    }
}