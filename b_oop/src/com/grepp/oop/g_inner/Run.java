package com.grepp.oop.g_inner;

import com.grepp.oop.g_inner.A_OuterClass.InstanceInner;
import com.grepp.oop.g_inner.A_OuterClass.StaticInner;

public class Run {

    public static void main(String[] args) {

        // 타입으로 부르면 됨
        StaticInner staticInner = new A_OuterClass.StaticInner();
        staticInner.print();

        // 레퍼런스로 접근해서 가져다 쓰면 됨
        // 이렇게는 잘 안씀 (치명적인 이슈가 있음 A_outerclass가 instanceinner를 참조하고있기때문에 메모리에서 안내려감)
        A_OuterClass a = new A_OuterClass("outer");
        InstanceInner instanceInner = a.new InstanceInner();
        instanceInner.print();


        a.localClass();
    }

}
