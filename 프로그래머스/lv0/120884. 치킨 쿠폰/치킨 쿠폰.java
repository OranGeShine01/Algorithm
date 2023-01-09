class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int service = 0;
        // coupon은 chicken으로 그대로 쓴다.
        
        // 재귀를 반복문으로 구현, 서비스 치킨이 남지 않았으면서,
        //잔여쿠폰도 10장 미달이 되면 종료.
        while (!(service==0 && chicken<10)) {
        	if (service==0) {
        		//서비스가 0인 경우 쿠폰을 서비스로 반환
        		service = chicken/10;
        		chicken %= 10;        		
        		answer += service;
        	} else {
        		//서비스 치킨을 쿠폰으로 교환
        		chicken += service;
        		service = 0;
        	}        	
        }
        return answer;
    }
}
