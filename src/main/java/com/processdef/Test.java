package com.processdef;

import org.activiti.engine.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

    @Autowired
    RepositoryService repositoryService;

    @RequestMapping("test")
    public void test() {
        System.out.println("aaaaaaaaaaaaaaaa");
        System.out.println(repositoryService);
    }
}
