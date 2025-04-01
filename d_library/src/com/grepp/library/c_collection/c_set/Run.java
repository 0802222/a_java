package com.grepp.library.c_collection.c_set;

import com.grepp.library.c_collection.c_set.grepp._HashSet_p1;
import com.grepp.library.c_collection.z_domain.School;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Run {

    public static void main(String[] args) {
        
//        pracAdd();
        pracRemove();

        //set 집합연산을 위한 리스트 2개생성 (1명은 중복을 보기위해 넣음)
        List<String> firstList = List.of(
            "김가희",
            "김예원",
            "김광훈",
            "안재호",
            "안세희"
        );

        List<String> secondList = List.of(
            "전정원",
            "정서윤",
            "채철민",
            "최대열",
            "안세희"
        );

        Set<String> firstSet = new HashSet<>(firstList);
        Set<String> secondSet = new HashSet<>(secondList);
        pracSetOperation(firstSet, secondSet);
    }


    private static void pracSetOperation(Set<String> firstSet,  Set<String> secondSet ) {

//        // NOTE C01 1. 합집합 (addAll 사용)
//        Set<String> setAll = new HashSet<>();
//        setAll.addAll(firstSet);
//        setAll.addAll(secondSet);
//        System.out.println("===합집합===");
//        System.out.println(setAll);
//
//        // NOTE C02 2. 차집합 (합집합-두번째집합)
//        System.out.println("===차집합===");
//        setAll.removeAll(secondSet);
//        System.out.println(setAll);
//
//        // NOTE C03 3. 교집합 (retainAll 사용)
//        System.out.println("===교집합===");
//        firstSet.retainAll(secondSet);
//        System.out.println(firstSet);
//
//        // NOTE C04 4. 부분집합 여부
//        System.out.println("===부분집합 여부==="); //3번에 교집합 1명나왔기때문에 부분집합여부가 true가 됨
//        System.out.println("부분집합 여부: " + secondSet.containsAll(firstSet));

    }

    // hash 구현할때 object 꼭 써야됨
    private static void pracRemove() {
        List<School> list = SchoolFactory.createSchools();
        _HashSet_p1<School> set = new _HashSet_p1<>();

        for (School school : list){
            set.add(school);
        }

        //원래수업내용
        //set.remove(list.get(2));

        //퀴즈 (아래 코드 바꿔보기-민사고 삭제할수있게)
        set.remove(new School("민사고", "대전", 3));
        System.out.println(set);

    }



    private static void pracAdd() {
        _HashSet_p1<School> set = new _HashSet_p1<>();
        List<School> list = SchoolFactory.createSchools();

        for (School school : list) {
            System.out.println(school);
            System.out.println(set.add(school));
        }

        System.out.println(set);
    }

}
