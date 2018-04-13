package com.smartscity.deque;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * <B>文件名称：</B>RequirementsTest<BR>
 * <B>文件描述：</B><BR>
 * <BR>
 *     需求（业务）测试
 *     1、倒置功能
 *
 * <B>版权声明：</B>(C)2016-2018<BR>
 * <B>公司部门：</B>SMARTSCITY Technology<BR>
 * <B>创建时间：</B>2018/4/12 下午11:37<BR>
 *
 * @author apple  lyl2008dsg@163.com
 * @version 1.0
 **/


public class RequirementsTest {

  DequeLinked<Integer> list ;

  @Before
  public void setup() {
    list = new DequeLinked<>();
  }

  /**
   * 根据业务需求，完成的功能，做完善性单元测试
   */
  @Test
  public void testPeekingAndReverse() {

    // 5
    list.insertFirst(5);
    list.reverse();
    assertTrue(list.first() == 5);
    assertTrue(list.last() == 5);

    // 6 - 5
    list.insertFirst(6);
    // 5 - 6
    list.reverse();
    assertTrue(list.first() == 5);
    assertTrue(list.last() == 6);

    // 6 - 5
    list.reverse();
    // 7 - 6 - 5
    list.insertFirst(7);
    // 5 - 6 - 7
    list.reverse();
    assertTrue(list.first() == 5);
    assertTrue(list.last() == 7);

    // 5 - 6 - 7 - 8
    list.insertLast(8);
    // 8 - 7 - 6 - 5
    list.reverse();
    assertTrue(list.first() == 8);
    assertTrue(list.last() == 5);

    // 8 - 7 - 6
    list.removeLast();
    assertTrue(list.first() == 8);
    assertTrue(list.last() == 6);

    // 8 - 7
    list.removeLast();
    assertTrue(list.first() == 8);
    assertTrue(list.last() == 7);

    // 8
    list.reverse();
    list.removeFirst();
    assertTrue(list.first() == 8);
    assertTrue(list.last() == 8);

  }
}
