# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## step3 기능 목록

### domain

- 차량은 입력된 값(정지, 앞으로 이동)에 따라 차를 움직일 수 있어야 한다.
- 차량은 자신의 위치 정보를 제공할 수 있어야 한다.
- 차량에게 어떻게 이동하라는 명령을 내릴 수 있어야 한다.
  - 0~9 사이 랜덤 값을 구하고, 이 값이 4이상일 경우 전진하라고 한다.

<br>

### ui

- 사용자는 몇 대의 자동차로 몇 번 이동할 것인지 입력할 수 있어야 한다.
- 자동차의 상태를 화면에 출력할 수 있다.

<br>

### service
- 주어진 횟수 동안 사용자가 입력한 n대의 자동차는 전진 또는 멈출 수 있다.