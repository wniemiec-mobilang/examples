package com.example.close2bookingapi.filters;

import org.springframework.stereotype.Component;
import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class HeaderExposureFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, 
                         ServletResponse servletResponse, 
                         FilterChain filterChain)
    throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        
        res.addHeader("access-control-expose-headers", "location");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}