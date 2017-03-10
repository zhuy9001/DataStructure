package linkedlist;

/**
 * @Title: linkList.java
 * @Package linkedlist
 * @Description: TODO
 * @author zhuy
 * @date 2016��12��29�� ����10:20:43
 * @version V1.0
 */
public class LinkList {

	public Node head;
	private int index = 0;

	public LinkList() {
		this.head = null;
	}

	// ���һ�����
	public void addFirstNode(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
	}

	// ���ͷ���
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

	// ������λ����ӽ��
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

	// ���ݽ��λ��ɾ��
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

	// ���ݽ��ֵɾ��
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

	// ��ʾ�����еĽڵ���Ϣ
	public void displayAllNodes() {
		Node node = head;
		while (node != null) {
			node.display();
			node = node.next;
		}
		System.out.println();
	}

	// ������������
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
