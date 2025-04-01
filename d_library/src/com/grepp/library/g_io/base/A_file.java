package com.grepp.library.g_io.base;

import java.io.File;
import java.io.IOException;

public class A_file {
    public static void main(String[] args) {

        try {
            // 절대 경로로 파일 생성

            String basePath = System.getProperty("user.home") + File.separator +"Documents" + File.separator + "dev" + File.separator + "backend" + File.separator + "a_java" + File.separator + "d_library";
            File file = new File(basePath + File.separator + "text.txt");
            file.createNewFile();

            // NOTE GA01 : 경로
            // mkdirs
            // 절대경로 : ROOT를 기준으로 경로를 지정하는 방식
            // 상대경로 : 현재 위치부터 경로를 지정하는 방식
            //          현재위치 : ./ 또는 생략
            //                  ./a/b/c == a/b/c
            //          상위 경로 : ../
            String path = System.getProperty("user.home") + "/Documents/dev/backend/a_java/mkdirs/study/";
            File dirs = new File(path);
            System.out.println(dirs.mkdirs()); // ✅ Mac/Windows 모두 호환 가능

            // 상대 경로로 파일 생성
            File dirs2 = new File("./상대경로.txt");
            dirs2.createNewFile();

            // 상대 경로로 상위 디렉토리에 파일 생성
            dirs2 = new File("../../선조경로.txt");
            dirs2.createNewFile();

            // 상대 경로로 디렉토리와 파일 생성
            dirs2 = new File("./src/src");
            dirs2.mkdirs();
            dirs2 = new File("./src/src/text");
            dirs2.createNewFile();

            path = "../../mkdirs/";
            dirs2 = new File(path + "a/");
            dirs2.mkdirs();

            dirs2 = new File(path + "b/");
            dirs2.mkdirs();

            dirs2 = new File(path + "c/");
            dirs2.mkdirs();

            dirs2 = new File(path + "a/a.txt");
            dirs2.createNewFile();

            dirs2 = new File(path + "b/b.txt");
            dirs2.createNewFile();

            dirs2 = new File(path + "c/c.txt");
            dirs2.createNewFile();

            File pathFile = new File(path + "c/");

            // NOTE GA02 : 경로 생성 후 파일 생성
            if (!pathFile.exists()) {
                pathFile.mkdirs();
            }

            dirs2 = new File(path + "c/c.text");
            dirs2.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
