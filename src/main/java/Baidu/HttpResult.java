package Baidu;

import java.util.List;

/**
 * @author sawyer 2016/10/21下午1:03
 */
public class HttpResult {

    private int code;
    private String msg;
    private List<HttpResultContent> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<HttpResultContent> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<HttpResultContent> newslist) {
        this.newslist = newslist;
    }
}
