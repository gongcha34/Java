
public class Driver {
	// 필드 생성
		private String name;
		private int Id;
		private String adress;
		private String tel;
		
		
		// 생성자
		public Driver() {};
		
		public Driver(String name, int Id, String adress, String tel) {
			this.name = name;
			this.Id = Id;
			this.adress = adress;
			this.tel = tel;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return Id;
		}

		public void setId(int Id) {
			this.Id = Id;
		}

		public String getAdress() {
			return adress;
		}

		public void setAdress(String adress) {
			this.adress = adress;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		//메소드
		public void show() {
			System.out.println("----------------------");
			System.out.println("운전자 이름 : " + name);
			System.out.println("운전자 번호 : " + Id);
			System.out.println("운전자 주소 : " + adress);
			System.out.println("운전자 전화번호 : " + tel);
		}
}
