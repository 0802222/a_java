package com.grepp.library.f_stream.b_stream;

import com.grepp.library.f_stream.b_stream.z_domain.Exam;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Run {

    public static void main(String[] args) {
//        testStream();
//        testSort();
//        testFilter();
//        testMap();
//        testGroupBy();
//        testReduce();
        testForeach().accept("바깥에서 호출 가능");
    }

    //람다내부에서 지역변수함수 못씀(메모리에서 먼저 내려가서 그럼)
    private static Consumer<String> testForeach() {
        List<Exam> exams = createList();
        // NOTE FB01 : 람다 내부에서 지역변수를 사용할 수 없음
        // 사용하려면 상수처럼 쓸 수 있도록 추가적인 조치가 필요함.
        exams.forEach(System.out::println);
        int num = 0;
        Consumer<String> res = e -> System.out.println(e + ": " + num);
        return res;
    }

    //reduce를 통해 필터, 맵구현가능 (2 매개변수의 타입이다름)
    //BinaryOperator : 리턴타입1, 매개변수2
    private static void testReduce() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = list.parallelStream().reduce(0, //optional 반환되면 null처리 진행
            (a, b) -> a + b,
            (a, b) -> a + b);

        System.out.println(sum);
//        practiceReduceToFilter(createList());
//        practiceReduceToMap(createList());
    }

    // exams에서 학생 이름을 추출해, set으로 반환하는 reduce를 작성하시오.
    // 출력결과 : [어선정, 하명도]
    private static void practiceReduceToMap(List<Exam> list) {
        Set<String> nameSet = list.parallelStream()
            .reduce(
                new LinkedHashSet<>(),
                (a, b) -> {        //a 누적연산 요소, b 요소?
                    a.add((b.name()));
                    return a;
                },
                (a, b) -> a);
        System.out.println("===practiceReduceToMap===");
        System.out.println(nameSet);
    }


    private static void practiceReduceToFilter(List<Exam> list) {
        List<Exam> filtered = list.stream()
            .reduce(new ArrayList<Exam>(),
                (result, exam) -> {
                    if (exam.score() > 90) {
                        result.add(exam);
                    }
                    return result;
                },
                (a, b) -> a);
        System.out.println("===practiceReduceToFilter===");
        System.out.println(filtered);
    }


    private static void testGroupBy() {
        // 평점구하기
        List<Exam> exams = createList();
        Map<String, Double> grouped = exams.stream()
            .collect(Collectors.groupingBy(
                e -> e.name(),
                Collectors.averagingInt(e -> e.score()))
            );
        System.out.println(grouped);

        // 총점구하기 summingInt
//        List<Exam> exams = createList();
//        Map<String, Integer> grouped = exams.stream()
//            .collect(Collectors.groupingBy(
//                e -> e.name(),
//                Collectors.summarizingInt(e -> e.score()))
//            );
//        System.out.println(grouped);

        //그룹핑
//        List<Exam> exams = createList();
//        Map<String, List<Exam>> grouped = exams.stream()
//            .collect(Collectors.groupingBy(e -> e.name()));
//
//        System.out.println(grouped);
    }

    private static void testMap() {
        //list 불러오기
        List<Exam> exams = createList();

        //exams에서 시험 과목에서 "어"가 포함되는 단어만 추출
        System.out.println("===시험 과목에 어가 포함되는 단어만 추출===");
        //function 매개변수하나받아서 조작하고 반환
        List<String> list = exams.stream()
            .map(e -> e.subject())
            .filter(e -> e.contains("어"))
            .toList();
        System.out.println(list);

        // 학생들 중 성만 추출해서 출력해주세요. (중복 비허용 자료구조 set 사용)
        // 출력 결과 : [하, 어, 어, 하]
        System.out.println("===첫번째 성만 추출===");
        Set<String> set = exams.stream()
            .map(e -> e.name().substring(0, 1))
            .collect(Collectors.toSet());
        System.out.println(list);
        System.out.println(set);

//        //exams에서 시험 과목만 추출 (반복문으로 돌릴수도 있으나, 아래방법이 더 편함)
//        System.out.println("===시험 과목만 추출===");
//        //function 매개변수하나받아서 조작하고 반환
//        List<String> list = exams.stream().map(e -> e.subject()).toList();
//        System.out.println(list);
    }

    private static void testFilter() {
        //filter는 predicate type(매개변수 하나, 반환 타입이 true/false)
        List<Exam> exams = createList();
        //점수가 70점 이하인 시험 출력
        System.out.println("===filter===");
        List<Exam> list = exams.stream().filter(e -> e.score() <= 70).toList();// 스트림 생성 및 중간연산
        System.out.println(list);

        // FT님 시험성적만 뽑기
        System.out.println("===FT님 시험성적만 뽑기===");
        List<Exam> FT = exams.stream().filter(e -> e.name().equals("어선정")).toList();
        System.out.println(FT);
    }


    private static void testSort() {
        List<Exam> list = createList();

        list = list.stream()
            .sorted((a, b) -> a.score() - b.score()).toList();
        System.out.println(list);
    }

    // Stream : 맵, 리듀스, 필터를 사용하기 위한 친구
    // 1. 생성 2. 가공 3. 결과 연산
    private static void testStream() {
        // NOTE B01 Stream
        // 1. Stream 생성
        Stream<Integer> iStream = Stream
            .<Integer>builder()
            .add(10).add(13).add(100).add(29)
            .build();

        List<Integer> list = iStream
            .sorted((a, b) -> -(a - b)) //2. 중간연산, 내림차순 정렬
            .toList(); // 3. 결과 연산
        System.out.println(list);
    }

    private static List<Exam> createList() {
        List<Exam> list = new ArrayList<>();
        list.add(new Exam("국어", "하명도", 90));
        list.add(new Exam("수학", "어선정", 100));
        list.add(new Exam("영어", "어선정", 100));
        list.add(new Exam("과학", "하명도", 46));
        return list;
    }

}
