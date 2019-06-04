package com.lw.随笔2.反射二;

public class User {
    private String id;

    private String username;

    private String password;

    public User() {
    }

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String distributeOne = "在运行状态，对于任意一个类，都能够获取到这个类的所有属性和方法，对于任意一个对象，" +
            "都能够调用它的任意一个方法和属性，这种动态获取的信息以及动态调用对象的方法就能成为java语言的反射机制。" +
            "通俗点讲，通过反射，该类对我们来说是透明的，想要获取任何东西都可以。";

    private String DistributeTwo = "想要获得反射机制，就必须先要获取该类的字节码文件对象（.class）,通过字节码文件对象，" +
            "就能够通过该类中的方法获取到我们想要的所有信息，每一个类对应一个字节码文件也就对应着一个class类型的对象，也就是字节码文件对象。";
    private String getMethodOne = "Class clazz1 = Class.forName(\"全限定类名\");　　//通过Class类中的静态方法forName，" +
            "直接获取到一个类的字节码文件对象，此时该类还是源文件阶段，并没有变为字节码文件。";
    private String getMethodTwo = "2、Class clazz2  = Person.class;　　　　//当类被加载成.class文件时，此时Person类变成了.class，" +
            "在获取该字节码文件对象，也就是获取自己， 该类处于字节码阶段。";
    private String getGetMethodThree = "3、Class clazz3 = p.xml.getClass();　　　　//通过类的实例获取该类的字节码文件对象，该类处于创建对象阶段　" +
            "有了字节码文件对象才能获得类中所有的信息，我们在使用反射获取信息时，也要考虑使用上面哪种方式获取字节码对象合理，" +
            "视不同情况而定。下面介绍Class类的功能。";


}
