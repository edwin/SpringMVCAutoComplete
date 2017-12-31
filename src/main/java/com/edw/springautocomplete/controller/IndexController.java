package com.edw.springautocomplete.controller;

import com.edw.springautocomplete.bean.Test;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <pre>
 *  com.edw.springautocomplete.controller.IndexController 
 * </pre>
 *
 * @author edwin < edwinkun at gmail dot com >
 * Dec 31, 2017 11:20:04 PM
 *
 */
@Controller
public class IndexController {

    @Autowired
    private SessionFactory sessionFactory;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @Transactional
    @RequestMapping(value = "/field1", method = RequestMethod.GET)
    public @ResponseBody List<Test> field1() {
        return sessionFactory.openSession()
                .createQuery("from Test")
                .list();
    }
    
}
