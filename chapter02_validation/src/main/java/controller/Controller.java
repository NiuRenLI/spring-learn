package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 在之前的版本中，所有逻辑代码都写在ServletController中，耦合度高，在此版本中，
 */
public interface Controller {
    /**
     * 此接口的实现类通过该方法访问到当前请求的HttpServletRequest和HttpServletResponse对象
     *
     * @param req
     * @param resp
     * @return
     */
    String handleRequest(HttpServletRequest req, HttpServletResponse resp);
}
