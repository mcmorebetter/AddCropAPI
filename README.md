## AddCropAPI

### 🏷️ 최신 버전 확인하기
AddCropAPI 최신버전을 확인한 후, VERSION부분에 최신버전을 적어주세요.  
![Image](https://github.com/user-attachments/assets/252e7223-dcc4-432a-9e8b-50f2130fafff)

### 📌 Project Setup
📄 **Maven POM**
```xml
<repository>
  <id>morebetter-releases</id>
  <name>More&amp;Better</name>
  <url>https://repo.morebetter.co.kr/releases</url>
</repository>
<dependency>
  <groupId>com.github.teamhungry22</groupId>
  <artifactId>addcrop</artifactId>
  <version>VERSION</version>
  <scope>provided</scope>
</dependency>
```
📄 **Gradle Groovy**
```gradle
repositories {
  maven {
    name "morebetterReleases"
    url "https://repo.morebetter.co.kr/releases"
  }
}

dependencies {
  compileOnly "com.github.teamhungry22:addcrop:VERSION"
}
```
📄 **Kotlin DSL**
```gradle
repositories {
  maven {
    name = "morebetterReleases"
    url = uri("https://repo.morebetter.co.kr/releases")
  }
}

dependencies {
  compileOnly("com.github.teamhungry22:addcrop:VERSION")
}
```
