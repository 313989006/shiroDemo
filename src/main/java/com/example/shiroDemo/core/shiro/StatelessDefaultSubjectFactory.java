package com.example.shiroDemo.core.shiro;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.SubjectContext;
import org.apache.shiro.web.mgt.DefaultWebSubjectFactory;

/** 
* @Description: TODO
* @Param:  
* @return:  
* @Author: ma.kangkang
* @Date: 2019/9/26 
*/ 
public class StatelessDefaultSubjectFactory extends DefaultWebSubjectFactory {

    @Override
    public Subject createSubject(SubjectContext context) {
        // 不创建session
        context.setSessionCreationEnabled(false);
        return super.createSubject(context);
    }
}
