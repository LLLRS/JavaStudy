package com.chapter3;


//����һ����������ṹ
public class SingleListNode {
    private int data;
    private SingleListNode next;
    
	public SingleListNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SingleListNode getNext() {
		return next;
	}

	public void setNext(SingleListNode next) {
		this.next = next;
	}
	//����һ����������,��������ĳ��ȡ�
	int  ListLength(SingleListNode headNode){
		int length = 0;
		SingleListNode currentNode = headNode;
		while(currentNode!=null){
			length++;
			currentNode = currentNode.getNext();		
		}
		return length;
	}
	//����һ��Ԫ�أ���ͷ����β���в�
	SingleListNode InsertInSingleListNode(SingleListNode headNode,SingleListNode InsertNode,int position){
		if(headNode ==null)
			return InsertNode;
		int size = ListLength(headNode);
		if(position >size+1||position<1)
			System.out.println("����λ�ò���");
		
		if(position==1){  //��ͷ����	
			InsertNode.setNext(headNode);
			return InsertNode;
		}
		else{
			SingleListNode previousNode = headNode;
			int count = 1;
			while(count<position-1){
				previousNode = previousNode.getNext();
				count++;
			}
			SingleListNode currentNode = previousNode.getNext();
			previousNode.setNext(InsertNode);
			InsertNode.setNext(currentNode);
		}
		return headNode;
	}
	//ɾ��һ������
	void deleteList(SingleListNode head){
		SingleListNode tempNode;
		SingleListNode iterator = head;
		while(iterator!=null){
			 tempNode = iterator.getNext();
			 iterator = null;//�Զ�����
			 iterator = tempNode;			
		}
		
	}
	//ɾ��һ���ڵ�
	SingleListNode deleteNode(SingleListNode headNode,int position){
		int size = ListLength(headNode);
		if(position<1||position>size)
			System.out.println("Ҫɾ���Ľڵ㲻���ڣ���");
		
		if(position==1){
			SingleListNode currentNode = headNode.getNext();
			headNode = null;
			return currentNode;
		}
		else{
			SingleListNode previousNode = headNode;
			int count = 1;
			while(count < position-1){
				previousNode = previousNode.getNext();
				count++;
			}
			SingleListNode currentNode = previousNode.getNext();
			previousNode.setNext(currentNode.getNext());
			currentNode = null;
		}
		return headNode;
	}
	
}
