package com.github.vylegzhanin.proxy.autoconfig;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * <p>
 * Created by alexei.vylegzhanin@gmail.com on 10/18/2019.
 */
@WebFilter(filterName = "XNsProxyAutoconfigFilter", urlPatterns = "/*")
public class XNsProxyAutoconfigFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain
    ) throws ServletException, IOException {
        response.setContentType("application/x-ns-proxy-autoconfig");
        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
