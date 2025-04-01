package com.grepp.basic.c_prepare;

//NOTE CA01 : 예시문
public class NoteCa01Test {
    public static void main(String[] args) throws InterruptedException {
        String[] loading = {"-", "\\", "|", "/"};

        for (int i = 0; i < 20; i++) {
            System.out.print("\rLoading... " + loading[i % 4]); // 커서를 줄 맨 앞으로 이동
            Thread.sleep(200);
        }

        System.out.println("\rDone!       "); // 완료 메시지 출력 후 남은 글자 지우기
    }
}
