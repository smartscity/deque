package com.smartscity;

import com.smartscity.deque.DequeLinked;

/**
 * <B>文件名称：</B>DequeLinked<BR>
 * <B>文件描述：</B><BR>
 * <BR>
 *     实现一个双向链表的倒置功能
 *
 *     head -> |1|->|2|->|3|->|4|->|5|-> NULL
 *     NULL <- |5|<-|4|<-|3|<-|2|<-|1|<- reversehead
 *
 *     时限：3天
 *     测试用例：com.smartscity.deque.BasicsTest 基础测试用例
 *
 * <B>版权声明：</B>(C)2016-2018<BR>
 * <B>公司部门：</B>SMARTSCITY Technology<BR>
 * <B>创建时间：</B>2018/4/12 下午9:35<BR>
 *
 * @author 李云龙  lyl2008dsg@163.com
 * @version 1.0
 **/
public class App 
{

    public static void main( String[] args )
    {
        System.out.println("初始化链表：");
        DequeLinked dequeLinked = pushLinked();
        dequeLinked.traversal();
        System.out.println("倒置链表：");
        dequeLinked.reverse();
        dequeLinked.traversal();
    }

    /**
     * 装载测试数据
     * @return
     */
    private static DequeLinked pushLinked() {
        DequeLinked dequeLinked = new DequeLinked();
        dequeLinked.insertLast(1);
        dequeLinked.insertLast(2);
        dequeLinked.insertLast(3);
        dequeLinked.insertLast(4);
        dequeLinked.insertLast(5);
        dequeLinked.insertLast(6);
        return dequeLinked;
    }
}
