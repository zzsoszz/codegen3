# codegen3
codegen3
http://stackoverflow.com/questions/31680816/prevent-spring-boot-from-registering-one-of-spring-security-filter


http://docs.spring.io/spring/docs/4.1.1.RELEASE/spring-framework-reference/html/mvc.html#mvc-container-config

http://stackoverflow.com/questions/24364436/adding-a-custom-filter-to-be-invoked-after-spring-security-filter-in-a-servlet-3

http://stackoverflow.com/questions/19825946/how-to-add-a-filter-class-in-spring-boot	





  	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-starter-parent</artifactId>
				<version>Angel.SR3</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>
	
	<build>
		<plugins>
			<!-- 
				http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#getting-started
				http://docs.spring.io/autorepo/docs/spring-boot/1.2.5.RELEASE/maven-plugin/usage.html
				mvn package
				mvn spring-boot:run
			 -->
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
			        <mainClass>com.bxtel.HellobootApplication</mainClass>
			        <layout>ZIP</layout>
			    </configuration>
				<executions>
                    <execution>
                        <goals>
                            <goal>repackage</goal>
                        </goals>
                    </execution>
                </executions>
			</plugin>
		</plugins>
	</build>
	
	<!-- 
	Maven简介（六）——Dependency
	http://haohaoxuexi.iteye.com/blog/2057317
		写了个输出批量安装jar文件到本地maven repository的小程序
	http://my.oschina.net/webas/blog/108427
	http://stackoverflow.com/questions/10935135/maven-and-adding-jars-to-system-scope
	<plugin><artifactId>maven-war-plugin</artifactId>
                <version>2.4</version>      <configuration>
                    <warSourceDirectory>mywebRoot</warSourceDirectory>
                    <warSourceExcludes>source\**,build\**,dist\**,WEB-INF\lib\*,
                        WEB-INF\classes\**,build.*
                    </warSourceExcludes>
                    <webXml>myproject/source/deploiement/web.xml</webXml>
                    <webResources>
                        <resource>
                            <directory>mywebRoot/WEB-INF/lib</directory>
                            <targetPath>WEB-INF/lib</targetPath>
                            <includes>
                                    <include>mySystemJar1.jar.jar</include>
                                     <include>mySystemJar2.jar</include>
                               </includes>
                        </resource>
                    </webResources>
                </configuration>
            </plugin>
             -->
             
             