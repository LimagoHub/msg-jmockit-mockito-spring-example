# msg-jmockit-mockito-spring-example

um die Tests laufen zu lassen, muss der jvm der Parameter "-javaagent:${basedir}\lib\jmockit-1.49.jar" mitgegeben werden. Dies kann auf zwei Arten geschehen

1. "mvn test" ausführen. Ich habe ein Surfire-PlugIn mit dem notwendigen Parameter in die pom.xml eingebaut
2. Unter Intellij habe ich unter "Run/Debug Configuration" die Parameter -ea -javaagent:lib\jmockit-1.49.jar eingetragen als VM-Parameter. (Unter Eclipse analog)

Am besten beides einstellen. Dann läuft der Test wie gewohnt aus der IDE heraus und auch beim bauen mit Maven.
