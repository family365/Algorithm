package cn.boxian.algorithm.linknode;

public class CircleNode {
	public boolean isCircleNode(LinkNode header) {
		if (header == null) {
			return false;
		}
		
		LinkNode slow = header;
		LinkNode fast = header.getNext();
		while(fast != null && fast.getNext() != null) {
			fast = fast.getNext();
			if (slow == fast) {
				break;
			}
			
			slow = slow.getNext();
			fast = fast.getNext();
		}
		
		if (slow != null && fast!=null && slow == fast) {
			return true;
		}
		
		return false;
	}
	
	public LinkNode getOverlapNode(LinkNode header) {
		if (header == null) {
			return null;
		}
		
		LinkNode slow = header;
		LinkNode fast = header.getNext();
		while(fast != null && fast.getNext() != null) {
			fast = fast.getNext();
			if (slow == fast) {
				break;
			}
			
			slow = slow.getNext();
			fast = fast.getNext();
		}
		
		if (slow != null && fast!=null && slow == fast) {
			return slow;
		}
		
		return null;
	}
	
	public LinkNode getTail(LinkNode head) {
		if (head == null) {
			return null;
		}
		
		while(head.getNext() != null) {
			head = head.getNext();
		}
		
		return head;
	}
	
	public boolean check(LinkNode head1, LinkNode head2) {
		LinkNode circleNode1 = null;
		LinkNode circleNode2 = null;
		boolean isCircle1 = isCircleNode(head1);
		boolean isCircle2 = isCircleNode(head2);
		if (isCircle1 != isCircle2) {
			return false;
		}
		
		if (!isCircle1) {
			LinkNode tail1 = getTail(head1);
			LinkNode tail2 = getTail(head2);
			return tail1 == tail2;
		} else {
			LinkNode temp = circleNode1;
			while (temp != circleNode1) {
				if (temp == circleNode2) {
					return true;
				}
				
				temp = temp.getNext();
			}
			
			return false;
		}
	}
	
	
	
	
}
