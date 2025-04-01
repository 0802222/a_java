package com.grepp.basic.b_operator;

public class G_복합대입연산 {

    // NOTE BG01 : 복합대입연산 (산술연산 + 대입연산)
    // = : 대입연산자
    // +=, -=, *=, /=, %= : 복합대입연산자
    public static void main(String[] args) {

        int num = 12;

        // num = num + 12;
        num += 12; //12 + 12 = 24
        System.out.println(num);

        num -= 12; //앞에서 전달받은 (num = 24) - 12 = 12
        System.out.println(num);

        num *= 12; // 12 * 12 = 144
        System.out.println(num);

        num /= 12; // 144 /12 = 몫12
        System.out.println(num);

        num %= 11; // 12%11 = 나머지1
        System.out.println(num);

    }

}
