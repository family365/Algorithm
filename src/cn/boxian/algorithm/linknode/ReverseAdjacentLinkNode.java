package cn.boxian.algorithm.linknode;

public class ReverseAdjacentLinkNode {
	public static LinkNode reverse(LinkNode data) {
		//TODO: 未处理完
		if (data == null) {
			return null;
		}
		
		LinkNode newHead = null;
		LinkNode current = data;
		LinkNode next = data.getNext();
		
		while(next != null) {
			current.setNext(newHead);
			newHead = current;
			current = next;
			next = current.getNext();
		}
		
		current.setNext(newHead);
		newHead = current;
		
		return null;
	}
	
	public static LinkNode reverseAdjacent(LinkNode data) {
		if (data == null) {
			return null;
		}
		
		LinkNode currentNode = data;
		LinkNode previousNode = data;
		LinkNode lastReversedTail = null;
		LinkNode nextNode = null;
		int index = 0;
		
		currentNode = currentNode.getNext();
		while(currentNode != null) {
			index ++;
			nextNode = currentNode.getNext();
			if ((index & 1) == 1) {
				LinkNode temp = previousNode;
				previousNode = currentNode;
				currentNode = temp;
				
				previousNode.setNext(currentNode);
				currentNode.setNext(nextNode);
			}
			
			if (index == 1) {
				data = previousNode;
			}
			
			if (lastReversedTail == null) {
				lastReversedTail = currentNode;
			} else {
				lastReversedTail.setNext(previousNode);
			}
			
			currentNode = nextNode;
			previousNode = currentNode;
			if (currentNode == null) {
				break;
			}
			currentNode = currentNode.getNext();
		}
		
		return data;
	}
	
	//k链表翻转：给出一个链表和一个数k, 比如链表1->2->3->4->5->6, k=2, 则翻转后为2->1-4->3->6->5
	//若k=3， 翻转后为3->2->1->6->5->4
	//若k=4， 翻转后4->3->2->1->5->6
	public static LinkNode reverseK(LinkNode data, int k) {
		int length = getLength(data);
		if (length < k) {
			return data;
		}
		
		LinkNode tailCurrent = null;
		LinkNode tailLast = null;
		LinkNode newHead = null;
		LinkNode previous = null;
		LinkNode next = null;
		
		for (int index = 0; index < length / k; index ++) {
			tailCurrent = data;
			for (int i = 0; i < k; i++) {
				next= data.getNext();
				data.setNext(previous);
				previous = data;
				data = next;
			}
			
			tailCurrent.setNext(data);
			if (data == null) {
				data = previous;
			}
			
			if (tailLast != null) {
				tailLast.setNext(previous);
			}
			
			tailLast = tailCurrent;
		}
		
		if (data != null) {
			tailLast.setNext(data);
		}
		
		return data;
	}
	
	
	private static int getLength(LinkNode data) {
		if (data == null) {
			return 0;
		}
		
		int length = 1;
		while (data.getNext() != null) {
			length ++;
		}
		
		return length;
	}
}
