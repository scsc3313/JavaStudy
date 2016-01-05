###Strategy Pattern

- 한 과일 매장에서 상황에 따라 손님에게 할인을 해줍니다.
- nomal 패키지에 있는 code는 정책이 추가될수록 코드 분석을 어렵게 만든다.
- 가격 정책이 추가될 때마다 calculate 메서드 수정하는 것이 점점 어려워진다.

#####따라서
- DiscountStrategy interface를 만들어 Caculate 클래스를 구성한다.
- FirstGuestDiscountStrategy와 NotFreshDiscountStrategy가 상속을 받아 구현된다.
- 새로운 할인 정책이 추가될 경우 NewDisCountStrategy 클래스를 만들어 주면된다.


