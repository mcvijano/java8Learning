package java8Learning.xx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Collectors;

public class Lrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//idAndSwitch();
		
		int[] arIntOne = new int[1];
		int ln = arIntOne.length;
		System.out.println(ln);
		arIntOne[0] = 3;
		System.out.println(arIntOne[0]);
		arIntOne[1] = 3;
		
		Toto t = new Toto("pepe","koko");
		Toto t1 = new Toto("t1","koko");
		Toto t2 = new Toto("t2","koko2");
		Toto t3 = new Toto("t3","koko9");
		Toto t4 = new Toto("t4","koko8");
		Toto t5 = new Toto("t5","koko7");
		Toto t6 = new Toto("t6","koko6");
		Toto t7 = new Toto("t7","koko7");
		Toto t8 = new Toto("t8","koko8");
		
		//test1(t, t2);
		
		//test2(t, t2, t3, t4, t5, t6);
	}

	private static void idAndSwitch() {
		char ch = 55;
		
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.print("input x:");
		x =sc.nextInt();
		System.out.print("input y:");
		y = sc.nextInt();
		boolean bx = true;
		boolean cx = true;
		if( ((--y) == 2) && (++x == 2)) System.out.println(x);
		System.out.println(x + " " + y);
		
		//not giving expected results
		if( ((y--) == 2) && (x++ == 2)) System.out.println(x);
		System.out.println(x + " " + y);
		int val =1;
		switch(val){
		case 1: {System.out.println(val++);}
		case 2: System.out.println(val++);
		case 3: System.out.println(val++);
				break;
		case 4: System.out.println(val);
		default:
			System.out.println(val);
		}
	}

	private static void test2(Toto t, Toto t2, Toto t3, Toto t4, Toto t5, Toto t6) {
		List<Toto> un = new ArrayList<Toto>();
		List<Toto> du = new ArrayList<Toto>();
		un.add(t); un.add(t2); un.add(t3); un.add(t4); un.add(t5);
		du.add(t);du.add(t2);du.add(t3);du.add(t6);
		
		//find removed
		List<Toto> co =new ArrayList<Toto>(un);
		System.out.println(co.size());
		Collections.addAll(co, t6);
		//co.addAll(un);
		System.out.println("un --------------");
		co.stream().forEach(e-> System.out.println(e));
		System.out.println(co.size());
		un.get(0).setDva("Beep");
		Collections.copy(co, un);;
		un.get(0).setDva("Beep1111");
		un.stream().forEach(e-> System.out.println(e));
		co.stream().forEach(e-> System.out.println(e));
		System.out.println("un -----------vvv---");
		un.get(0).setDva("Beep222");
		un.stream().forEach(e-> System.out.println(e));
		co.stream().forEach(e-> System.out.println(e));
		
		System.out.println("remcopy --------------");
		co.removeAll(du);
		co.stream().forEach(e-> System.out.println(e));
		System.out.println("rem removed--------------");
		un.stream().forEach(e-> System.out.println(e));
		
		//find added
		System.out.println("Added--------------");
				du.stream().forEach(e-> System.out.println(e));
				System.out.println("un --------------");
				List rem = new ArrayList<Toto>(du);
				rem.stream().forEach(e-> System.out.println(e));
				System.out.println("remcopy --------------");
				rem.removeAll(un);
				rem.stream().forEach(e-> System.out.println(e));
				System.out.println("rem added--------------");
				du.stream().forEach(e-> System.out.println(e));
				System.out.println("Added ???--------------");		
				un.stream().forEach(e-> System.out.println(e));
				System.out.println("un --------------");
				rem = new ArrayList<Toto>(un);
				rem.stream().forEach(e-> System.out.println(e));
				System.out.println("remcopy --------------");
				rem.retainAll(du);
				rem.stream().forEach(e-> System.out.println(e));
				System.out.println("rem removed--------------");
				un.stream().forEach(e-> System.out.println(e));
	}

	private static void test1(Toto t, Toto t2) {
		List<Toto> un = new ArrayList<Toto>();
		List<Toto> du = new ArrayList<Toto>();
		un.add(t); un.add(t2);
		du= un.stream().collect(Collectors.toList());
		un.get(0).setDva("Beep");
		System.out.println("du --------------");
		du.stream().forEach(e-> System.out.println(e));
		System.out.println("un --------------");
		un.stream().forEach(e-> System.out.println(e));
		du.stream().forEach(e-> System.out.println(e));
		
		du = un.stream().peek(e-> System.out.println(e)).map(e-> new Toto(e)).collect(Collectors.toList());
		//du.stream().peek(e-> System.out.println(e)).forEach(e-> new Toto(e.getJen(),e.getDva()+"ttx"));
		un.get(0).setDva("Beep");
		System.out.println("du --------------");
		du.stream().forEach(e-> System.out.println(e));
		System.out.println("un --------------");
		un.stream().forEach(e-> System.out.println(e));
	}

}
