class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;
    private String name;

    public PdfDocument(String fileName, String author, int pageCount, String name) {
        this.fileName  = fileName;
        this.author    = author;
        this.pageCount = pageCount;
        this.name      = name;
        System.out.println("Creating a PDF Document prototype."); //Executed in the constructor
    }

    private PdfDocument(PdfDocument source) {
        this.fileName  = source.fileName;
        this.author    = source.author;
        this.pageCount = source.pageCount;
        this.name      = source.name;
    }

    @Override
    public Document clone() {
        return new PdfDocument(this);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author +
                " (" + pageCount + " pages)");
    }

    @Override
    public String getType() { return "PDF"; }

    @Override
    public String toString() {
        return "Type: " + getType() + ", File: " + fileName +
               ", Author: " + author + ", Pages: " + pageCount;
    }

    public void setFileName(String fileName)  { this.fileName  = fileName; }
    public void setAuthor(String author)       { this.author    = author; }
    public void setPageCount(int pageCount)    { this.pageCount = pageCount; }
    public void setName(String name)           { this.name      = name; }
}