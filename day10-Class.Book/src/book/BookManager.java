package book;

/**
 * 책장(BookShelf)을 사용하는 북매니저를 나타내는 클래스 
 * -----------------------------------------------------------------
 * 서점의 북매니저는 
 * 
 * 1. 책을 책장에 꽂거나 (추가하거나)
 * 2. 책장에서 찾아달라고 부탁받은 책을 가지고 오거나 
 * 3. 어떤 책의 수량이나 가격 정보를 수정하거나 
 * 4. 더 이상 판매하지 않을 책을 폐기 하고 
 * 5. 이 서점에서 파는 책 목록을 안내 
 * 
 * 하는 등의 작업을 진행
 * ------------------------------------------------------------------
 * 전제 조건 : 북 매니저는 책장이 어디있는지, 무엇인지 
 * 알고 있어야 한다.
 * ------------------------------------------------------------------ 
 * 
 * @author Administrator
 *
 */
//객체지향은 현실에서 일어나는 일을 구성
public class BookManager {
	//1. 멤버변수 선언부 
	BookShelf bookShelf;//책을 알필요 x 책장만 알면 된다. 
	
	//2. 생성자 선언부 
	// (1) 기본 생성자 명시 
	BookManager() {
		bookShelf = new BookShelf();//내가 모든 것을 처음부터 직접 만들겠다(이것이 매니저의 역할인가?)
		//객체지향에서는 최대한 new를 하지 않는 것을 권장 
	}
	
	// (2) 매개변수 생성자 작성 
	BookManager(BookShelf bookShelf) {
		this.bookShelf = bookShelf;//누가 만든 것을 사용하겠다.(현실적)
	}
	
	//3. 메소드 선언 
	// (1) 매니저는 책 한권을 책장에 가져가서 
    // 	 새로 꽂을 수 있다.
	public void add(Book book) {
		this.bookShelf.add(book);
	}
	// (2) 매니저는 책장에 가서 더 이상 팔지 않을 
	//		  폐기할 책을 제거할 수 있다.
	public void remove(Book book) {
		this.bookShelf.remove(book);
	}
	
	// (3)매니저는 책장에서 찾아달라고 고객이 요청한 
	//		책 한개를 가지고 올 수 있다. 
	public Book get(Book book) {
		return this.bookShelf.get(book);
	}
	
	// (4) 매니저는 책장에 가서 판매 가격 등 
	//		  책의 정보를 수정할 수 있다. 
	public void set(Book book) {
		this.bookShelf.set(book);
	}
	
	// (5) 
	public Book[] getAllBooks() {
		return bookShelf.getAllBooks();
	}
}
