package com.aaron.ren.ioc.customerioc.test.cn.thinkinjava.myspring.test;

public class ReferenceBean {

  private HelloWorld hello;

  public void say() {
    hello.say();
  }

  public void setHello(HelloWorld hello) {
    this.hello = hello;
  }
}
