package com.grepp.library.c_collection.d_map;

import static com.grepp.library.c_collection.c_set.SchoolFactory.createSchools;

import com.grepp.library.c_collection.c_set.SchoolFactory;
import com.grepp.library.c_collection.d_map.grepp._Entry;
import com.grepp.library.c_collection.d_map.grepp._HashMap;
import com.grepp.library.c_collection.z_domain.School;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.reflect.KProperty.Getter;

public class Run {

    public static void main(String[] args) {
        List<School> schools = SchoolFactory.createSchools();
        pracPut();
        pracGet();
        pracLinkedHashMap();
    }

    private static void pracLinkedHashMap() {
        List<School> schools = SchoolFactory.createSchools();
        Map<String, School> linkedMap = new LinkedHashMap<>();
        Map<String, School> hashMap = new HashMap<>();
        for (School school : schools) {
            linkedMap.put(school.getName(), school);
            hashMap.put(school.getName(), school);
        }
        System.out.println(linkedMap); //순서보장 o
        System.out.println(hashMap); //순서보장 x
    }

    // 확인 : 크리에이트스쿨맵 -> 맵 빼기
    // 확인 : 언더바 엔트리로 바꾸기, 언더바 해시로 바꾸기
    private static void pracGet() {
        System.out.println("===get===");
        _HashMap<String, School> map = createSchools();
        System.out.println(map.get("서울대"));

//        for (_Entry<String, School> entry : map.entrySet()){
//            System.out.println("key" + entry.getKey());
//            System.out.println("value" + entry.getValue());
//        }

        // 확인 : 2가지 방법 추가하기
        //키셋 호출
        System.out.println("============");
//          for(String key : map.keySet()){
//              System.out.println("key : " + key);
//              System.out.println("value : " + map.get(key));
//        }

//        //밸류즈
//        System.out.println("============");
//        List<School> list = new ArrayList<>(map.values());
//        for(School school : list){
//            System.out.println(school);
//        }

    }


    private static _HashMap<String, School> createSchools() {
            _HashMap<String, School> map = new _HashMap<>();
            List<School> schools = SchoolFactory.createSchools();
            for(School school : schools){
                map.put(school.getName(), school);
            }
            return map;
    }

    // PUT 은 추가, 수정기능이 있음 (키를 해싱해서 저장하기때문에 입력순서가 보장되지않음)
    private static void pracPut() {
        List<School> schools = SchoolFactory.createSchools();
        _HashMap<String, School> map = new _HashMap<>();

        map.put("서울대", schools.getFirst());
        map.put("연세대", schools.get(1));
        map.put("grepp", schools.get(2));
        map.put("grepp", new School("우리반","집", 4));
        System.out.println(map.get("grepp"));
    }
}