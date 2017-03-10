package linkedlist;

/**
 * @Title: linkList.java
 * @Package linkedlist
 * @Description: TODO
 * @author zhuy
 * @date 2016年12月29日 上午10:20:43
 * @version V1.0
 */
public class LinkList {

	public Node head;
	private int index = 0;

	public LinkList() {
		this.head = null;
	}

	// 添加一个结点
	public void addFirstNode(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
	}

	// 添加头结点
	public void addFirstNode(Node node) {
		if (node == null)
			return;
		node.next = head;
		head = node;
	}

	public Node deleteFirstNode() {
		Node node = head;
		head = node.next;
		return node;
	}

	// 在任意位置添加结点
	public void add(int i, int data) {
		Node node = new Node(data);
		Node current = head;
		Node previous = head;
		while (index != i) {
			previous = current;
			current = current.next;
			index++;
		}
		previous.next = node;
		node.next = current;
		index = 0;
	}

	// 根据结点位置删除
	public Node delete(int ind) {
		Node current = head;
		Node previous = head;
		while (ind != index) {
			index++;
			previous = current;
			current = current.next;
		}
		if (current == head) {
			head = head.next;
		} else {
			index = 0;
			previous.next = current.next;
		}

		return current;
	}

	// 根据结点值删除
	public Node deleteForVelue(int value) {
		Node current = head;
		Node previous = head;
		while (current.value != value) {
			if (current.next == null) {
				return null;
			}
			previous = current;
			current = current.next;
		}
		if (current == head) {
			head = head.next;
		} else {
			previous.next = current.next;
		}

		return current;
	}

	// 显示出所有的节点信息
	public void displayAllNodes() {
		Node node = head;
		while (node != null) {
			node.display();
			node = node.next;
		}
		System.out.println();
	}

	// 根据索引查找
	public Node findByIndex(int ind) {
		Node node = head;
		while (index != ind) {
			node = node.next;
			if (node == null) {
				return null;
			}
			index++;
		}
		return node.next;
	}

	class Node {
		public Node next;
		public int value;

		public Node(int value) {
			this.value = value;
		}

		public void display() {
			System.out.print(this.value + "-");
		}
	}
}
