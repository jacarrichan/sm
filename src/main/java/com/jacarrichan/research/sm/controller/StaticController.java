package com.jacarrichan.research.sm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 不含任何业务逻辑的直接请求页面
 * 
 * @description
 * @author jacarri
 * @date 2015年2月4日 下午6:51:40
 * @version v1.0
 */
@Controller
public class StaticController {
    /**
     * 一级目录页
     * 
     * @param ename
     * @param pageNum
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/{firstFolderEname}.htm", method = RequestMethod.GET)
    public String firstFolder(@PathVariable String firstFolderEname,
            @RequestParam(value = "p", defaultValue = "1") long p, HttpServletRequest request,
            ModelMap modelMap) {
        System.out.println(request.getContextPath());
        return firstFolderEname + ".shtml";
    }
}
