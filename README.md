# osemes.javapro.dz34

Я переробив клас Order. додав список продуктів "products" до класу Order і встановлю відношення між таблицями за допомогою анотацій JPA. 
Також я переробив клас Product і встановив відношення між ним і Order.
Зараз я маю відношення "один до багатьох" між Order і Product, в якому одне замовлення може містити багато продуктів. 
Поле "order_id" буде використовуватися для зв'язку між ними. 
Також я переробив базу даних (змінив datatypes). 

Зараз проект компілюється без помилок. 

 :: Spring Boot ::                (v2.5.4)

07:11:50.657 [main] INFO  com.example.demo.DemoApplication - Starting DemoApplication using Java 16.0.2 on NW11-139 with PID 10776 (C:\osem\Projects\osemes.javapro.dz34\target\classes started by User303 in C:\osem\Projects\osemes.javapro.dz34)
07:11:50.657 [main] INFO  com.example.demo.DemoApplication - Starting DemoApplication using Java 16.0.2 on NW11-139 with PID 10776 (C:\osem\Projects\osemes.javapro.dz34\target\classes started by User303 in C:\osem\Projects\osemes.javapro.dz34)
07:11:50.671 [main] INFO  com.example.demo.DemoApplication - No active profile set, falling back to default profiles: default
07:11:50.671 [main] INFO  com.example.demo.DemoApplication - No active profile set, falling back to default profiles: default
07:11:51.172 [main] INFO  org.springframework.data.repository.config.RepositoryConfigurationDelegate - Bootstrapping Spring Data JPA repositories in DEFAULT mode.
07:11:51.218 [main] INFO  org.springframework.data.repository.config.RepositoryConfigurationDelegate - Finished Spring Data repository scanning in 37 ms. Found 2 JPA repository interfaces.
07:11:51.696 [main] INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer - Tomcat initialized with port(s): 8080 (http)
07:11:51.707 [main] INFO  org.apache.coyote.http11.Http11NioProtocol - Initializing ProtocolHandler ["http-nio-8080"]
07:11:51.708 [main] INFO  org.apache.catalina.core.StandardService - Starting service [Tomcat]
07:11:51.708 [main] INFO  org.apache.catalina.core.StandardEngine - Starting Servlet engine: [Apache Tomcat/9.0.52]
07:11:51.798 [main] INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/] - Initializing Spring embedded WebApplicationContext
07:11:51.798 [main] INFO  org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext - Root WebApplicationContext: initialization completed in 1088 ms
07:11:51.934 [main] INFO  org.hibernate.jpa.internal.util.LogHelper - HHH000204: Processing PersistenceUnitInfo [name: default]
07:11:51.983 [main] INFO  org.hibernate.Version - HHH000412: Hibernate ORM core version 5.4.32.Final
07:11:52.090 [main] INFO  org.hibernate.annotations.common.Version - HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
07:11:52.178 [main] INFO  com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Starting...
07:11:52.462 [main] INFO  com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Start completed.
07:11:52.473 [main] INFO  org.hibernate.dialect.Dialect - HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
07:11:53.016 [main] INFO  org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator - HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
07:11:53.022 [main] INFO  org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean - Initialized JPA EntityManagerFactory for persistence unit 'default'
07:11:53.284 [main] WARN  org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration$JpaWebConfiguration - spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
07:11:53.442 [main] INFO  org.springframework.boot.autoconfigure.web.servlet.WelcomePageHandlerMapping - Adding welcome page: class path resource [static/index.html]
07:11:53.568 [main] INFO  org.apache.coyote.http11.Http11NioProtocol - Starting ProtocolHandler ["http-nio-8080"]
07:11:53.590 [main] INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer - Tomcat started on port(s): 8080 (http) with context path ''
07:11:53.599 [main] INFO  com.example.demo.DemoApplication - Started DemoApplication in 3.282 seconds (JVM running for 3.983)
07:11:53.599 [main] INFO  com.example.demo.DemoApplication - Started DemoApplication in 3.282 seconds (JVM running for 3.983)

Виконання ДЗ 34. Spring Data

1. Реалізувати клас Order. Цей клас зберігатиме значення: id, date, cost, products
1.1 Описати цю сутність за допомогою JPA-анотацій.
2. Реалізувати клас Product. Цей клас зберігатиме значення: id, name, cost
2.1 Описати цю сутність за допомогою JPA-анотацій.
3. Створити ProductRepository для взаємодії з сутністю Product
4. Замовлення будуть зберігатися в спеціалізованому класі-репозиторії OrderRepository
5. Сконфігурувати Spring-додаток через application.yml
6.1 Додаток повинен бути доступний за URL: http://localhost:8080
6.2 Налаштувати
6.3 Налаштувати логування на рівні INFO для пакетів програми та для пакету org.springframework.web 
Процес логування включає виведення в консоль та запис у файл
7. Реалізувати OrderService який буде взаємодіяти з OrderRepository та реалізовувати операції: отримання по id, отримання всіх, додавання, видалення .
ВАЖЛИВО: ProductRepository та OrderRepository повертає дані з БД, для цього необхідно створити БД та відповідні таблиці

У процесі виконання створив необхідні класи, додав анотації

Додаток доступний за http://localhost:8080 якщо запустити DemoApplication.java
C:\Users\User303\.jdks\corretto-16.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=61594:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\osem\Projects\osemes.javapro.dz34\target\classes;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter-data-jpa\2.5.4\spring-boot-starter-data-jpa-2.5.4.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter-aop\2.5.4\spring-boot-starter-aop-2.5.4.jar;C:\Users\User303\.m2\repository\org\springframework\spring-aop\5.3.9\spring-aop-5.3.9.jar;C:\Users\User303\.m2\repository\org\aspectj\aspectjweaver\1.9.7\aspectjweaver-1.9.7.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter-jdbc\2.5.4\spring-boot-starter-jdbc-2.5.4.jar;C:\Users\User303\.m2\repository\com\zaxxer\HikariCP\4.0.3\HikariCP-4.0.3.jar;C:\Users\User303\.m2\repository\org\springframework\spring-jdbc\5.3.9\spring-jdbc-5.3.9.jar;C:\Users\User303\.m2\repository\jakarta\transaction\jakarta.transaction-api\1.3.3\jakarta.transaction-api-1.3.3.jar;C:\Users\User303\.m2\repository\jakarta\persistence\jakarta.persistence-api\2.2.3\jakarta.persistence-api-2.2.3.jar;C:\Users\User303\.m2\repository\org\hibernate\hibernate-core\5.4.32.Final\hibernate-core-5.4.32.Final.jar;C:\Users\User303\.m2\repository\org\jboss\logging\jboss-logging\3.4.2.Final\jboss-logging-3.4.2.Final.jar;C:\Users\User303\.m2\repository\org\javassist\javassist\3.27.0-GA\javassist-3.27.0-GA.jar;C:\Users\User303\.m2\repository\net\bytebuddy\byte-buddy\1.10.22\byte-buddy-1.10.22.jar;C:\Users\User303\.m2\repository\antlr\antlr\2.7.7\antlr-2.7.7.jar;C:\Users\User303\.m2\repository\org\jboss\jandex\2.2.3.Final\jandex-2.2.3.Final.jar;C:\Users\User303\.m2\repository\com\fasterxml\classmate\1.5.1\classmate-1.5.1.jar;C:\Users\User303\.m2\repository\org\dom4j\dom4j\2.1.3\dom4j-2.1.3.jar;C:\Users\User303\.m2\repository\org\hibernate\common\hibernate-commons-annotations\5.1.2.Final\hibernate-commons-annotations-5.1.2.Final.jar;C:\Users\User303\.m2\repository\org\glassfish\jaxb\jaxb-runtime\2.3.5\jaxb-runtime-2.3.5.jar;C:\Users\User303\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\2.3.3\jakarta.xml.bind-api-2.3.3.jar;C:\Users\User303\.m2\repository\org\glassfish\jaxb\txw2\2.3.5\txw2-2.3.5.jar;C:\Users\User303\.m2\repository\com\sun\istack\istack-commons-runtime\3.0.12\istack-commons-runtime-3.0.12.jar;C:\Users\User303\.m2\repository\com\sun\activation\jakarta.activation\1.2.2\jakarta.activation-1.2.2.jar;C:\Users\User303\.m2\repository\org\springframework\data\spring-data-jpa\2.5.4\spring-data-jpa-2.5.4.jar;C:\Users\User303\.m2\repository\org\springframework\data\spring-data-commons\2.5.4\spring-data-commons-2.5.4.jar;C:\Users\User303\.m2\repository\org\springframework\spring-orm\5.3.9\spring-orm-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\spring-context\5.3.9\spring-context-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\spring-tx\5.3.9\spring-tx-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\spring-beans\5.3.9\spring-beans-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\spring-aspects\5.3.9\spring-aspects-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter-web\2.5.4\spring-boot-starter-web-2.5.4.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter-json\2.5.4\spring-boot-starter-json-2.5.4.jar;C:\Users\User303\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.12.4\jackson-databind-2.12.4.jar;C:\Users\User303\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.12.4\jackson-annotations-2.12.4.jar;C:\Users\User303\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.12.4\jackson-core-2.12.4.jar;C:\Users\User303\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.12.4\jackson-datatype-jdk8-2.12.4.jar;C:\Users\User303\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.12.4\jackson-datatype-jsr310-2.12.4.jar;C:\Users\User303\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.12.4\jackson-module-parameter-names-2.12.4.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\2.5.4\spring-boot-starter-tomcat-2.5.4.jar;C:\Users\User303\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\9.0.52\tomcat-embed-core-9.0.52.jar;C:\Users\User303\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\9.0.52\tomcat-embed-el-9.0.52.jar;C:\Users\User303\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.52\tomcat-embed-websocket-9.0.52.jar;C:\Users\User303\.m2\repository\org\springframework\spring-web\5.3.9\spring-web-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\spring-webmvc\5.3.9\spring-webmvc-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\spring-expression\5.3.9\spring-expression-5.3.9.jar;C:\Users\User303\.m2\repository\mysql\mysql-connector-java\8.0.26\mysql-connector-java-8.0.26.jar;C:\Users\User303\.m2\repository\org\apache\logging\log4j\log4j-slf4j-impl\2.12.1\log4j-slf4j-impl-2.12.1.jar;C:\Users\User303\.m2\repository\org\slf4j\slf4j-api\1.7.32\slf4j-api-1.7.32.jar;C:\Users\User303\.m2\repository\org\apache\logging\log4j\log4j-api\2.14.1\log4j-api-2.14.1.jar;C:\Users\User303\.m2\repository\org\apache\logging\log4j\log4j-core\2.12.1\log4j-core-2.12.1.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter\2.5.4\spring-boot-starter-2.5.4.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot\2.5.4\spring-boot-2.5.4.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\2.5.4\spring-boot-autoconfigure-2.5.4.jar;C:\Users\User303\.m2\repository\jakarta\annotation\jakarta.annotation-api\1.3.5\jakarta.annotation-api-1.3.5.jar;C:\Users\User303\.m2\repository\org\springframework\spring-core\5.3.9\spring-core-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\spring-jcl\5.3.9\spring-jcl-5.3.9.jar;C:\Users\User303\.m2\repository\org\yaml\snakeyaml\1.28\snakeyaml-1.28.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter-log4j2\2.5.4\spring-boot-starter-log4j2-2.5.4.jar;C:\Users\User303\.m2\repository\org\apache\logging\log4j\log4j-jul\2.14.1\log4j-jul-2.14.1.jar;C:\Users\User303\.m2\repository\org\slf4j\jul-to-slf4j\1.7.32\jul-to-slf4j-1.7.32.jar com.example.demo.DemoApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.4)

17:48:12.308 [main] INFO  com.example.demo.DemoApplication - Starting DemoApplication using Java 16.0.2 on NW11-139 with PID 980 (C:\osem\Projects\osemes.javapro.dz34\target\classes started by User303 in C:\osem\Projects\osemes.javapro.dz34)
17:48:12.308 [main] INFO  com.example.demo.DemoApplication - Starting DemoApplication using Java 16.0.2 on NW11-139 with PID 980 (C:\osem\Projects\osemes.javapro.dz34\target\classes started by User303 in C:\osem\Projects\osemes.javapro.dz34)
17:48:12.318 [main] INFO  com.example.demo.DemoApplication - No active profile set, falling back to default profiles: default
17:48:12.318 [main] INFO  com.example.demo.DemoApplication - No active profile set, falling back to default profiles: default
17:48:12.842 [main] INFO  org.springframework.data.repository.config.RepositoryConfigurationDelegate - Bootstrapping Spring Data JPA repositories in DEFAULT mode.
17:48:12.893 [main] INFO  org.springframework.data.repository.config.RepositoryConfigurationDelegate - Finished Spring Data repository scanning in 41 ms. Found 2 JPA repository interfaces.
17:48:13.372 [main] INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer - Tomcat initialized with port(s): 8080 (http)
17:48:13.383 [main] INFO  org.apache.coyote.http11.Http11NioProtocol - Initializing ProtocolHandler ["http-nio-8080"]
17:48:13.384 [main] INFO  org.apache.catalina.core.StandardService - Starting service [Tomcat]
17:48:13.385 [main] INFO  org.apache.catalina.core.StandardEngine - Starting Servlet engine: [Apache Tomcat/9.0.52]
17:48:13.470 [main] INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/] - Initializing Spring embedded WebApplicationContext
17:48:13.471 [main] INFO  org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext - Root WebApplicationContext: initialization completed in 1116 ms
17:48:13.614 [main] INFO  org.hibernate.jpa.internal.util.LogHelper - HHH000204: Processing PersistenceUnitInfo [name: default]
17:48:13.652 [main] INFO  org.hibernate.Version - HHH000412: Hibernate ORM core version 5.4.32.Final
17:48:13.756 [main] INFO  org.hibernate.annotations.common.Version - HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
17:48:13.847 [main] INFO  com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Starting...
17:48:14.129 [main] INFO  com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Start completed.
17:48:14.140 [main] INFO  org.hibernate.dialect.Dialect - HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
17:48:14.653 [main] INFO  org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator - HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
17:48:14.659 [main] INFO  org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean - Initialized JPA EntityManagerFactory for persistence unit 'default'
17:48:14.918 [main] WARN  org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration$JpaWebConfiguration - spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
17:48:15.084 [main] INFO  org.springframework.boot.autoconfigure.web.servlet.WelcomePageHandlerMapping - Adding welcome page: class path resource [static/index.html]
17:48:15.215 [main] INFO  org.apache.coyote.http11.Http11NioProtocol - Starting ProtocolHandler ["http-nio-8080"]
17:48:15.232 [main] INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer - Tomcat started on port(s): 8080 (http) with context path ''
17:48:15.239 [main] INFO  com.example.demo.DemoApplication - Started DemoApplication in 3.258 seconds (JVM running for 3.967)
17:48:15.239 [main] INFO  com.example.demo.DemoApplication - Started DemoApplication in 3.258 seconds (JVM running for 3.967)

=======================================
Welcome to My App
This is the home page of my application.
=======================================

Також мені пришлося використати SLF4J + LOG4J, створив необхадні налаштування та перевірив створення та запис логування у файл,
для цього треба запустити LogExample.java

C:\Users\User303\.jdks\corretto-16.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\lib\idea_rt.jar=61613:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\osem\Projects\osemes.javapro.dz34\target\classes;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter-data-jpa\2.5.4\spring-boot-starter-data-jpa-2.5.4.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter-aop\2.5.4\spring-boot-starter-aop-2.5.4.jar;C:\Users\User303\.m2\repository\org\springframework\spring-aop\5.3.9\spring-aop-5.3.9.jar;C:\Users\User303\.m2\repository\org\aspectj\aspectjweaver\1.9.7\aspectjweaver-1.9.7.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter-jdbc\2.5.4\spring-boot-starter-jdbc-2.5.4.jar;C:\Users\User303\.m2\repository\com\zaxxer\HikariCP\4.0.3\HikariCP-4.0.3.jar;C:\Users\User303\.m2\repository\org\springframework\spring-jdbc\5.3.9\spring-jdbc-5.3.9.jar;C:\Users\User303\.m2\repository\jakarta\transaction\jakarta.transaction-api\1.3.3\jakarta.transaction-api-1.3.3.jar;C:\Users\User303\.m2\repository\jakarta\persistence\jakarta.persistence-api\2.2.3\jakarta.persistence-api-2.2.3.jar;C:\Users\User303\.m2\repository\org\hibernate\hibernate-core\5.4.32.Final\hibernate-core-5.4.32.Final.jar;C:\Users\User303\.m2\repository\org\jboss\logging\jboss-logging\3.4.2.Final\jboss-logging-3.4.2.Final.jar;C:\Users\User303\.m2\repository\org\javassist\javassist\3.27.0-GA\javassist-3.27.0-GA.jar;C:\Users\User303\.m2\repository\net\bytebuddy\byte-buddy\1.10.22\byte-buddy-1.10.22.jar;C:\Users\User303\.m2\repository\antlr\antlr\2.7.7\antlr-2.7.7.jar;C:\Users\User303\.m2\repository\org\jboss\jandex\2.2.3.Final\jandex-2.2.3.Final.jar;C:\Users\User303\.m2\repository\com\fasterxml\classmate\1.5.1\classmate-1.5.1.jar;C:\Users\User303\.m2\repository\org\dom4j\dom4j\2.1.3\dom4j-2.1.3.jar;C:\Users\User303\.m2\repository\org\hibernate\common\hibernate-commons-annotations\5.1.2.Final\hibernate-commons-annotations-5.1.2.Final.jar;C:\Users\User303\.m2\repository\org\glassfish\jaxb\jaxb-runtime\2.3.5\jaxb-runtime-2.3.5.jar;C:\Users\User303\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\2.3.3\jakarta.xml.bind-api-2.3.3.jar;C:\Users\User303\.m2\repository\org\glassfish\jaxb\txw2\2.3.5\txw2-2.3.5.jar;C:\Users\User303\.m2\repository\com\sun\istack\istack-commons-runtime\3.0.12\istack-commons-runtime-3.0.12.jar;C:\Users\User303\.m2\repository\com\sun\activation\jakarta.activation\1.2.2\jakarta.activation-1.2.2.jar;C:\Users\User303\.m2\repository\org\springframework\data\spring-data-jpa\2.5.4\spring-data-jpa-2.5.4.jar;C:\Users\User303\.m2\repository\org\springframework\data\spring-data-commons\2.5.4\spring-data-commons-2.5.4.jar;C:\Users\User303\.m2\repository\org\springframework\spring-orm\5.3.9\spring-orm-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\spring-context\5.3.9\spring-context-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\spring-tx\5.3.9\spring-tx-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\spring-beans\5.3.9\spring-beans-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\spring-aspects\5.3.9\spring-aspects-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter-web\2.5.4\spring-boot-starter-web-2.5.4.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter-json\2.5.4\spring-boot-starter-json-2.5.4.jar;C:\Users\User303\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.12.4\jackson-databind-2.12.4.jar;C:\Users\User303\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.12.4\jackson-annotations-2.12.4.jar;C:\Users\User303\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.12.4\jackson-core-2.12.4.jar;C:\Users\User303\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.12.4\jackson-datatype-jdk8-2.12.4.jar;C:\Users\User303\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.12.4\jackson-datatype-jsr310-2.12.4.jar;C:\Users\User303\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.12.4\jackson-module-parameter-names-2.12.4.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\2.5.4\spring-boot-starter-tomcat-2.5.4.jar;C:\Users\User303\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\9.0.52\tomcat-embed-core-9.0.52.jar;C:\Users\User303\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\9.0.52\tomcat-embed-el-9.0.52.jar;C:\Users\User303\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.52\tomcat-embed-websocket-9.0.52.jar;C:\Users\User303\.m2\repository\org\springframework\spring-web\5.3.9\spring-web-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\spring-webmvc\5.3.9\spring-webmvc-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\spring-expression\5.3.9\spring-expression-5.3.9.jar;C:\Users\User303\.m2\repository\mysql\mysql-connector-java\8.0.26\mysql-connector-java-8.0.26.jar;C:\Users\User303\.m2\repository\org\apache\logging\log4j\log4j-slf4j-impl\2.12.1\log4j-slf4j-impl-2.12.1.jar;C:\Users\User303\.m2\repository\org\slf4j\slf4j-api\1.7.32\slf4j-api-1.7.32.jar;C:\Users\User303\.m2\repository\org\apache\logging\log4j\log4j-api\2.14.1\log4j-api-2.14.1.jar;C:\Users\User303\.m2\repository\org\apache\logging\log4j\log4j-core\2.12.1\log4j-core-2.12.1.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter\2.5.4\spring-boot-starter-2.5.4.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot\2.5.4\spring-boot-2.5.4.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\2.5.4\spring-boot-autoconfigure-2.5.4.jar;C:\Users\User303\.m2\repository\jakarta\annotation\jakarta.annotation-api\1.3.5\jakarta.annotation-api-1.3.5.jar;C:\Users\User303\.m2\repository\org\springframework\spring-core\5.3.9\spring-core-5.3.9.jar;C:\Users\User303\.m2\repository\org\springframework\spring-jcl\5.3.9\spring-jcl-5.3.9.jar;C:\Users\User303\.m2\repository\org\yaml\snakeyaml\1.28\snakeyaml-1.28.jar;C:\Users\User303\.m2\repository\org\springframework\boot\spring-boot-starter-log4j2\2.5.4\spring-boot-starter-log4j2-2.5.4.jar;C:\Users\User303\.m2\repository\org\apache\logging\log4j\log4j-jul\2.14.1\log4j-jul-2.14.1.jar;C:\Users\User303\.m2\repository\org\slf4j\jul-to-slf4j\1.7.32\jul-to-slf4j-1.7.32.jar LogExample
17:51:22.912 [main] INFO  LogExample - Це логування інформації
17:51:22.916 [main] WARN  LogExample - Це логування попередження
17:51:22.916 [main] ERROR LogExample - Це логування помилки
17:51:22.918 [main] ERROR LogExample - Сталася помилка при обчисленні: / by zero

Файл application.log створюэться та наповнюэться:

16:42:12.474 [main] INFO  LogExample - Це логування інформації
16:42:12.478 [main] WARN  LogExample - Це логування попередження
16:42:12.478 [main] ERROR LogExample - Це логування помилки
16:42:12.480 [main] ERROR LogExample - Сталася помилка при обчисленні: / by zero
17:48:12.308 [main] INFO  com.example.demo.DemoApplication - Starting DemoApplication using Java 16.0.2 on NW11-139 with PID 980 (C:\osem\Projects\osemes.javapro.dz34\target\classes started by User303 in C:\osem\Projects\osemes.javapro.dz34)
17:48:12.308 [main] INFO  com.example.demo.DemoApplication - Starting DemoApplication using Java 16.0.2 on NW11-139 with PID 980 (C:\osem\Projects\osemes.javapro.dz34\target\classes started by User303 in C:\osem\Projects\osemes.javapro.dz34)
17:48:12.318 [main] INFO  com.example.demo.DemoApplication - No active profile set, falling back to default profiles: default
17:48:12.318 [main] INFO  com.example.demo.DemoApplication - No active profile set, falling back to default profiles: default
17:48:12.842 [main] INFO  org.springframework.data.repository.config.RepositoryConfigurationDelegate - Bootstrapping Spring Data JPA repositories in DEFAULT mode.
17:48:12.893 [main] INFO  org.springframework.data.repository.config.RepositoryConfigurationDelegate - Finished Spring Data repository scanning in 41 ms. Found 2 JPA repository interfaces.
17:48:13.372 [main] INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer - Tomcat initialized with port(s): 8080 (http)
17:48:13.383 [main] INFO  org.apache.coyote.http11.Http11NioProtocol - Initializing ProtocolHandler ["http-nio-8080"]
17:48:13.384 [main] INFO  org.apache.catalina.core.StandardService - Starting service [Tomcat]
17:48:13.385 [main] INFO  org.apache.catalina.core.StandardEngine - Starting Servlet engine: [Apache Tomcat/9.0.52]
17:48:13.470 [main] INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/] - Initializing Spring embedded WebApplicationContext
17:48:13.471 [main] INFO  org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext - Root WebApplicationContext: initialization completed in 1116 ms
17:48:13.614 [main] INFO  org.hibernate.jpa.internal.util.LogHelper - HHH000204: Processing PersistenceUnitInfo [name: default]
17:48:13.652 [main] INFO  org.hibernate.Version - HHH000412: Hibernate ORM core version 5.4.32.Final
17:48:13.756 [main] INFO  org.hibernate.annotations.common.Version - HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
17:48:13.847 [main] INFO  com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Starting...
17:48:14.129 [main] INFO  com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Start completed.
17:48:14.140 [main] INFO  org.hibernate.dialect.Dialect - HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
17:48:14.653 [main] INFO  org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator - HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
17:48:14.659 [main] INFO  org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean - Initialized JPA EntityManagerFactory for persistence unit 'default'
17:48:14.918 [main] WARN  org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration$JpaWebConfiguration - spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
17:48:15.084 [main] INFO  org.springframework.boot.autoconfigure.web.servlet.WelcomePageHandlerMapping - Adding welcome page: class path resource [static/index.html]
17:48:15.215 [main] INFO  org.apache.coyote.http11.Http11NioProtocol - Starting ProtocolHandler ["http-nio-8080"]
17:48:15.232 [main] INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer - Tomcat started on port(s): 8080 (http) with context path ''
17:48:15.239 [main] INFO  com.example.demo.DemoApplication - Started DemoApplication in 3.258 seconds (JVM running for 3.967)
17:48:15.239 [main] INFO  com.example.demo.DemoApplication - Started DemoApplication in 3.258 seconds (JVM running for 3.967)
17:51:22.912 [main] INFO  LogExample - Це логування інформації
17:51:22.916 [main] WARN  LogExample - Це логування попередження
17:51:22.916 [main] ERROR LogExample - Це логування помилки
17:51:22.918 [main] ERROR LogExample - Сталася помилка при обчисленні: / by zero









