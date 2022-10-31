class ListObj<D>
{

	D val;
	ListObj<D> next=null;
	
	
	ListObj(){};
	
	ListObj(D n)
	{
		val=n;
		next=null;
	}
	
	ListObj(D n,ListObj<D> ob)
	{
		val=n;
		next=ob;
	}


}
