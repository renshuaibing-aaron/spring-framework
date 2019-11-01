http://localhost:8080/aarontest/sayHello?age=12&name=Jack

登陆即可

2.  执行编译跳过测试
gradle build -x test

3.一个tomcat 下面可以部署多个应用,应用之间用文件名程区分，这里修改build文件，指定war包的名字(否则gradle打包每次
都用的是项目名字，每次部署都需要修改，太麻烦)

4.