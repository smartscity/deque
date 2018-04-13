package com.smartscity.deque;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * <B>文件名称：</B>BasicsTest<BR>
 * <B>文件描述：</B><BR>
 * <BR>
 *
 *     基本功能测试
 *     1、添加
 *     2、移除
 *     3、遍历
 *
 * <B>版权声明：</B>(C)2016-2018<BR>
 * <B>公司部门：</B>SMARTSCITY Technology<BR>
 * <B>创建时间：</B>2018/4/12 下午11:34<BR>
 *
 * @author apple  lyl2008dsg@163.com
 * @version 1.0
 **/
public class BasicsTest {

  DequeLinked<Integer> list ;

  @Before
  public void setup() {
    list = new DequeLinked<>();
  }

  @Test
  public void testEmptyList() {
    assertTrue(   list.isEmpty());
    assertEquals( list.size(), 0);
  }

  @Test(expected=Exception.class)
  public void testRemoveFirstOfEmpty() {
    list.removeFirst();
  }

  @Test(expected=Exception.class)
  public void testRemoveLastOfEmpty() {
    list.removeLast();
  }

  @Test(expected=Exception.class)
  public void testPeekFirstOfEmpty() {
    list.first();
  }

  @Test(expected=Exception.class)
  public void testPeekLastOfEmpty() {
    list.last();
  }

  @Test
  public void testAddFirst() {
    list.insertFirst(3);
    assertEquals(list.size(), 1);
    list.insertFirst(5);
    assertEquals(list.size(), 2);
  }

  @Test
  public void testAddLast() {
    list.insertLast(3);
    assertEquals(list.size(), 1);
    list.insertLast(5);
    assertEquals(list.size(), 2);
  }

  @Test
  public void testRemoveFirst() {
    list.insertLast(3);
    assertTrue(list.removeFirst() == 3);
    assertTrue(list.isEmpty());
  }

  @Test
  public void testRemoveFirstSize() {
    list.insertLast(3);
    list.insertLast(4);
    list.insertLast(5);
    assertTrue(list.removeFirst() == 3);
    assertTrue(!list.isEmpty());
    assertTrue(list.size() == 2);
  }

  @Test
  public void testRemoveLast() {
    list.insertLast(4);
    assertTrue(list.removeLast() == 4);
    assertTrue(list.isEmpty());
  }

  @Test
  public void testRemoveLastSize() {
    list.insertLast(3);
    list.insertLast(4);
    list.insertLast(5);
    assertTrue(list.removeLast() == 5);
    assertTrue(!list.isEmpty());
    assertTrue(list.size() == 2);
  }

  @Test
  public void testPeekFirst() {
    list.insertFirst(4);
    assertTrue(list.first() == 4);
    assertEquals(list.size(), 1);
  }

  @Test
  public void testPeekLast() {
    list.insertLast(4);
    assertTrue(list.first() == 4);
    assertEquals(list.size(), 1);
  }

  @Test
  public void testPeekMix() {
    list.insertLast(1);
    list.insertLast(2);
    list.insertLast(3);
    list.insertLast(4);
    list.insertLast(5);
    list.insertLast(6);
    list.insertLast(7);
    list.insertLast(8);
    assertTrue(list.first() == 1);
    assertTrue(list.removeFirst() == 1);
    assertTrue(list.first() == 2);
    assertTrue(list.last() == 8);
    assertTrue(list.removeLast() == 8);
    assertTrue(list.last() == 7);
    assertEquals(list.size(), 6);
  }

  @Test
  public void testPeeking() {

    // 5
    list.insertFirst(5);
    assertTrue(list.first() == 5);
    assertTrue(list.last() == 5);

    // 6 - 5
    list.insertFirst(6);
    assertTrue(list.first() == 6);
    assertTrue(list.last() == 5);

    // 7 - 6 - 5
    list.insertFirst(7);
    assertTrue(list.first() == 7);
    assertTrue(list.last() == 5);

    // 7 - 6 - 5 - 8
    list.insertLast(8);
    assertTrue(list.first() == 7);
    assertTrue(list.last() == 8);

    // 7 - 6 - 5
    list.removeLast();
    assertTrue(list.first() == 7);
    assertTrue(list.last() == 5);

    // 7 - 6
    list.removeLast();
    assertTrue(list.first() == 7);
    assertTrue(list.last() == 6);

    // 6
    list.removeFirst();
    assertTrue(list.first() == 6);
    assertTrue(list.last() == 6);
  }

  @Test
  public void testRemoving() {
    DequeLinked <String> strs = new DequeLinked<>();
    strs.add("a");
    strs.add("b");
    strs.add("c");
    strs.add("d");
    strs.add("e");
    strs.add("f");
    assertEquals(6, strs.size());
  }

  @Test
  public void testTraversal(){
    DequeLinked <String> linkeds = new DequeLinked<>();
    linkeds.add("a");
    linkeds.add("b");
    linkeds.add("c");
    linkeds.add("d");
    linkeds.add("e");
    linkeds.add("f");
    linkeds.traversal(linkeds.start, true);
    linkeds.traversal(linkeds.end,false);
  }

}
