###Decorator Pattern

- 상속을 이용한 확장이 증가하게 되면 클래스가 불필요하게 증가한다
- 상속이 아닌 위임을 하는 방식으로 기능을 확장해 나간다
- FileOut 인터페이스는 파일을 출력하는 기능
- Decorator라는 클래스가 모든 데코레이터를 위한 기반 기능을 제공하는 클래스다
- 스프링 프레임워크의 경우 트랜잭션 처리를 위해 데코레이터 패턴을 사용한다