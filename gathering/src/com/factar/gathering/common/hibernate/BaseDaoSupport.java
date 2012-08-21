package com.factar.gathering.common.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

/**
 * basedao support
 * @author towery
 *
 */
@Component
public class BaseDaoSupport extends HibernateDaoSupport {

	@Autowired
    public void MyHibernateDaoSupport(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
        this.setSessionFactory(sessionFactory);
    }
	
}
