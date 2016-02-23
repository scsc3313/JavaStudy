###Solid원칙

    로버트 마틴이 2000년대 초반에 명명한 객체 지향 프로그래밍 및 설계의 다섯 가지 기본 원칙

#####단일 책임 원칙(Single Responsibility Principle)

    한 클래스는 하나의 책임만 가져야 한다.
    클래스는 그 책임을 완전히 캡슐화해야 함을 일컫는다.

#####개방-폐쇄 원칙(Open-Closed Principle)

    소프트웨어 개체(클래스, 모듈, 함수)는 확장에 대해 열려 있어야하고, 수정에는 닫혀 있어야 한다.
    하나에 수정을 가할 때 그 모듈을 이용하는 다른 모듈들을 줄줄이 고쳐야 한다면 수정이 어렵다.
    개방-폐쇄 원칙은 시스템의 구조를 올바르게 재조직(Refactoring)하여 나중에 이와 같은 유형의 변경이 더 이상의 수정을 유발하지 않도록 하는 것이다.

#####리스코프 치환 원칙(Liskov Substitution Principle)

    프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 한다.
    자료형 S가 자료형 T의 하위형이라면 T의 객체를 자료형 S의 객체로 치환할 수 있어야 한다는 원칙이다.

#####인터페이스 분리 원칙(Interface Segregation Principle)

    특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다.
    클라이언트가 자신이 이용하지 않는 메서드에 의존하지 않아야 한다는 원칙이다.
    큰 덩어리의 인터페이스들을 구체적이고 작은 단위들로 분리시킴으로써 클라이언트들이 꼭 필요한 메서드들만 이용할 수 있게 한다.

#####의존 관계 역전 원칙(Dependency Inversion Principle)

    추상화에 의존해야지, 구체화에 의존하면 안된다.
    상위 모듈은 하위 모듈에 의존해서는 안된다. 상위 모듈과 하위 모듈 모두 추상화에 의존해야 한다.
    추상화는 세부 사항에 의존해서는 안된다. 세부사항이 추상화에 의존해야 한다.