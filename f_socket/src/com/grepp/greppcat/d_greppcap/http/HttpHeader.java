package com.grepp.greppcat.d_greppcap.http;

import com.grepp.greppcat.d_greppcap.util.MultiValueMap;
import java.util.List;
import java.util.Map.Entry;

public class HttpHeader extends MultiValueMap<String, String> {

    // 메서드 체인방식으로 만듦
    public HttpHeader add(String headerTxt) {
        String[] token = headerTxt.split(":");
        super.add(token[0], token[1]);
        return this;
    }

    public HttpHeader add(String name, String value) {
        super.add(name, value);
        return this;
    }

    public List<String> getHeader(String name) {
        return super.get(name);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Entry<String, List<String>> entry : super.entrySet()) {
            for (String value : entry.getValue()) {
                sb.append(entry.getKey()).append(": ").append(value).append("\n");
            }
        }
        sb.append("\n");
        return sb.toString();
    }
}
