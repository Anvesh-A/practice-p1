package com.proj;


	class MyException1 extends Exception{
		   /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String str1;
		   MyException1(String str2) {
			str1=str2;
		   }
		   public String toString(){ 
			return ("MyException1 Occurred: "+str1) ;
		   }
		}
		class ExceptionHand{
		   public static void main(String args[]){
			try{
				System.out.println("Starting of try block");
				// I'm throwing the custom exception using throw
				throw new MyException1("This is My error Message");
			}
			catch(MyException1 exp){
				System.out.println("Catch Block") ;
				System.out.println(exp) ;
			}
		   }
		}



