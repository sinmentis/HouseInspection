package unityltd.houseinspection.Model;

import android.graphics.pdf.PdfDocument;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mo on 2/13/18.
 */

public class House {
    private String address;
    private String agent;
    private Date startDate;
    private ArrayList<Report> reports;

    public House(String address, String agent, Date startDate) {
        this.address = address;
        this.agent = agent;
        this.startDate = startDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public ArrayList<Report> getReports() {
        return reports;
    }

    public void setReports(ArrayList<Report> reports) {
        this.reports = reports;
    }

    public Report CreateReport(Date date){
        Report report = new Report(this, date);
        this.reports.add(report);
        return report;
    }

    public PdfDocument GenerateReport(int index){
        Report report = this.reports.get(index);
        // TODO: generate pdf
        return null;
    }
}
