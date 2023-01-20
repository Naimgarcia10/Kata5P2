package kata5P2.view;

import java.util.List;
import kata4.model.Histogram;

public class HistogramBuilder {
    private final Histogram <String> histogram = new Histogram<>();
    public Histogram <String> BuildHistogram(List<String> domains){
        for (String domain : domains) 
            histogram.increment(domain);
        return histogram;
    }
}
