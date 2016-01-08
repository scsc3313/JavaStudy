###Spring Boot

- war파일을 사용하지 않고 embed tomcat 또는 jetty 사용
- Spring Boot에서 지원하는 stater POM으로 Maven을 간단하게 사용
- Spring에 수많은 설정을 자동으로 설정(xml 설정이 필요없다)


######pom.xml
"'
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>1.1.8.RELEASE</version>
</parent>
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
"'
