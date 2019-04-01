
单例模式
保证一个类只有一个实例，并且提供一个访问该实力的全局访问点。
常见场景
windows 的task manager 任务管理器
window的回收站
项目中读取配置文件的类，一般也是一个对象
网站计数器
应用程序的日志应用
数据库连接池
spring 中的bean
servlet 中的每个servlet
优点：之生成一个实例，减小系统开销

常见五种单利模式
主要
懒汉式（线程安全，调用效率不高，但是，可以延迟加载）
饿汉式（线程安全，效率高，但是不能延迟加载）
其他
双重检测锁式（由于JVM底层内部模型原因，偶尔会出现问题，不建议使用）
静态内部类式（线程安全，调用效率高，但是，可以延迟加载）
枚举单利（线程安全，调用效率高，不能延迟加载）