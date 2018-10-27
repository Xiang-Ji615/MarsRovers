package main.java.mars.rovers.model;

public class DirectionModel {

	char val;
	DirectionModel prev;
	DirectionModel next;

	public DirectionModel(char val) {
		super();
		this.val = val;
	}

	public char getVal() {
		return val;
	}

	public void setVal(char val) {
		this.val = val;
	}

	public DirectionModel getPrev() {
		return prev;
	}

	public void setPrev(DirectionModel prev) {
		this.prev = prev;
	}

	public DirectionModel getNext() {
		return next;
	}

	public void setNext(DirectionModel next) {
		this.next = next;
	}

}
