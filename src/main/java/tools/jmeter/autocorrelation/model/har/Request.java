package tools.jmeter.autocorrelation.model.har;

import java.util.List;

public class Request {
    private String url;
    private List<Header> headers;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Header> getHeaders() {
        return headers;
    }

    public void setHeaders(List<Header> headers) {
        this.headers = headers;
    }
}
