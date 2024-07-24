package com.excelr1;

public class Mobile {

	
		private int mobile_no;
		private String model_name;
		private String  company_name;
		private String  os_name;
		private String  ram_size;
		private String  rom_size;
		private String  processor_name;
		private double price;
		private int imeiNo;
		Mobile(int mobile_no, String model_name, String company_name, String os_name, String ram_size, String rom_size,
				String processor_name, double price, int imeiNo) {
			super();
			this.mobile_no = mobile_no;
			this.model_name = model_name;
			this.company_name = company_name;
			this.os_name = os_name;
			this.ram_size = ram_size;
			this.rom_size = rom_size;
			this.processor_name = processor_name;
			this.price = price;
			this.imeiNo = imeiNo;
		}
		Mobile() {
			super();
		}
		public int getMobile_no() {
			return mobile_no;
		}
		public void setMobile_no(int mobile_no) {
			this.mobile_no = mobile_no;
		}
		public String getModel_name() {
			return model_name;
		}
		public void setModel_name(String model_name) {
			this.model_name = model_name;
		}
		public String getCompany_name() {
			return company_name;
		}
		public void setCompany_name(String company_name) {
			this.company_name = company_name;
		}
		public String getOs_name() {
			return os_name;
		}
		public void setOs_name(String os_name) {
			this.os_name = os_name;
		}
		public String getRam_size() {
			return ram_size;
		}
		public void setRam_size(String ram_size) {
			this.ram_size = ram_size;
		}
		public String getRom_size() {
			return rom_size;
		}
		public void setRom_size(String rom_size) {
			this.rom_size = rom_size;
		}
		public String getProcessor_name() {
			return processor_name;
		}
		public void setProcessor_name(String processor_name) {
			this.processor_name = processor_name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getImeiNo() {
			return imeiNo;
		}
		public void setImeiNo(int imeiNo) {
			this.imeiNo = imeiNo;
		}
		@Override
		public String toString() {
			return "Mobile [mobile_no=" + mobile_no + ", model_name=" + model_name + ", company_name=" + company_name
					+ ", os_name=" + os_name + ", ram_size=" + ram_size + ", rom_size=" + rom_size + ", processor_name="
					+ processor_name + ", price=" + price + ", imeiNo=" + imeiNo + "]";
		}
		
}