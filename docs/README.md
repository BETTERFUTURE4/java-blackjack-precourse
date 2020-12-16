## 구현해야 하는 기능 목록

게임 진행은 '참가자 모집' - '카드 생성' - '카드 배분' - '결과 확인' 으로 진행된다.

### 참가자 모집
- 게임에 참여하려는 사람의 이름을 입력 받는 기능
    - 쉼표를 기준으로 이름을 나눈다.
    - 이름이 공백이 아닌지 검증해야한다.
    - 이름이 중복되지 않는지 검증해야한다.

- 각 참여자 별로 배팅 금액을 입력 받는 기능
    - 숫자인지 검증해야 한다.
    - 음수가 아닌지 검증해야 한다.

### 카드 생성
- 4개의 모양(스페이드, 다이아몬드, 하트, 다이아몬드, 클로버)으로 이루어져 있다.
- 각 모양당 Ace, 2 ~ 9, King, Queen, Jack 가 존재해야 한다.
- 카드 섞는 기능
    - 랜덤하게 카드를 섞어야한다.

### 카드 배분
- 딜러와 참가자들에게 2장씩 카드를 배분한다.
    - 딜러의 카드는 한 장만 공개되어야한다.
    - 배분한 카드는 덱에서 빼줘야한다.
    
- 딜러와 참가자들이 가진 카드합을 계산하는 기능
    - 참가자의 2장의 카드합이 21인 경우 배당금의 1.5배를 받는다.
    - 참가자와 딜러의 카드합이 모두 21인 경우 참가자는 배팅한 금액을 돌려받는다.
    
- 참가자들에게 카드를 뽑을건지 결정하게 한다.
    - 입력이 y 나 n이 맞는지 검증해야한다.
    - 뽑는 경우(y)
        - 새로운 카드를 뽑고 참가자가 가진 모든 카드를 출력한다.
        - 카드합이 21이 초과하는 경우 패배한다.
    - 뽑지 않는 경우(n)
        - 참가자가 가진 모든 카드를 출력한다.
        
- 딜러가 처음에 뽑은 2장의 카드의 합이 16이하인 경우 1장을 더 뽑는다.
    - 딜러의 카드합이 21을 넘는다면 참가자의 승리
        - 카드합이 21을 넘은 참가자라도 참가자가 승리

### 결과 확인
- 딜러와 참가자들이 가진 모든 카드를 점수와 함께 출력한다.
    - ACE 카드가 있는 경우 21을 넘지 않는 선에서 1과 11중 하나의 값을 선택할 수 있다.
    - King, Queen, Jack 은 10으로 계산한다. 
    
- 딜러와 각 참가자들의 점수를 비교하여 결과 출력 
    - 카드합이 21에 더 가까운 사람이 승리
        - 카드합이 21을 초과하는 경우는 무조건 패배
    - 참가자가 승리시 배팅 금액만큼 수입 발생
    - 참가자가 패배시 배팅 금액만큼 손해 발생
    - 딜러는 모든 참가자와의 경기의 수익을 합한 값을 출력