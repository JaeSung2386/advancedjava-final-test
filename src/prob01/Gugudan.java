package prob01;
import java.util.Scanner;


public class Gugudan {
	
	static int resultNumber = 0;
	
	public static void main( String[] args ) {
		//1~9 랜덤값 return
		int l = randomize( 1, 9 );
		int r = randomize( 1, 9 );
		
		//정답
		resultNumber = l * r;
		
		//정답을 랜덤하게 생성
		int[] answerNumbers = randomizeAnswers();
		//정답 위치 셋팅
		int loc = randomize( 0, 8 );
		answerNumbers[ loc ] = resultNumber;
		
		System.out.println( l + " x " + r + " = ?" );
		
		int length = answerNumbers.length;
		for( int i = 0; i < length; i++ ) {
			if( i % 3 == 0 ) {
				System.out.print( "\n" );
			} else {
				System.out.print( "\t" );
			}
			
			System.out.print( answerNumbers[ i ] );
		}

		System.out.print( "\n\n" );
		System.out.print( "answer:" );

		Scanner s = new Scanner( System.in );
		if(s.nextInt() == resultNumber) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
	}

	private static int randomize( int lNum, int rNum ) {
        int random = (int) ( Math.random() * rNum ) + lNum;
        return random;
	}
	
	private static int[] randomizeAnswers() {
		//정답 개수
		final int COUNT_ANSWER_NUMBER = 9;
		//정답 최대값
		final int MAX_ANSWER_NUMBER = 81;
		
		//정답 개수만큼 배열 생성
		int[] boardNumbers = new int[ COUNT_ANSWER_NUMBER ];
		int occupied = 0;
		
		while( occupied < COUNT_ANSWER_NUMBER ) {
			//랜덤값 생성
	        int random = ( int )( Math.random() * MAX_ANSWER_NUMBER ) + 1;
	        
	        //랜덤값이 정답과 일치한 숫자가 있는지 판별
	        boolean evaluted = false;
	        for( int i = 0; i < occupied; i++ ) {
	        	if(boardNumbers[i] == random || boardNumbers[i] == resultNumber) {
	        		evaluted = true;
	        		break;
	        	}
	        	
	        }
	        
	        if( !evaluted ) {
	        	boardNumbers[ occupied++ ] = random;
	        }
		}
		
        return boardNumbers;
	}	
}
