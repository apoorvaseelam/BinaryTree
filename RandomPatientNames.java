package assignment.binarytree;

public class RandomPatientNames
{
	private String[] patientFirstNames;
	private String[] patientLastNames;	
	
	public RandomPatientNames()
	{
		this.patientFirstNames = new String[] {"priyanka", "Tanya","divya","Tanvi","priya","Riya","Aishwarya","Sneha" ,"Shreya" ,"Gayatri",
				"Vani", "Krithika", "nishi" , "shivani", "anjali" , "shivangi" , "Radhika" , "ishita" , "Anushri" , "Sakshi" , "Katherine",
				"Niharika", "Anusha", "seema" , "Suhani" , "ananya" , "natasha" , "Varsha" , "leah" , "Pavithra" , "binita" , "ria" , "Anisha" ,
				"Urvashi" , "diya" ,"jiffy" ,"Isha" ,"AARUSHI" ,"Gowri" ,"Eli" ,"Gitanjali" ,"Alice" ,"arti" ,"Sonam" ,"Sadaf" ,"Namrata" ,"debbie" ,
				"indhumathi" ,"Sowmya" ,"Mahima" ,"Siya" ,"Ayushi" ,"shrinidhi" ,"Ira" ,"Nishita" ,"vidhya" ,"Rutuja" ,"Lily" ,"Chandralekha" ,"suvi" ,
				"ARCHITA" ,"ANJU" ,"Manasi" ,"Richa" ,"ramya" ,"N.Priyanka" ,"pradeepa" ,"Lish" ,"Anushree" ,"Abigail" ,"colney" ,"simran" ,"sasashy" ,"ishika" ,"jasmine" ,
				"Prachi" ,"krittika","sanjana" ,"deepa" ,"diksha" ,"Mitali" ,"kavya" ,"NISHA" ,"Dilmini" ,"Rishita" ,"moii chhangte" ,"sania" ,"kamalika" ,"Khushi" ,"Nandita" ,
				"manisha" ,"Arya","chanchal" ,"Apoorva" ,"juvina" ,"Arusha" ,"anamika" ,"Lala" ,"geyir" ,"Ina"};
		

this.patientLastNames = new String[] {"Seelam", "Guda", "Subbagari", "Vedere", "Cooper", "Pitt", "Akeneni", "Daggubati", "Litman",
				"Andrew", "Sreepathi",  "Wahl", "Locklair", "Patel", "Harris", "Luther", "Kondala", "Patch", "Karanati", "Konndakindi",
				"Clark", "Rao", "Lewis", "Sharma","Walker", "Tyaganti", "Allen", "Reddy", "Hoppe", "Bommidika", "Wright", "Lopez",
				"Jennifer" ,"Scott", "Yadav", "Adam", "Eve", "Goud", "Peter", "OshKosh", "Carters", "Wynn", "Roy", "Robert", "Velma",
				"Phillips", "Camry", "Michael", "Gaddam", "Vadlamudi", "Gopathi", "Stewart", "Talluri", "Morris", "Rodgers", "Rathi",
				"Walia", "Modi", "Benz","Mercedes", "Thota", "Addanki", "Cooper", "Richard", "Yessangi", "Potter", "Bsetti", "Shetti",
				"Harry","Peter","Kalyan","Margam","Nakka","Bokka","Fleming","Culebra", "Vanga", "Manga", "Wood", "Nobles",
				"Ross","Burlington","Mitta","Yelluri", "Lagishetty","Kasu","Rayapudi","Patterson","Sudhi","Mirza","Khan","Adudodla",
				"Salguti", "Salem", "Habib", "Kamineni", "Baroth", "Nandamuri", "Russel", "Latupali", "Bheem", "Lankala"};
	}
	
	public String FirstName() 
	{
		int index = (int)(Math.random() * 100);
		return this.patientFirstNames[index];
	}
	
	public String LastName()
	{
		int index = (int)(Math.random() * 100);
		return this.patientLastNames[index];
	}
}
