public static void deleteNode(ListNode head,ListNode d)
	{
		if(head == null || d == null)
			return;
		if(d.next != null)
		{
			ListNode p = d.next;
			d.val = p.val;
			d.next = p.next;
		}
		else if(head == d)
		{
			head = null;
		}
		else
		{
			ListNode tail = head;
			while(tail.next.next != null)
			{
				tail = tail.next;
			}
			tail.next = null;
		}
	}
