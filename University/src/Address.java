public class Address {
	/*-	в Группе исправить тип одного ученика на массив учеников
-	убрать метод изменения ученика
-	добавить методы удаления ученика из группы и добавления в группу
// размерность массива учеников в группе задается через конструктор
-	выделить общие поля у Teacher и Student в общую сущность (People) и сделать её родителем для Teacher и Student
*/
	private String city;
	private String street;
	private int house;
	private int flat;
	
	Address(String city, String street, int house, int flat) {
		this.city = city;
		this.street = street;
		this.house = house;
		this.flat = flat;
	}
	public void setcity(String city){
            this.city = city;
	}
	String getcity(){
        return city;
	}
	public void setstreet(String street){
        this.street = street;
}
	String getstreet(){
    return street;
}
	public void setcity(int house){
    this.house = house;
}
	int gethouse(){
		return house;
}
	public void setflat(int flat){
	    this.flat = flat;
	}
		int getflat(){
			return flat;
		}

	@Override
	public String toString() {
		return this.city + " " + this.street + " " + this.house + " " + this.flat + " ";
	}
		 public void displayAddress () {
			System.out.println(city + " " + street + " " + house + " " + flat + " ");
		}
	}
