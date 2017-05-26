package java8Learning.xx;

import java.util.function.Consumer;

public class LambdaScopeTest {
	

	 interface Funec<Integer>{
     	Integer roso(Integer a,Integer b);
     };
     
     interface Printer{
    	 void print(String x, String y);
     }
     
    private int x = 0;

    class FirstLevel {

        public int x = 1;
        Funec<Integer> mf = (Integer z, Integer y) ->  (z + y);
       

        void methodInFirstLevel(int x) {
            
            // The following statement causes the compiler to generate
            // the error "local variables referenced from a lambda expression
            // must be final or effectively final" in statement A:
            //
            // x = 99;
            
            Consumer<Integer> myConsumer = (y) -> 
            {
                System.out.println("x = " + x); // Statement A
                System.out.println("y = " + y);
                System.out.println("this.x = " + this.x);
                System.out.println("LambdaScopeTest.this.x = " +
                    LambdaScopeTest.this.x);
            };
            
            myConsumer.accept(x+this.x);
           

        }
        void methodDva(int x){
        	
             Integer toto = mf.roso(x, this.x);
             System.out.println("mf.roso.this.x = " +toto);
        }
        void methodTri(Funec<Integer> f,Integer z, Integer w){
        	 System.out.println("methodTri.this.x = " + f.roso(z, w));
        }
        
        void print(String a, String b){
        	System.out.println("print.this.x = " +a + b);
        }
        
        void doIt(String a, String b, Printer p){
        	p.print(a, b);
        }
    }

    public static void main(String... args) {
        LambdaScopeTest st = new LambdaScopeTest();
        LambdaScopeTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
        fl.methodDva(123);
        fl.methodTri((x,y) -> x * y,100,23);
        fl.doIt("my my" ,"Hey het", fl::print);
    }
}