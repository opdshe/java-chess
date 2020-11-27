# java-chess
체스 게임 저장소

### 구현해야 할 기능 구현 목록
[입력]
- 사용자로부터 커맨드 입력 받기
  - 시작 : start
  - 종료 : end
  - 이동 : move sourcePosition targetPosition
  
- 게임이 끝나면 바로 종료할 지 점수 볼 지 입력
  - 종료 : end
  - 점수 및 승자 보기 : status

[게임 과정]
- 체스판 초기화
- 각 말들의 이동 로직 구현
- 게임 종료 기능 
  - King이 잡히면 종료
- 점수 계산 기능 
  - queen : 9점
  - rook : 5점
  - bishop : 3점
  - knight : 2.5점
  - pawn
    - 세로 줄에 같은 색 폰이 있으면 0.5
    - 없으면 1
    
[출력]
- 체스판 출력 기능
- 점수 및 승자 출력 기능
