package com.grepp.coffeemanager.domain.multilingual.payment;

import java.util.List;

public class Multilingual {

    private static final List<Language> languages =
        List.of(Language.SPAIN, Language.CHINA);

    // 위에 접근할 수 있는 진입점 열기
    public static List<Language> languages(){
        return languages;
    }

}
