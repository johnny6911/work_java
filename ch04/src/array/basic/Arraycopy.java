package array.basic;

public class Arraycopy {
	public static void main(String[] args) {
		int[]	copyFrom = {1,2,3,4,5,6,7,};
		int[]	copyTo = {10, 20, 30 , 40, 50, 60, 70, 80,};
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//배열의 4번째(5)부터 쓸거라는 얘기
		System.arraycopy(copyFrom, 4, copyTo, 1, 3);
		
		for (int i = 0; i < copyFrom.length; i++)
			System.out.print(copyFrom[i] + " ");
		System.out.println();
		
		// for-each 문
		for (int value : copyTo)
			System.out.print(value + " ");
	}
}
