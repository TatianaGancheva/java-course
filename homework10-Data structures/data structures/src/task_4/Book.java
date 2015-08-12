package task_4;

public class Book {
	protected String name;
	protected String autor;
	protected int pages;
	
	public Book(){
		this.name="";
		this.autor="";
		this.pages=0;
	}
	public Book(String name, String autor, int pages){
		super();
		setName(name);
		setAutor(autor);
		setPages(pages);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String toString(){
		return"Title: "+this.name+ ";\nAutor: "+this.autor+";\nPages: "+this.pages;
	}
}
