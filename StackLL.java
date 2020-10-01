class StackLL<D> implements Stack<D>
{

	Integer size=0;
	ListObj<D> head,tail;

	
	public void push(D p)
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
		try
			{
			
				if(size<=0)
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

		return tail.val;
	}		
	
	public D pop()
	{
		try
			{
			
				if(size<=0)
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
			
		ListObj<D> temp=head;
		ListObj<D> desired=tail;
		
		for(Integer i=1;i<=size-2;i++)
		{
			temp=temp.next;
		}

		tail=temp;
		size--;
	
		return desired.val;
	
	}
	
	}

