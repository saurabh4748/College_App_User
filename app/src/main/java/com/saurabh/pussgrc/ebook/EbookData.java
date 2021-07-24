package com.saurabh.pussgrc.ebook;

public class EbookData {

    private String pdfTitle, pdfUrl;

    public EbookData() {
    }

    public EbookData(String pdfTitle, String pdfUrl) {
        this.pdfTitle = pdfTitle;
        this.pdfUrl = pdfUrl;
    }

    public String getPdfTitle() {
        return pdfTitle;
    }

    public void setName(String name) {
        this.pdfTitle = name;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }
}
