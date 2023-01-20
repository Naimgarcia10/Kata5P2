package kata5P2.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.view.HistogramBuilder;
import kata4.view.HistogramDisplay;
import kata5P2.view.MailListReaderBD;

public class kata5P2 {
    private static List<String> items;
    private static Histogram <String> histogram;
    
    public static void main(String[] args) {
        MailListReaderBD mailListRBD = new MailListReaderBD();
        items = mailListRBD.read("email.txt");
        
        HistogramBuilder hb = new HistogramBuilder();
        histogram = hb.BuildHistogram(items);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "HistogramDisplay...");
        histogramDisplay.execute();
    }
}