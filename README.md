# Lab7 Document Prototype Design Pattern

A Java implementation of the **Prototype** creational design pattern applied to a document management system.

## Structure

| File | Role |
|------|------|
| `Document.java` | Interface — defines `clone()`, `open()`, `getType()` |
| `PdfDocument.java` | Concrete prototype — PDF with author & page count |
| `TextDocument.java` | Concrete prototype — text file with encoding & word count |
| `SpreadsheetDocument.java` | Concrete prototype — spreadsheet with rows & columns |
| `DocumentRegistry.java` | Holds prototypes and produces configured clones |
| `ProcessedDocument.java` | Entry point — `main()` |

## How It Works

1. `DocumentRegistry` is instantiated, triggering each prototype's constructor
2. When a document is needed, the registry clones the matching prototype
3. Setters configure the clone with specific values
4. `open()` and `toString()` print the document's details

## Expected Output

Creating a PDF Document prototype.
Creating a Text Document prototype.
Creating a Spreadsheet Document prototype.
Opening PDF Document: annual_report_2024.pdf by Acme Corp (150 pages)
Type: PDF, File: annual_report_2024.pdf, Author: Acme Corp, Pages: 150
Opening Text Document: meeting_notes.txt with encoding: UTF-8 (250 words)
Type: Text, Path: meeting_notes.txt, Encoding: UTF-8, Words: 250
Opening Spreadsheet Document: sales_data_q1.xlsx (1000 rows, 20 columns)
Type: Spreadsheet, Name: sales_data_q1.xlsx, Rows: 1000, Columns: 20
Opening PDF Document: summary_report.pdf by Acme Corp (30 pages)

## UML
<img width="835" height="438" alt="image" src="https://github.com/user-attachments/assets/0aa61f30-6421-4042-b0aa-e341d78277de" />

