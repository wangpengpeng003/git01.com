package tedu.cn.colorball;

import java.util.Random;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Colorball {

	public static void main(String[] args) {
		Colorball sColorball=new Colorball();
		sColorball.a();
	    }
	public String a() {
		String string="111";
		boolean b=string.equals("1222");
		System.out.println(b);
		if (b) {
			System.out.println("b=="+b);
			return "1";
		}
		return "2";
	}
}
