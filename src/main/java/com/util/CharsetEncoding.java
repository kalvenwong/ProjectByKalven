package com.util;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by 细潮 on 2014/12/3 0003.
 */
public class CharsetEncoding implements Filter {

    private String endcoding;

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        //设置web.xml中配置的字符集
        request.setCharacterEncoding(endcoding);
        //继续执行
        chain.doFilter(request, response);
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        this.endcoding = filterConfig.getInitParameter("endcoding");
    }

}
