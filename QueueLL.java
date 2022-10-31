class QueueLL<D> implements Queue<D>
{

	ListObj<D> head,tail;
	Integer size=0;
	
	public void add(D p)
	{
	
		if(head==null)
		{
			ListObj<D> ob=new ListObj<D>(p);
			head=ob;
			tail=ob;
			size++;
		}
	
		else
		{
			
			ListObj<D> ob=new ListObj<D>(p);
			tail.next=ob;
			tail=ob;	
			size++;
		}	
	
	}
	
	
public D peek()
	{

        if(head==null)
        return null;

        return head.val;

    }
    

    public D remove()
    {

        ListObj<D> temp=head;

			try
			{

                if(head==null)
			   {
				BoundsException ob=new BoundsException();
				throw ob;
			   }
            }

            catch(BoundsException ob)
            {

                ob.printError();
                return null;

            }


        head =head.next ;
        size--;

        return temp.val;

    }

    public void traverse()
	{
	ListObj<D> ob;
		ob=head;
		while (ob!=null)
		{
			System.out.println(ob.val);
			ob=ob.next;
		}
	
    }
    
    public Integer size()
    {

            return size;

    }



}
	


