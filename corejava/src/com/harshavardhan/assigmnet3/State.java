package com.harshavardhan.assigmnet3;

public class State extends Country {
	
		private String stateName;
		private String stateLanguage;
		private float stateSize;
		private int noOfDistricts;
		public State(){
		super();
		}
		public State(String continentName, double size, int nofcountry, String capital, int noofstates,
				String nationalang,String stateName,String stateLanguage,float stateSize, int noOfDistricts) {
			super(continentName, size, nofcountry, capital, noofstates, nationalang);
			// TODO Auto-generated constructor stub
		}
		 		
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
		public String getStateLanguage() {
			return stateLanguage;
		}
		public void setStateLanguage(String stateLanguage) {
			this.stateLanguage = stateLanguage;
		}
		public float getStateSize() {
			return stateSize;
		}
		public void setStateSize(float stateSize) {
			this.stateSize = stateSize;
		}
		public int getNoOfDistricts() {
			return noOfDistricts;
		}
		public void setNoOfDistricts(int noOfDistricts) {
			this.noOfDistricts = noOfDistricts;
		}
		@Override
		public String toString() {
			return "State [stateName=" + stateName + ", stateLanguage=" + stateLanguage + ", stateSize=" + stateSize
					+ ", noOfDistricts=" + noOfDistricts + ", getStateName()=" + getStateName()
					+ ", getStateLanguage()=" + getStateLanguage() + ", getStateSize()=" + getStateSize()
					+ ", getNoOfDistricts()=" + getNoOfDistricts() + ", getCapital()=" + getCapital()
					+ ", getNoofstates()=" + getNoofstates() + ", getNationalang()=" + getNationalang()
					+ ", getContinentName()=" + getContinentName() + ", getSize()=" + getSize() + ", getNofcountry()="
					+ getNofcountry() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + "]";
		}
		
}
