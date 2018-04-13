双向链表倒置

- 实现一个双向链表的倒置功能
- e.g
      ```
      head -> |1|->|2|->|3|->|4|->|5|-> NULL
      NULL <- |5|<-|4|<-|3|<-|2|<-|1|<- reversehead
      ```
- 时限：3天
- 基础测试用例：com.smartscity.deque.BasicsTest
- 需求测试用例：com.smartscity.deque.RequirementsTest
- 性能测试用例：com.smartscity.deque.PerformanceTest

单元测试用例

- PASS 共19/19个

性能测试用例

- 性能测试用例：com.smartscity.deque.PerformanceTest
- TestData : 10000000 、 100000000
- 结论：DequeLinked 倒置方法 与 Collections.reverse(linkedList); 性能相当

运行方式

- Maven 方式
    ```
    mvn clean install
    ```
- Main 函数入口
    ```

    com.smartscity.App
    
    public class App
    {
    
        public static void main( String[] args )
        {
            App app = new App();
            System.out.println("初始化链表：");
            DequeLinked dequeLinked = pushLinked();
            dequeLinked.traversal();
            System.out.println("倒置链表：");
            dequeLinked.reverse();
            dequeLinked.traversal();
        }
    
        ……
    }
    ```
Author

- 李云龙
- Email: lyl2008dsg@163.com

GitHub

- https://github.com/smartscity/deque
