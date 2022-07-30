package com.apidemo2;

import java.util.List;

public class Employee {
	
		private int page;
		private int per_page;
		private int total;
		private int total_pages;
		private List<Data> data;
		private Support support;
		

		public Employee(int page, int per_page, int total, int total_pages, List<Data> data, Support support) {
			super();
			this.page = page;
			this.per_page = per_page;
			this.total = total;
			this.total_pages = total_pages;
			this.data = data;
			this.support = support;
		}

		public Support getSupport() {
			return support;
		}

		public int getPage() {
			return page;
		}

		public int getPer_page() {
			return per_page;
		}

		public int getTotal() {
			return total;
		}

		public int getTotal_pages() {
			return total_pages;
		}

		public List<Data> getData() {
			return data;
		}
		
		
	

}
