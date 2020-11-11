package com.etc.interceptor;

import com.etc.Enum.ErrorEnum;
import com.etc.exception.MyException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // 拦截器运作，可能会在跨域配置运作之前。所以需要单独设置允许跨域的配置
        // 这里填写你允许进行跨域的主机ip（正式上线时可以动态配置具体允许的域名和IP）
        response.setHeader("Access-Control-Allow-Origin", "*");
        // 允许的访问方法
        response.setHeader("Access-Control-Allow-Methods","*");
        // Access-Control-Max-Age 用于 CORS 相关配置的缓存，即多少秒以后才重发一次“预检”。
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers","*");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");

        //开始令牌校验
        String token = request.getHeader("token");
        boolean isOK = false;

        String method = request.getMethod();
        String path = request.getServletPath();
        if(method.equals("OPTIONS")||path.indexOf("login")!=-1){
            response.setStatus(HttpServletResponse.SC_OK);
            isOK=true;
        }else{
            if(token==null||token.isEmpty()){
                throw new MyException(ErrorEnum.HAVEN_LOGIN);
            } else{
                Object obj = request.getSession().getServletContext().getAttribute(token);
                if(obj!=null){
                    isOK=true;
                }else{
                    throw new MyException(ErrorEnum.IDENTIFY_FAIL);
                }
            }
        }

        return isOK;
    }
}
