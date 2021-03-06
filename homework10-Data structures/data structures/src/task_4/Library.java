package task_4;

import java.util.ArrayList;
import java.util.TreeMap;

public class Library {
	protected String name;
	protected String adress;
	ArrayList<Book>list=new ArrayList<Book>();
	protected TreeMap<String,ArrayList<Book>>Tmap= new TreeMap<String,ArrayList<Book>>();
	
	public Library(){
		this.name="";
		this.adress="";
		
	}
	public Library(String name, String adress,TreeMap<String,ArrayList<Book>>map){
		super();
		setName(name);
		setAdress(adress);
		setTmap(map);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public TreeMap<String, ArrayList<Book>> getTmap() {
		return Tmap;
	}
	public void setTmap(TreeMap<String, ArrayList<Book>> map) {
		Tmap = map;
	}
	public String toString(){
		return "Library name: "+name+"\nAdress: "+adress+"\nBooks: "+list;
	}
	public void addBook(String name, String autor, int pages){
		Book newBook=new Book(name,autor,pages);
		list.add(newBook);
	}
	public void removeBook(String name){
		for(Book books:list){
			if(books.getName().equals(name)){
				list.remove(books);
			}
		}
	}
	
}
