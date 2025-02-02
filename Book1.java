public class Book1 {
    	private String title;
    	private String author;
    	private double price;
    	private boolean isAvailable;
    	public Book1() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.isAvailable = true;
}
    	public Book1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
}
    	public String getTitle() {
        return title;
}
    	public void setTitle(String title) {
        this.title = title;
}
    	public String getAuthor() {
        return author;
}
    	public void setAuthor(String author) {
        this.author = author;
}
    	public double getPrice() {
        return price;
}
    	public void setPrice(double price) {
        this.price = price;
}
    	public boolean isAvailable() {
        return isAvailable;
}
    	public void borrowBook() {
        if (isAvailable) {
        isAvailable = false;
        System.out.println("Book borrowed successfully.");
}else {
        System.out.println("Book is not available.");
}
}
}

