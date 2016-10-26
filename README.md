# seat
欢迎来到星座配对小程序

主体思想1期设计分为两步：

第一步：10个人里面两两配对找出所有组合就行，即C(10,2)。

第二步：匹配，用星座匹配，星座匹配有分值，按照分值高低评估两个人在一起的粘性程度。

星座配对来源于百度APISTORE

具体网址为：http://apistore.baidu.com/apiworks/servicedetail/2408.html

依赖库1：利用apache commons libs中的math3运算库

        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-math3</artifactId>
            <version>3.6.1</version>
        </dependency>


依赖库2: 利用84wifi作为java通讯http服务中间件

        <dependency>
            <groupId>com.wifi84</groupId>
            <artifactId>requestUtil</artifactId>
            <version>2.2</version>
        </dependency>


