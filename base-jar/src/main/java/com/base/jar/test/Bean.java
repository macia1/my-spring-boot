package com.base.jar.test;

/**
 * @author zenggs
 * @Date 2022/2/23 9:06
 */
public class Bean {

    public Bean() {
        System.out.println(this.getClass().getName() + " init.");
    }

    public void call(){
        System.out.println(this.getClass().getName() + " called. ");
    }

}
