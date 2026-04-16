class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;

    public TextDocument(String filePath, String encoding, int wordCount) {
        this.filePath  = filePath;
        this.encoding  = encoding;
        this.wordCount = wordCount;
        System.out.println("Creating a Text Document prototype."); //Executed in the constructor
    }

    private TextDocument(TextDocument source) {
        this.filePath  = source.filePath;
        this.encoding  = source.encoding;
        this.wordCount = source.wordCount;
    }

    @Override
    public Document clone() {
        return new TextDocument(this);
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath +
                " with encoding: " + encoding + " (" + wordCount + " words)");
    }

    @Override
    public String getType() { return "Text"; }

    @Override
    public String toString() {
        return "Type: " + getType() + ", Path: " + filePath +
               ", Encoding: " + encoding + ", Words: " + wordCount;
    }

    public void setFilePath(String filePath)  { this.filePath  = filePath; }
    public void setEncoding(String encoding)  { this.encoding  = encoding; }
    public void setWordCount(int wordCount)   { this.wordCount = wordCount; }
}