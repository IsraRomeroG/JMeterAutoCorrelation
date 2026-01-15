package tools.jmeter.autocorrelation.model.har;

import java.util.List;

public class Log {
    private List<Entry> entries;

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }
}
