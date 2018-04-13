package com.smartscity.deque;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Collections;
import java.util.LinkedList;

/**
 * <B>文件名称：</B>PerformanceTest<BR>
 * <B>文件描述：</B><BR>
 * <BR>
 *     性能测试
 *     1、测试倒置方法性能
 *
 *     1、测试性能是否存在浪费
 *     2、测试JVM内存回收是否正常
 *     3、与LinkedList 性能对比
 * <B>版权声明：</B>(C)2016-2018<BR>
 * <B>公司部门：</B>SMARTSCITY Technology<BR>
 * <B>创建时间：</B>2018/4/12 下午11:38<BR>
 *
 * @author apple  lyl2008dsg@163.com
 * @version 1.0
 **/

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PerformanceTest {

  DequeLinked<Integer> list ;

  int testdata = 100000000;
  static long DequeLinkedCast  = 0; //diy        双向链表倒置花费时间
  static long LinkedListCast   = 0; //LinkedList 双向链表倒置花费时间

  @Before
  public void setup() {
    list = new DequeLinked<>();
  }

  @Test
  public void ATEST(){
    list = pushLinked();
    long start = System.currentTimeMillis();
    list.reverse();
    long end = System.currentTimeMillis();
    DequeLinkedCast = (end - start);
//    System.out.println(DequeLinkedCast + " ms");
  }

  @Test
  public void BTESTLINKEDLIST(){
    LinkedList linkedList = pushLinkedList();
    long start = System.currentTimeMillis();
    Collections.reverse(linkedList);
    long end = System.currentTimeMillis();
    LinkedListCast = (end - start);
//    System.out.println(LinkedListCast + " ms");
  }

  @Test
  public void CREPORT(){
    System.out.println("DequeLinked  vs  LinkedCast  TestCase:10000000");
    System.out.println("Deque Cast："+ DequeLinkedCast + "ms");
    System.out.println("LinkedCast："+ LinkedListCast + "ms");

    if(DequeLinkedCast > LinkedListCast){
      System.out.println("DequeLinked  good Exceed " + (LinkedListCast - DequeLinkedCast) + "ms");
    }else if(DequeLinkedCast < LinkedListCast){
      System.out.println("DequeLinked  very good!");
    }else{
      System.out.println("DequeLinked  =  LinkedCast");
    }
  }

  /**
   * 装载测试数据
   * @return
   */
  private DequeLinked pushLinked() {
    DequeLinked dequeLinked = new DequeLinked();
    for(int i=0; i <= testdata; i++){
      dequeLinked.insertLast(i);
    }
    return dequeLinked;
  }



  /**
   * 装载测试数据
   * @return
   */
  private LinkedList pushLinkedList() {
    LinkedList linkedList = new LinkedList();
    for(int i=0; i <= testdata; i++){
      linkedList.add(i);
    }
    return linkedList;
  }
}
