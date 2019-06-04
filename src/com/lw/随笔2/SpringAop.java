package com.lw.随笔2;

public class SpringAop {

    private static String[] springOne = {
            "AOP面向方面编程基于IoC，是对OOP的有益补充",
            "AOP利用一种称为“横切”的技术，剖解开封装的对象内部，并将那些影响了 多个类的公共行为封装到一个可重用模块，并将其名为“Aspect”，即方面",
            "所谓“方面”，简单地说，就是将那些与业务无关，却为业务模块所共同调用的 逻辑或责任封装起来，" +
                    "比如日志记录，便于减少系统的重复代码，降低模块间的耦合度，并有利于未来的可操作性和可维护性。",
            "AOP代表的是一个横向的关 系，将“对象”比作一个空心的圆柱体，其中封装的是对象的属性和行为；" +
                    "则面向方面编程的方法，就是将这个圆柱体以切面形式剖开，选择性的提供业务逻辑。",
            "而 剖开的切面，也就是所谓的“方面”了。然后它又以巧夺天功的妙手将这些剖开的切面复原，不留痕迹，但完成了效果。",
            "实现AOP的技术，主要分为两大类：一是采用动态代理技术，利用截取消息的方式，对该消息进行装饰，以取代原有对象行为的执行；",
            "二是采用静态织入的方式，引入特定的语法创建“方面”，从而使得编译器可以在编译期间织入有关“方面”的代码。",
            "Spring实现AOP：JDK动态代理和CGLIB代理 JDK动态代理：其代理对象必须是某个接口的实现，" +
                    "它是通过在运行期间创建一个接口的实现类来完成对目标对象的代理；" +
                    "其核心的两个类是InvocationHandler和Proxy。",
            "CGLIB代理：实现原理类似于JDK动态代理，只是它在运行期间生成的代理对象是针对目标类扩展的子类。",
            "CGLIB是高效的代码生成包，底层是依靠ASM（开源的java字节码编辑类库）操作字节码实现的，性能比JDK强；需要引入包asm.jar和cglib.jar。 ",
            "  使用AspectJ注入式切面和@AspectJ注解驱动的切面实际上底层也是通过动态代理实现的。"
    };
    private static String springTwo[] = {
            " AOP使用场景：",
            "Authentication 权限检查",
            "Caching 缓存 ",
            "Context passing 内容传递  ",
            "Error handling 错误处理 ",
            "Lazy loading　延迟加载",
            "Debugging　　调试",
            "logging, tracing, profiling and monitoring　日志记录，跟踪，优化，校准 ",
            "Performance optimization　性能优化，效率检查",
            "Persistence　　持久化  ",
            "Resource pooling　资源池 ",
            "Synchronization　同步",
            "Transactions 事务管理  "
    };
}
