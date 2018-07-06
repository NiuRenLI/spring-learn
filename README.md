# spring-learn
个人笔记,Spring相关知识的学习记录.

1：src、chapter02,chapter03通过传统的Servlet技术模拟了MVC框架的实现。
src包下的业务场景模拟的是简单的增加、展示。其中所有的业务逻辑都在一个Servlet中，耦合度高，不推荐。
chapter02解决了耦合度高的问题，抽象出了一个Controller接口。
chapter02_validation又进一步模拟了校验逻辑。

通过三个简单的项目，得到MVC的核心为：DispatcherServlet.
