package ch14;

public class SubWay {
	int subwayNumber;
	int passengerCount;
	int money;
	
	public SubWay(int subwayNumber){
		this.subwayNumber=subwayNumber;
	}
	
	public void take(int money) { //지하철 탄 것, 이것이 바로 협력..
		this.money+=money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNumber+"번의 승객 수는 "+passengerCount+"명이고, 수입은 "+money+"원입니다.");
	}
}
