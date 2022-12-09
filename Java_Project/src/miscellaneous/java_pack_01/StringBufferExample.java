package miscellaneous.java_pack_01;
public class StringBufferExample {
	
	public static void main(String[] args) {
		
		String str = "Kiran Bendigeri";
		
		StringBuffer obj = new StringBuffer(str);
		obj.append('f');
		System.out.println(obj);
		System.out.println(obj.capacity());
		obj.append("Hellooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
		System.out.println(obj);
		System.out.println(obj.capacity());
		
	}

}
