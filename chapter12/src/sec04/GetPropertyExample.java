package sec04;

import java.util.Properties;
import java.util.Set;

// 시슽메 프로퍼티 읽기
public class GetPropertyExample {
	public static void main(String[] args) {
		// 운영체제와 사용자 정보 출력
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		// 전체 키와 값을 출력
		System.out.println("-------------------------");
		System.out.println("key : value");
		System.out.println("-------------------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for (Object objKey : keys) {
			String key = (String)objKey;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n", key, value);
		}
	}
}

// 실행 결과
/*
Windows 10
LEEYONGMIN
C:\Users\LEEYONGMIN
-------------------------
key : value
-------------------------
sun.desktop                             : windows
awt.toolkit                             : sun.awt.windows.WToolkit
java.specification.version              : 11
sun.cpu.isalist                         : amd64
sun.jnu.encoding                        : MS949
java.class.path                         : C:\git\this_is_java_-revision\chapter12\bin;C:\git\this_is_java_-revision\chapter12\lib\lombok.jar
java.vm.vendor                          : Oracle Corporation
sun.arch.data.model                     : 64
user.variant                            : 
java.vendor.url                         : https://openjdk.java.net/
user.timezone                           : 
os.name                                 : Windows 10
java.vm.specification.version           : 11
sun.java.launcher                       : SUN_STANDARD
user.country                            : KR
sun.boot.library.path                   : C:\Program Files\Java\jdk-11.0.14\bin
sun.java.command                        : sec04.GetPropertyExample
jdk.debug                               : release
sun.cpu.endian                          : little
user.home                               : C:\Users\LEEYONGMIN
user.language                           : ko
java.specification.vendor               : Oracle Corporation
java.version.date                       : 2022-01-18
java.home                               : C:\Program Files\Java\jdk-11.0.14
file.separator                          : \
java.vm.compressedOopsMode              : Zero based
line.separator                          : 

java.specification.name                 : Java Platform API Specification
java.vm.specification.vendor            : Oracle Corporation
java.awt.graphicsenv                    : sun.awt.Win32GraphicsEnvironment
user.script                             : 
sun.management.compiler                 : HotSpot 64-Bit Tiered Compilers
java.runtime.version                    : 11.0.14+8-LTS-263
user.name                               : LEEYONGMIN
path.separator                          : ;
os.version                              : 10.0
java.runtime.name                       : Java(TM) SE Runtime Environment
file.encoding                           : UTF-8
java.vm.name                            : Java HotSpot(TM) 64-Bit Server VM
java.vendor.version                     : 18.9
java.vendor.url.bug                     : https://bugreport.java.com/bugreport/
java.io.tmpdir                          : C:\Users\LEEYON~1\AppData\Local\Temp\
java.version                            : 11.0.14
user.dir                                : C:\git\this_is_java_-revision\chapter12
os.arch                                 : amd64
java.vm.specification.name              : Java Virtual Machine Specification
java.awt.printerjob                     : sun.awt.windows.WPrinterJob
sun.os.patch.level                      : 
java.library.path                       : C:\Program Files\Java\jdk-11.0.14\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:/Program Files/Java/jdk-11.0.14/bin/server;C:/Program Files/Java/jdk-11.0.14/bin;C:\apache-maven-3.9.1\bin;C:\Python311\Scripts\;C:\Python311\;C:\Program Files (x86)\VMware\VMware Workstation\bin\;C:\app\product\18.0.0\dbhomeXE\bin;C:\Program Files\Java\jdk-11.0.14\bin;C:\spring\apache-maven-3.9.1\bin;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Intel\Shared Libraries\redist\intel64\compiler;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Program Files\Git\cmd;C:\Program Files\Bandizip\;C:\Program Files\dotnet\;C:\Program Files\Docker\Docker\resources\bin;C:\Program Files\nodejs\;C:\ProgramData\chocolatey\bin;C:\php;C:\xampp\mysql\bin\;C:\apache-maven-3.9.1\bin;C:\Program Files\MySQL\MySQL Server 8.0\bin;C:\Program Files (x86)\VMware\VMware Workstation\bin\;C:\app\product\18.0.0\dbhomeXE\bin;C:\Program Files\Java\jdk-11.0.14\bin;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Intel\Shared Libraries\redist\intel64\compiler;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Program Files\Git\cmd;C:\Program Files\Bandizip\;C:\Program Files\dotnet\;C:\Users\LEEYONGMIN\AppData\Local\Microsoft\WindowsApps;C:\Users\LEEYONGMIN\AppData\Local\Programs\Microsoft VS Code\bin;C:\Windows\Resource;C:\Users\LEEYONGMIN\AppData\Roaming\npm;C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.1\bin;;;C:\Windows\system32;;.
java.vendor                             : Oracle Corporation
java.vm.info                            : mixed mode
java.vm.version                         : 11.0.14+8-LTS-263
sun.io.unicode.encoding                 : UnicodeLittle
java.class.version                      : 55.0
*/
