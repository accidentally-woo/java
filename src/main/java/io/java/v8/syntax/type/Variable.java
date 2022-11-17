package io.java.v8.syntax.type;

public class Variable {
    /*
    변수의 종류
        1. 기본형(primitive type) 변수 : 쉽게 소문자 타입
        2. 참조형(reference type) 변수 : 쉽게 대문자 타입

        확인 내용
        - 변수 / 상수 구분 가능한가?
        - 리터럴?
     */
    int aInteger = 2; // 리터럴 타입 접미사가 없는 경우의 정수
    double aDouble = 0.3; // 리터럴 타입 접미사가 없는 경우의 실수

    long aLong = Integer.MAX_VALUE + 1L;
    float aFloat = (float) 0.1;
    float aFloat2 = 0.1f;
    float aFloat3 = 0.1F;

    @Override
    public String toString() {
        return "응애 나 변수";
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE + 1L);
    }
}
