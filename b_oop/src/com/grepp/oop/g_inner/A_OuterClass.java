package com.grepp.oop.g_inner;

public class A_OuterClass {
    private String desc;

    public A_OuterClass(String desc) {
        this.desc = desc;
    }


    // NOTE GA04 익명클래스 (정말 자주씀)
    // 클래스나 인터페이스의 이름이 없는 자식 클래스를 생성과 동시에 인스턴스화 하고싶을때 사용
    public void anonymous(){
       AnonymousAbstractClass anonymous = new AnonymousAbstractClass() {
           @Override
           public void print() {
               System.out.println("anonymous");
           }
       };
       anonymous.print();
    }
    // 메서드안에 클래스 만들기
    // NOTE GA03 Local class
    // 클래스 선언한 메서드 안에서만 사용가능
    public void localClass(){
        class LocalClass{
            public void print(){
                System.out.println("LocalClass");
            }
        }

        LocalClass local = new LocalClass();
        local.print();
    }


    // NOTE A01 Static Inner Class
    // static 은 타입을 인스턴스화 하지 않고도 쓸수 있음, 객체필드에는 접근하지못함
    public static class StaticInner{
        public void print() {
            System.out.println("Static Inner Class 입니다.");
        }
    }

    // NOTE A02 Instance Inner Class
    // 인스턴스는 외부 클래스의 this, 속성에도 접근가능
    public class InstanceInner{
        public void print(){
            System.out.println("========================");
            System.out.println(A_OuterClass.this);
            System.out.println(this);
            System.out.println(desc);
        }
    }

}
