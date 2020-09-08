import java.util.*;
public class labs11{
	Scanner scan = new Scanner (System.in);

	ArrayList<String> name = new ArrayList<>();
	ArrayList<String> gender = new ArrayList<>();
	ArrayList<String> address = new ArrayList<>();
	ArrayList <Integer> age = new ArrayList<>();
	ArrayList<String> initial = new ArrayList<>();

	String nama;
	String jenis;
	String alamat;
	int umur;
	String inisial;
	int delete;

	public void input(){
		do{
			System.out.println("Input candidate's name: ");
			nama = scan.nextLine();
		}while(!nama.contains(" ")|| nama.length()<5 ||nama.length()>20);

			name.add(nama);


		do{
			System.out.println("Input Candidate's gender [male|female]: ");
			jenis = scan.nextLine();
		}while(!jenis.equalsIgnoreCase("Male")&&!jenis.equalsIgnoreCase("Female"));

			gender.add(jenis);


		do{
			System.out.println("Input candidate's address [must be ended with 'street']: ");
			alamat = scan.nextLine();
		}while(!alamat.endsWith("street"));

			address.add(alamat);


		do{
			System.out.println("Input Candidate age[17..30]: ");
			umur = scan.nextInt(); scan.nextLine();
		}while(umur<17||umur>30);
			age.add(umur);

			inisial = nama.charAt(0) + "" + nama.charAt(nama.indexOf(" ")+1);
			initial.add(inisial);

		System.out.println("Thank You for Registering! your initial is " + inisial);
		}

	public void view(){
		if (name.isEmpty()){
			System.out.println("No Data !");
		}else{
			for(int i =0; i<name.size(); i++){
				System.out.println("No: " + (i + 1));
				System.out.println("Name: " + name.get(i));
				System.out.println("Initial: " + initial.get(i));
				System.out.println("Gender: " + gender.get(i));
				System.out.println("Age: " + age.get(i));
				System.out.println("Address " + address.get(i));
				}

			}

		}

	public void remove(){
		if(name.isEmpty()){
			System.out.println("No Data!");
		}else{
			for(int i=0; i<name.size(); i++){
				System.out.println("No: " + (i + 1));
				System.out.println("Name: " + name.get(i));
				System.out.println("Initial: " + initial.get(i));
				System.out.println("Gender: " + gender.get(i));
				System.out.println("Age: " + age.get(i));
				System.out.println("Address " + address.get(i));
				}

			do{
				System.out.println("Input candidate to be removed [1..2] [0 for cancel] :  ");
				delete = scan.nextInt(); scan.nextLine();
			}while(delete>name.size());

			if(delete==0){
					System.out.println("Canceled");
			}else{
				name.remove(delete-1);
				gender.remove(delete-1);
				address.remove(delete-1);
				age.remove(delete-1);
				}
			}
		}




	public labs11(){
		int choose;
		do{
			System.out.println("Power Recruitment");
			System.out.println("1. Input New candidate");
			System.out.println("2. View Candidate's data");
			System.out.println("3. Remove Candidate");
			System.out.println("4. Exit");
			System.out.println("Choose : ");
			choose = scan.nextInt(); scan.nextLine();

			switch (choose){

				case 1 :
						input();
						break;

				case 2 :
						view();
						break;

				case 3 :
						remove();
						break;

				}
		}while(choose!=4);



		}









	public static void main (String[] args){
		new labs11();



		}

	}