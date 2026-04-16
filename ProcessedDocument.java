public class ProcessedDocument {
    public static void main(String[] args) {

        DocumentRegistry registry = new DocumentRegistry();
        System.out.println();

        PdfDocument annualReport = registry.createPdf(
                "annual_report_2024.pdf", "Acme Corp", 150, "Annual Report");
        annualReport.open();
        System.out.println(annualReport);
        System.out.println();

        TextDocument meetingNotes = registry.createTextDocument(
                "meeting_notes.txt", "UTF-8", 250);
        meetingNotes.open();
        System.out.println(meetingNotes);
        System.out.println();

        SpreadsheetDocument salesData = registry.createSpreadsheet(
                "sales_data_q1.xlsx", 1000, 20);
        salesData.open();
        System.out.println(salesData);
        System.out.println();

        PdfDocument summaryReport = registry.createPdf(
                "summary_report.pdf", "Acme Corp", 30, "Summary Report");
        summaryReport.open();
    }
}