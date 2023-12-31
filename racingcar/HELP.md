# 자동차 경주게임

기능 요구사항 리스트

## 자동차 경주게임 기능요구사항

1. 자동차 이름을 검증한다. [ValidationUtils.class]
- 자동차의 이름이 길이 5를 초과한다. --> 예외 THROW
- 자동차의 이름중 중복된 이름이 존재한다. --> 예외 THROW

2. 구분자(,)를 기준으로 정상적으로 자동차 이름을 정상적으로 구분하는지 검증한다. [StringUtils.class]
- “A,B,C” —> A B C 3개로 정상적으로 분리 되어야 한다.

3. 전진여부를 입력받아 정상적으로 전진했는지 검증한다. (자동차 1개) [Car.class]
- 자동차가 한칸 앞으로 이동을 잘하는지 검증
- 자동차의 현재 상태를 문자열의 형태로 검증한다. ["이름 : -"]
- 

4. 자동차들 중에서 우승자를 출력한다. (출력 기준은 입력받은 이름 순서로 출력을 한다.) [Cars.class]
- 자동차들 중에서 가장 멀리 전진한 자동차의 위치를 출력한다. 

6. Input View [UserView.class]
- 입력에 해당하는 view를 출력한다.

6. Result View
- 자동차 객체를 입력받아 전진한 횟수를 고려하여 “-” 를 출력한다.

## 자동차 경주게임 기능요구사항 - 피드백 적용

1. 자동차 이름을 검증한다. [Name.class]
- 자동차의 이름이 길이 5를 초과한다.--> Throw Exception 
  - Car 클래스의 Name 클래스에서 검증하도록 수정
- 자동차 이름이 중복된다 --> Car 클래스의 Name 에서 검증할 수 없음. (제외)

2. 구분자(,)를 기준으로 정상적으로 자동차 이름을 정상적으로 구분하는지 검증한다. [StringUtils.class]
- “A,B,C” —> A B C 3개로 정상적으로 분리 되어야 한다.

3. 전진여부를 입력받아 정상적으로 전진했는지 검증한다. (자동차 1개) [Car.class]
- 자동차가 한칸 앞으로 이동을 잘하는지 검증
- 자동차의 현재 상태를 문자열의 형태로 검증한다. ["이름 : -"]
-

4. 자동차들 중에서 우승자를 출력한다. (출력 기준은 입력받은 이름 순서로 출력을 한다.) [Cars.class]
- 자동차들 중에서 가장 멀리 전진한 자동차의 위치를 출력한다.

6. Input View [UserView.class]
- 입력에 해당하는 view를 출력한다.















