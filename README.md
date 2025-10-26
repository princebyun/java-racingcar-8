# java-racingcar-precourse

[2주차 개인적 학습 목표]

-1주차 피드백을 적극적으로 반영하는것을 목표로 한다.
-2주차 미션을 통해 테스트도구 사용을 최대한 이해하고 TDD를 목표로 한다.
-각 함수의 역할을 반드시 하나로 정하여 설계한다.

[우아한테크코스 프리코스 2주차 자동차 경주 개인적으로 이해한 기능 요구사항 정리]

1. 여러대의 자동차를 입력 받을수 있다.
2. 여러대의 자동차는 전진 또는 멈출수 있다.
3. 여러대의 자동차는 이름을 부여 받는다.(여러대의 자동차를 입력받을때 이름으로 입력받는다.)
4. 입력받을때 쉼표를 기준으로 이름은 5자 이하만 가능하다
5. 사용자는 경주의 횟수를 입력한다.
6. 자동차의 전진 조건은 0에서 9사이에서 무작위 값을 구하고 4이상일때 전진한다.(4,5,6,7,8,9 전진)
7. 경주가 끝나면 우숭자를 알려준다.
8. 우승자가 여러명일경우 쉼표를 이용하여 구분한다.
9. 사용자가 자동차 이름을 입력하지 않거나,5글자 이상 이름을 입력하거나 경주횟수를 숫자가아닌 문자 또는 음수 또는 빈값이면 에러로 종료시킨다.

[구현할 기능 목록 정리]

1. 자동차 입력받는 클래스 생성
2. 입력받은 자동차 이름을 validation하는 클래스 생성
3. 입력받은 자동차들을 컬렉션에 저장하는 클래스 생성
4. 사용자 경주 횟수를 입력받는 클래스 생성
5. 입력받은 경주 횟수를 validation하는 클래스 생성
6. 경주를 위한 랜덤수 클래스 생성
7. 경주 진행 클래스 생성
8. 경주 진행 출력 클래스 생성
9. 경주 결과 클래스 생성
10. 경주 결과 출력 클래스 생성
11. 자동차 경주 Application 구현

[2주차 미션 개발 구조 정리]

1주차와 다르게 자동차와 게임이라는 2가지 객체지향이 필요함을 느낌.
그래서 1주차는 파일 하나에 개발을 했다면 2주차는 여러 클래스를 만들어 각 클래스의 역할에 맡게 개발을 진행할려함.

[파일구조 작성해보기]

car 클래스
-name(String) : 이름
-position(int) : 상태

validation 클래스
-nameCheck : 자동차 이름 벨리데이션
-runningNumberCheck : 경주횟수 밸리데이션

cars 클래스
-List<car> : 경주에 참가하는 자동차 목록
-userInputArray : 사용자 입력값 구분자로 나누기
-userInputSaveCollection : 구분자로 나눠진 자동차를 컬렉션에 저장

racing 클래스
-racingCount : 경주횟수
-running : 자동차 경주 진행
-getPositionRandomNumber : 랜덤수 출력
-resultWiners : 우승자 클래스

userInput 클래스
-carsNameInput : 자동차 이름 입력
-racinRoundInput : 경주 횟수 입력

racingOutput 클래스
-racingRuningOuput : 경주 진행 출력
-racingResultOutput : 경주 우승자 출력

```
java-racingcar-8/
├── src/
│   ├── main/
│   │   ├── java/
│   │       ├── racingcar/
│   │           ├── Application.java
│   │           ├── Car.java
│   │           ├── Cars.java
│   │           ├── Racing.java
│   │           ├── RacingOutput.java
│   │           ├── UserInput.java
│   │           └── Validation.java
│   ├── test/
│       ├── java/
│           ├── racingcar/
│               ├── ApplicationTest.java
│               ├── CarTest.java
│               ├── CarsTest.java
│               ├── RacingTest.java
│               └── ValidationTest.java
```

[기능구현을 하면서 생각난 리팩토링 할 목록 정리]

1. 같은이름이 2개 이상있을 경우 에러로 처리
2. 중구난방으로 되어 있는 코드 역할 다시 확인하기(예를들면 deoth가 2까지 인지 확인)
3. userInputSaveCollection void로 리팩토링
4. 불필요한 소스코드 리팩토링