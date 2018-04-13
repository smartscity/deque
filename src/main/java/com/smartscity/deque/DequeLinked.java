package com.smartscity.deque;

/**
 * <B>文件名称：</B>DequeLinked<BR>
 * <B>文件描述：</B><BR>
 * <BR>
 *     双向链表 管理工具类
 *     提供如下功能：
 *     1、增加在头部
 *     2、增加在尾部
 *     3、获取头部
 *     4、获取尾部
 *     5、删除头部
 *     6、删除尾部
 *     7、遍历
 *     8、倒置
 *
 * <B>版权声明：</B>(C)2016-2018<BR>
 * <B>公司部门：</B>SMARTSCITY Technology<BR>
 * <B>创建时间：</B>2018/4/12 下午9:35<BR>
 *
 * @author 李云龙  lyl2008dsg@163.com
 * @version 1.0
 **/
public class DequeLinked<E> implements Deque<E> {

    public DLNode start;  //头结点  (1)->2->3->4
    public DLNode end;    //尾结点  1->2->3->(4)
    protected int size;     //集合内的书目

    public DequeLinked() {
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 ? true : false;
    }


    public DLNode add(E a) {
        return this.insertLast(a);
    }

    @Override
    public E first() {
        if (isEmpty()) {
            throw new NullPointerException("链表为空");
        }
        return (E) start.get();
    }

    @Override
    public E last() {
        if (isEmpty()) {
            throw new NullPointerException("链表为空");
        }
        return (E) end.get();
    }

    @Override
    public DLNode insertFirst(E obj) {
        DLNode s = start;
        DLNode ele = new DLNode(null, obj, s);
        start = ele;
        if(s == null) {
            end = ele;
        }else{
            s.setPrevious(ele);
        }
        size++;
        return s;
    }


    @Override
    public DLNode insertLast(E obj) {
        DLNode last = end;
        DLNode ele = new DLNode(last, obj, null);
        end = ele;
        if (last == null) {
            start = end;
        } else {
            last.setNext(ele);
        }
        size++;
        return last;
    }

    /**
     * 移除链表第一个元素
     * 1、找到第一个元素    start
     * 2、拆链   start
     * 3、
     * @return
     */
    @Override
    public E removeFirst() {
        if (isEmpty())
            throw new NullPointerException("链表为空");
        E element = (E) start.get();
        DLNode next = start.getNext();
        start.setNext(null);
        start.set(null);
        start = next;
        if(next == null){
            start = null;
        }else{
            next.setPrevious(null);
        }
        size--;
        return (element);
    }

    @Override
    public E removeLast() {
        if (isEmpty())
            throw new NullPointerException("链表为空");
        E element = (E) end.get();
        DLNode prev = end.getPrev();
        end.setNext(null);
        end.set(null);
        end = prev;
        if(prev == null){
            end = null;
        }else{
            prev.setNext(null);
        }
        size--;
        return (element);
    }

    @Override
    public void traversal() {
        DLNode p = start;
        traversal(p, true);
    }

    public void traversal(DLNode node, boolean next) {
        while (null != node){
            System.out.print(node.get() + " ");
            if(next){
                node = node.getNext();
            }else{
                node = node.getPrev();
            }
        }
        System.out.println(" ");
    }

    /**
     * a b c d e f
     * f e d c b a
     * @return
     */
    public DLNode reverse() {
        DLNode node = start;
        DLNode prev=null;
        DLNode next=null;
        while(node!=null){
            next=node.getNext();
            node.setPrevious(next);
            node.setNext(prev);
            prev=node;
            node=next;
        }
        swap();
        return prev;
    }

    private void swap() {
        DLNode node =start ;
        start = end;
        end = node;
    }

}
