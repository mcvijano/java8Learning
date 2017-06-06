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
		
		
		
		ImmutableToto t = new Toto("pepe","koko");
		ImmutableToto t1 = new TotoData("t1","koko");
		ImmutableToto t2 = new TotoData("t2","koko2");
		ImmutableToto t3 = new TotoData("t3","koko9");
		ImmutableToto t4 = new TotoData("t4","koko8");
		ImmutableToto t5 = new TotoData("t5","koko7");
		ImmutableToto t6 = new TotoData("t6","koko6");
		ImmutableToto t7 = new TotoData("t7","koko7");
		
		
		//test1(t, t2);
		
		test2(t, t2, t3, t4, t5, t6);
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

	private static void test2(ImmutableToto t, ImmutableToto t2, ImmutableToto t3, ImmutableToto t4, ImmutableToto t5, ImmutableToto t6) {
		List<ImmutableToto> un = new ArrayList<ImmutableToto>();
		List<ImmutableToto> du = new ArrayList<ImmutableToto>();
		un.add(t); un.add(t2); un.add(t3); un.add(t4); un.add(t5);
		du.add(t);du.add(t2);du.add(t3);du.add(t6);
		
		//find removed
		List<ImmutableToto> co = new ArrayList<ImmutableToto>();
		co.addAll(un);
		System.out.println(co.size());
		//Collections.addAll(co, t6);
		//co.addAll(un);
		System.out.println("CO --------------");
		co.stream().forEach(e-> System.out.println(e));
		System.out.println(co.size());
		((TotoData)un.get(0)).setDva("Beep");
		System.out.println("COPY");
		Collections.copy(co, un);;
//		un.get(0).setDva("Beep1111");
		un.stream().forEach(e-> System.out.println(e));
		System.out.println("CO --------------");
		co.stream().forEach(e-> System.out.println(e));
//		System.out.println("un -----------vvv---");
//		co.get(0).setDva("Beep222");
//		un.stream().forEach(e-> System.out.println(e));
//		co.stream().forEach(e-> System.out.println(e));
//		
//		System.out.println("remcopy --------------");
//		co.removeAll(du);
//		co.stream().forEach(e-> System.out.println(e));
//		System.out.println("rem removed--------------");
//		un.stream().forEach(e-> System.out.println(e));
//		
//		//find added
//		System.out.println("Added--------------");
//				du.stream().forEach(e-> System.out.println(e));
//				System.out.println("un --------------");
//				List rem = new ArrayList<ImmutableToto>(du);
//				rem.stream().forEach(e-> System.out.println(e));
//				System.out.println("remcopy --------------");
//				rem.removeAll(un);
//				rem.stream().forEach(e-> System.out.println(e));
//				System.out.println("rem added--------------");
//				du.stream().forEach(e-> System.out.println(e));
//				System.out.println("Added ???--------------");		
//				un.stream().forEach(e-> System.out.println(e));
//				System.out.println("un --------------");
//				rem = new ArrayList<ImmutableToto>(un);
//				rem.stream().forEach(e-> System.out.println(e));
//				System.out.println("remcopy --------------");
//				rem.retainAll(du);
//				rem.stream().forEach(e-> System.out.println(e));
//				System.out.println("rem removed--------------");
//				un.stream().forEach(e-> System.out.println(e));
	}

	private static void test1(ImmutableToto t, ImmutableToto t2) {
		List<ImmutableToto> un = new ArrayList<ImmutableToto>();
		List<ImmutableToto> du = new ArrayList<ImmutableToto>();
		un.add(t); un.add(t2);
		du= un.stream().collect(Collectors.toList());
//		un.get(0).setDva("Beep");
		System.out.println("du --------------");
		du.stream().forEach(e-> System.out.println(e));
		System.out.println("un --------------");
		un.stream().forEach(e-> System.out.println(e));
		du.stream().forEach(e-> System.out.println(e));
		
		du = un.stream().peek(e-> System.out.println(e)).map(e-> new TotoData(e)).collect(Collectors.toList());
		//du.stream().peek(e-> System.out.println(e)).forEach(e-> new ImmutableToto(e.getJen(),e.getDva()+"ttx"));
//		un.get(0).setDva("Beep");
		System.out.println("du --------------");
		du.stream().forEach(e-> System.out.println(e));
		System.out.println("un --------------");
		un.stream().forEach(e-> System.out.println(e));
	}

}
