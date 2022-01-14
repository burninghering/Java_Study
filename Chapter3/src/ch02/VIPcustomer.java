package ch02;

public class VIPcustomer extends Customer {

		double salesRatio;
		String agentID;

		public VIPcustomer() {
			bonusRatio=0.05;
			salesRatio=0.1;
			customerGrade="VIP"; //오류 발생하지만, Customer 클래스에서 protected로 바꿈 
		}
		
		public String getAgentID() {
			return agentID;
		}

		public void setAgentID(String agentID) {
			this.agentID = agentID;
		}
}
