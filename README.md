## 숫자야구게임 (baseball)

### 기능목록

1. 랜덤한 숫자 3개를 생성한다.   
- 1~9까지의 랜덤한 숫자를 생성한다.
- 1.2 중복된 숫자가 아니라면, 숫자를 추가한다.

2.컴퓨터의 숫자와 사용자의 숫자를 비교한다. (숫자 -> 1:1)
- 컴퓨터와 사용자의 숫자 하나를 비교하여 STRIKE  를 반환한다.
- 2-1. 컴퓨터와 사용자의 숫자 하나를 비교하여 BALL    를 반환한다.
- 2-1. 컴퓨터와 사용자의 숫자 하나를 비교하여 NOTHING 를 반환한다.

3. 컴퓨터 3개의 숫자와 사용자 1개의 숫자를 비교하여 STRIKE, BALL, NOTHING 중 하나를 반환. (숫자 -> 3:1)

4. 컴퓨터 3개의 숫자와 사용자 3개의 숫자를 비교하여 결과를 반환한다. (3:3)

## 자동차경주 (racingcar)

### 자동차 경주게임 기능요구사항 - 피드백 적용

1. 자동차 이름을 검증한다. [Name.class]
- 자동차의 이름이 길이 5를 초과한다.--> Throw Exception 
  - Car 클래스의 Name 클래스에서 검증하도록 수정
- 자동차 이름이 중복된다 --> Car 클래스의 Name 에서 검증할 수 없음. (제외)

2. 구분자(,)를 기준으로 정상적으로 자동차 이름을 정상적으로 구분하는지 검증한다. [StringUtils.class]
- “A,B,C” —> A B C 3개로 정상적으로 분리 되어야 한다.

3. 전진여부를 입력받아 정상적으로 전진했는지 검증한다. (자동차 1개) [Car.class]
- 자동차가 한칸 앞으로 이동을 잘하는지 검증
- 자동차의 현재 상태를 문자열의 형태로 검증한다. ["이름 : -"]

4. 자동차들 중에서 우승자를 출력한다. (출력 기준은 입력받은 이름 순서로 출력을 한다.) [Cars.class]
- 자동차들 중에서 가장 멀리 전진한 자동차의 위치를 출력한다.

5. Input View [UserView.class]
- 입력에 해당하는 view를 출력한다.

## 좌표계산기 (coordinate)


### 기능목록

1. ~~좌표 정보를 파싱한다. [ParsingUtils.class]~~
   - 괄호 수 만큼 반복해서 좌표 정보를 파싱한다.
2. ~~X값, Y 을 검증한다. [Point.class]~~
   - X, Y 좌표 모두 최대 24까지만 입력할 수 있다.
3. Point 간의 면적을 구한다. 각각의 클래스에서 처리하도록 한다. (Shape를 extends 한다.)
   - 두 점 사이의 거리를 계산한다. [Line.class]
   - 사각형의 면적을 구한다 [Square.class]
   - 삼각형의 면적을 구한다. [Triangle.class]
4. 좌표를 출력한다.
   - 좌표를 배열의 인덱스로 변환하여 2중 반복문으로 무식하게 출력한다.

### 고민흔적

1. Shape이라는 추상화를 interface로 정의할 것인지 아니면, abstract class로 정의할 것인지 고민
   - < Line Square Traingle > 클래스에서 Points 를 관리하는것이 아닌 Shape 부모에서 관리하기 위해서 interface에서
   abstract class로 변경
2. 좌표의 출력을 어떻게 처리해야 할지?
   - 아이디어1 : 가장 무식하게 2중반복문으로 출력한다 이때 좌표를 배열의 인덱스로 치환하는 과정이 필요하다.
   
 



