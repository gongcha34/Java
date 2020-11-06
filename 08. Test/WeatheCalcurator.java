
public class WeatheCalcurator {

	public static void main(String[] args) {
		// 계절별 날씨 평균
		int [] aveTemp = {-4, -1, 4, 11, 17, 21, 24, 25, 20, 13, 6, -1};
		int sum = 0;
		
	    for (int cal : aveTemp) {
	    	sum += cal;
		}
		
		System.out.println("날씨 평균 : " + (sum / aveTemp.length));
		
		/*
		 N월 : N 기온
		for(int element : aveTemp)
			System.out.println(element);
		for(int i = 0; i < aveTemp.length; ++i)
			System.out.println((i+1) + "월 : " + aveTemp[i]);
  		
  		1월 : -4
		2월 : -1
		3월 : 4
		4월 : 11
		5월 : 17
		6월 : 21
		7월 : 24
		8월 : 25
		9월 : 20
		10월 : 13
		11월 : 6
		12월 : -1

		*/
	}

}
