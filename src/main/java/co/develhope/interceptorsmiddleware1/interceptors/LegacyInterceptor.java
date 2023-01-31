package co.develhope.interceptorsmiddleware1.interceptors;

import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LegacyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        response.setStatus(HttpStatus.GONE.value());
        return false;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) {
        System.out.println("Request URL::" + request.getRequestURL().toString() + " Sent to Handler :: Current Time = " + System.currentTimeMillis());
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) {
        long startTime = (Long) request.getAttribute("startTime");
        System.out.println("Request URL::" + request.getRequestURL().toString() + ":: End Time = " + System.currentTimeMillis());
        System.out.println("Request URL::" + request.getRequestURL().toString() + ":: Time Taken = " + (System.currentTimeMillis() - startTime));
    }

}
