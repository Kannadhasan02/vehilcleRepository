package com.myapp.vehicle.entity;


	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	
	@Entity
	@Table(name="bike")
	public class Bike {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private int model;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		private String brand;
		private String colour;
		private int price;

		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getColour() {
			return colour;
		}
		public void setColour(String colour) {
			this.colour = colour;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getModel() {
			return model;
		}
		public void setModel(int model) {
			this.model = model;
		}

	}
		


