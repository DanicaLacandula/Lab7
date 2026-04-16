class SpreadsheetDocument implements Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        this.spreadsheetName = spreadsheetName;
        this.rowCount        = rowCount;
        this.columnCount     = columnCount;
        System.out.println("Creating a Spreadsheet Document prototype."); //Executed in the constructor
    }

    private SpreadsheetDocument(SpreadsheetDocument source) {
        this.spreadsheetName = source.spreadsheetName;
        this.rowCount        = source.rowCount;
        this.columnCount     = source.columnCount;
    }

    @Override
    public Document clone() {
        return new SpreadsheetDocument(this);
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName +
                " (" + rowCount + " rows, " + columnCount + " columns)");
    }

    @Override
    public String getType() { return "Spreadsheet"; }

    @Override
    public String toString() {
        return "Type: " + getType() + ", Name: " + spreadsheetName +
               ", Rows: " + rowCount + ", Columns: " + columnCount;
    }

    public void setSpreadsheetName(String name) { this.spreadsheetName = name; }
    public void setRowCount(int rowCount)        { this.rowCount        = rowCount; }
    public void setColumnCount(int columnCount)  { this.columnCount     = columnCount; }
}