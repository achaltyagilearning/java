class LinkList{
	private Node head = null;
	

   public void insert(int data)
   {
	 Node new_node = new Node();
	 new_node.data = data;
	 
	 if(head == null)
	 {
		 head = new_node;
		 new_node.next = null;
	     return;
	 }
	 
	 Node q = head;   	   
    while(q.next != null)
	{
	    	q = q.next;		
	}
	q.next = new_node;
	new_node.next = null;
   
   }
   
   public void printList()
   {
	 Node q = head;
	 System.out.print("[");
     while(q.next != null)
	 {
		System.out.print("\t"+q.data+",");
		q = q.next;		 
	 }		 
   System.out.print("\t"+q.data+"]");	 
	 
   }
      
}