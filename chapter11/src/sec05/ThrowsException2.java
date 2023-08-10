package sec05;

public class ThrowsException2 {
	public static void main(String[] args) throws Exception {
		findClass();
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}

// 실행 결과
/*
Exception in thread "main" java.lang.ClassNotFoundException: java.lang.String2
at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:581)
at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
at java.base/java.lang.Class.forName0(Native Method)
at java.base/java.lang.Class.forName(Class.java:315)
at sec05.ThrowsException2.findClass(ThrowsException2.java:9)
at sec05.ThrowsException2.main(ThrowsException2.java:5)
*/
