package com.edward.gware.manage.gware.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * @param
 * @return
 */

@ControllerAdvice(basePackages = {"com.edward.gware.manage.gware"})
public class JsonpController extends AbstractJsonpResponseBodyAdvice {
    public JsonpController() {
        super("callback", "jsonp");
    }

}
