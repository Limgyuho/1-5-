// 1부터 5까지의 합을 더한 결과를 출력해주세요.

class Main {
  public static void main(String[] args) {
    
	  int sum =0;
	  //오직 정수 만이 들어갈수 있는 sum이라는 공간에 0을 넣겠다
	  
	  for(int i=1; i<=5; i++) {
		  //i라는 정수에 1을 넣고 5까지 1씩 박복한다
		  sum+=i;
		  //sum이라는 변수에 i 만큼 증가 시킨다
	  }
	  System.out.printf("%d",sum);
	  //반복문을 빠져 나왔을때 최종합니 나오게 표시해준다
  }
}