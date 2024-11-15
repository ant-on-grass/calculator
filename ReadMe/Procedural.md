# calculator

---

// import

Scanner 클래스를 통해 입력 객체를 만들 생각입니다.

Queue 를 받기 위해 LinkedList 를 입포트할 것 입니다.
또한, Queue 를 입포트할 것 입니다.

---

// 필드

기본적으로 연산에 필요한 피연산자를 묶는 변수 int 로 생성 - ~~calculation~~
~~연산에 필요한 연산자를 묶는 변수 String 로 생성~~
~~해당 값들을 다시 int로 변환하여 변수로 재저장할 공간 생성~~

연산 결과를 int로 저장할 변수 생성 - result (int)


---

// 메서드 < - lv 2 진행 예정

연산을 위한 연산메서드를 만들 생각입니다. - 1)

연산 결과와 연산에 필요했던 필드 값들을 저장할 메서드를 만들 것입니다. - 2)

---

---

추가 부분 / 변경 부분 / 혹은 예정

//추가

//필드

배열에 결과 필요 연산자 피연사자 묶 - gather (int[])
map 을 이용하여 키값에 연산 순서 기입 - caL_sign_m (Integer,String)
~~queue 에 map 을 대입~~
연산을 수로 한걸 뽑아낼 변수 생성해야한다. - cal_str (String)
연산에 쓴 정보 queue 에 저장 - log (int[])

---

//변경 부분
연산자를 수로 받고 인식하기 위해 INTEGER로 - calculation_int

---

// 예정

//메서드 < - lv 2 진행 예정

~~map 에 키 생성 메서드 + map의 데이터가 삭제 될 시 키 값 수정~~
queue 10개가 채워지면 삭제 FIFO - 3)
queue 값을 1) 메서드에 로 다시 돌려 출력 - 4)

---

---

// 회고

연산자를 수로 받아서 결과를 내는 것이 더 쉽다고 판단하였는데,
오려히 코드를 더럽히는 결과를 가지고 온거 같다.

이런 걸 판단하는 것이 안좋은 이유는 **_자료구조를 파악_** 을 아직 제대로
하지 못하해서 그런거 같다.

_**조금더 찾고 공부할 필요를 느낀다.**_

그래도 그나마 다행인건 lv2,3을 할 때, 해당과정이 도움이 됬을꺼라 생각한다.

---

---

//

Queue<Integer,Arrays> log = new LinkedList<Integer,Arrays>();
< - 이렇게 하려했던이유 넘버링을 하려 햇음
근데 queue 어짜피 최하단 데이터부터 빠져서 제일 최근은 최상단을 검색하면 된다.

ps 애초에 문법이 안됨!
Queue<Integer,int[]> log = new LinkedList<Integer,int[]>();
wrong number of type arguments; 해당 오류가 뜬다
아 맞다...Queue 매개변수 하나 받는다. 망각했다.


Queue<int[]> log = new LinkedList<int[]>();
매개변수에 Array 를 넣었는데 안된다. int[]로 설정해야 된다.
Q. Array는 왜 안될까? 언제 쓸수 있을까?
A .


데이터 조회는 Arrays 를 임포트해서 Arrays.toString(); 할 예정이다.

