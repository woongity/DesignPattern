# DesignPattern

Design pattern들에 대해서 정리하고, 간단하게 구현해본 레포지토리 입니다.

## Singleton Pattern

디폴트 생성자를 private 지시자 사용으로 막아버리고, getInstance를 사용해서 가져오도록 구현. singleton은 자기 자신의 객체를 가지고 있어야함. 
자신이 가지고 있느 자신의 객체를 null로 초기화 해두고, null이면 새로 생성, null이 아니라면 자신이 가진 객체를 반환하도록 구현.
