
package com.coderslab.dao;

import com.coderslab.entity.Product;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public List<Product> getAllProduct(){
        
        return sessionFactory.getCurrentSession().createQuery("from Product").list();
        
    }
    
}
