

plugins {
    id("java")
   // id (io.franzbecker.gradle-lombok version '1.8)
}

group = "ru.mzpo"
version = "1.0-SNAPSHOT"
//sourceCompatibility = 11
//compileJava.options.encoding ("UTF-8")
//compileTestJava.options.encoding = 'UTF-8'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation ("com.codeborne:selenide:6.17.2")
    testImplementation ("commons-dbutils:commons-dbutils:1.7")
    testImplementation ("io.rest-assured:rest-assured:4.3.2")
    testImplementation ("com.github.javafaker:javafaker:1.0.2");
    testImplementation ("io.github.bonigarcia:webdrivermanager:5.4.1")
  //  compileOnly ("org.projectlombok", "lombok","1", "18", "20");
  //  annotationProcessor ("org.projectlombok", "lombok","1","18","20");
}

tasks.test {
    useJUnitPlatform()
}

tasks.test {
    useJUnitPlatform()
}