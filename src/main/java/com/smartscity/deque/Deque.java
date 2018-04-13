package com.smartscity.deque;

/**
 * <B>文件名称：</B>Deque<BR>
 * <B>文件描述：</B><BR>
 * <BR>
 *     双向链表工具设计的方法
 * <B>版权声明：</B>(C)2016-2018<BR>
 * <B>公司部门：</B>SMARTSCITY Technology<BR>
 * <B>创建时间：</B>2018/4/12 下午9:40<BR>
 *
 * @author liyunlong  lyl2008dsg@163.com
 * @version 1.0
 **/
public interface Deque<E> {
  public int size();                //返回队列中元素总数
  public boolean isEmpty();         //判断队列是否为空
  public E first() ;                //取首元素(不删除)
  public E last();                  //取末元素(不删除)
  public DLNode add(E a);           //添加元素
  public DLNode insertFirst(E obj); //将新元素作为首元素插入
  public DLNode insertLast(E obj);  //将新元素作为末元素插入
  public E removeFirst() ;          //删除首元素
  public E removeLast() ;           //删除末元素
  public void traversal();          //遍历
  public DLNode reverse();          // 翻转
 }
