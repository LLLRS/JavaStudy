package com.chapter3;


//定义一个单向链表结构
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
	//遍历一个单向链表,返回链表的长度。
	int  ListLength(SingleListNode headNode){
		int length = 0;
		SingleListNode currentNode = headNode;
		while(currentNode!=null){
			length++;
			currentNode = currentNode.getNext();		
		}
		return length;
	}
	//插入一个元素：表头，表尾，中部
	SingleListNode InsertInSingleListNode(SingleListNode headNode,SingleListNode InsertNode,int position){
		if(headNode ==null)
			return InsertNode;
		int size = ListLength(headNode);
		if(position >size+1||position<1)
			System.out.println("插入位置不对");
		
		if(position==1){  //表头插入	
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
	//删除一个链表
	void deleteList(SingleListNode head){
		SingleListNode tempNode;
		SingleListNode iterator = head;
		while(iterator!=null){
			 tempNode = iterator.getNext();
			 iterator = null;//自动回收
			 iterator = tempNode;			
		}
		
	}
	//删除一个节点
	SingleListNode deleteNode(SingleListNode headNode,int position){
		int size = ListLength(headNode);
		if(position<1||position>size)
			System.out.println("要删除的节点不存在！！");
		
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
