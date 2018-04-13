package com.smartscity.deque;

/**
 * <B>文件名称：</B>DLinkedList<BR>
 * <B>文件描述：</B><BR>
 * <BR> 双向链表
 * <B>版权声明：</B>(C)2016-2018<BR>
 * <B>公司部门：</B>SMARTSCITY Technology<BR>
 * <B>创建时间：</B>2018/4/12 下午8:45<BR>
 *
 * @author apple  lyl2008dsg@163.com
 * @version 1.0
 **/

//extends AbstractSequentialList implements Deque, Cloneable, java.io.Serializable
public class DLNode<E> {

    private E element;       //链表中存储的数据对象
    private DLNode<E> previous; //上一个链
    private DLNode<E> next;     //下一个链

    public DLNode() {
        this(null, null, null);
    }

    public DLNode(DLNode<E> prev, E element, DLNode<E> next) {
        this.element = element;
        this.previous = prev;
        this.next = next;
    }

    public E get() {
        return element;
    }

    public E add(E e) {
        E old = element;
        element = e;
        return old;
    }

    public E set(E e) {
        element = e;
        return element;
    }

    public DLNode<E> getNext() {
        return next;
    }

    public void setNext(DLNode<E> next) {
        this.next = next;
    }

    public DLNode<E> getPrev() {
        return previous;
    }

    public void setPrevious(DLNode<E> prev) {
        this.previous = prev;
    }

}
