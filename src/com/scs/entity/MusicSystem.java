package com.scs.entity;

import java.util.Arrays;
import java.util.Set;

public class MusicSystem {
		private int msno;
		private String brand;
		private double cost;
		private String mfg[];   //simple
		
		private Set color;
		
		public int getMsno() {
			return msno;
		}
		public void setMsno(int msno) {
			this.msno = msno;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}
		
		
	
		
		public String[] getMfg() {
			return mfg;
		}
		public void setMfg(String[] mfg) {
			this.mfg = mfg;
		}
		
		public Set getColor() {
			return color;
		}
		public void setColor(Set color) {
			this.color = color;
		}
		@Override
		public String toString() {
			return "MusicSystem [msno=" + msno + ", brand=" + brand + ", cost=" + cost + ", mfg=" + Arrays.toString(mfg)
					+ ", color=" + color + "]";
		}
		
		
		
		
		
		
}
