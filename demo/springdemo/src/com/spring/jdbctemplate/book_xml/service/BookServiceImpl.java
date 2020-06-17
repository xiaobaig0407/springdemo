package com.spring.jdbctemplate.book_xml.service;

import com.spring.jdbctemplate.book_xml.dao.BookDao;
import com.spring.jdbctemplate.book_xml.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @package com.spring.jdbctemplate.book.service
 * @author baiyutao
 * @date 2020/6/10 下午3:37
 * @version 1.0
 */

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao dao;

    /**
     * @Transactional ：对方法中所有的操作作为一个事务
     * 在方法上使用只对方法有效果
     * 在类上使用，对类中所有的方法都有效果
     * @Transactional可以设置的属性：
     * propagation:A方法和B方法都有事务，当A在调用B时，会将A中的事务传播给B方法，B方法对于 事务的处理方式就是事务的传播行为
     * default:使用调用者的事务
     * Propagation.REQUIRED:必须使用调用者的事务
     * Propagation.REQUIRES_NEW:将调用者的事务挂志，不使用调用者的事务，使用新的事务进行处理
     *
     * isolation：事务的隔离级别，在并发的情况下操作数据的一种规定
     *      读未提交：脏读 1
     *      读已提交：不可重复读 2
     *       ---------这2个都是针对一个字段来说
     *
     *
     *     （mysql默认级别） 可重复读（针对数据库表中已经存在的数据可以重复读别的用户不能进行任何操作）：（但他可以添加数据）幻读 4
     *      ---------这个针对于一行来说
     *      串行化（单线程）：性能低消耗大 8
     * timeout:在事务强制回滚前最多可以等待的时间
     * readOnly:指定当前事务中一系列操作是否为只读，（如果事务所有操作都是读的操作，设定为只读话，spring会通知mysql全是读的操作
     * 若设置为只读，不管事务中有没有写的操作，mysql就会在请求访问数据时不加锁提高性能，但是如果有写操作的情况建议一定不能设置readOnly
     *
     *
     * rollbackFor|rollbackForClassName|noRollbackFor|noRollbackForClassName
     * @param bid
     * @param uid
     */

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, timeout = 3, noRollbackFor =
            {NullPointerException.class, MyException.class})
    public void buyBook(String bid, String uid) {
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Integer price = dao.selectPrice(bid);
        dao.updateSt(bid);
        dao.updateBalance(uid, price);
    }
}
