package com.code00000001.test;

import code00000001.dao.CustomerDao;
import code00000001.dao.LinkManDao;
import code00000001.entity.Customer;
import code00000001.entity.LinkMan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestOneToMany {
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private LinkManDao linkManDao;

    @Transactional //开启事务
    @Rollback(false) //设置为不回滚
    @Test
    public void add(){
        Customer c = new Customer();
        c.setName("233");
        c.setLevel("2233");
        c.setSource("222");
        c.setIndustry("2222");
        c.setAddress("2222");
        c.setPhone("010-84389340");


        LinkMan l = new LinkMan();
        l.setLkmName("44");
        l.setLkmGender("3443");
        l.setLkmMobile("13811111111");
        l.setLkmPhone("010-34785348");
        l.setLkmEmail("98354834@qq.com");
        l.setLkmPosition("3333");
        l.setLkmMemo("333");

        c.getLinkMEN().add(l);
        l.setCustomer(c);

        customerDao.save(c);
        linkManDao.save(l);
    }
}
