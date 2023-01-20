package kata5P2.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramBuilder;
import kata4.view.HistogramDisplay;
import kata4.view.MailListReader;

public class kata5P2 {
    private static List<Mail> items;
    private static Histogram <String> histogram;
    
    public static void main(String[] args) {
        MailListReader mailListR = new MailListReader();
        HistogramBuilder hb = new HistogramBuilder();
        execute(mailListR, hb);
    }
    
    private static void input(MailListReader mailListR){
        items = mailListR.read("email.txt");
    }
    private static void proccess(MailListReader mailListR, HistogramBuilder hb){
        List<String> domainsList = mailListR.addDomains(items);
        histogram = hb.BuildHistogram(domainsList);
    }
    
    private static void output(){
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "HistogramDisplay...");
        histogramDisplay.execute();
    }
    
    private static void execute(MailListReader mailListR, HistogramBuilder hb){
        input(mailListR);
        proccess(mailListR, hb);
        output();
    }
}