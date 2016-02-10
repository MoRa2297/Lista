import java.awt.Container;

public class Lista {
	
	private Nodo head;
	
	public Lista(){
		head=null;
	}
	

public String toString(){
	String s="";
	for(Nodo p = head;p!=null;p = p.getLink()){
		s= s + " - " + p.getInfo();
	}
	return s;
}



	
/*public int Conta(){
		
	int c=0;
	Nodo p=head;
	
	while(p!=null){
			
		c++;
		p=p.getLink();
			
	}
	return c;
}*/

public int conta(){
	int c = 0;
	for(Nodo p = head;p!=null;p = p.getLink()){
		c++;
	}
	return c;
}


/*public boolean cerca(int x){
	boolean flag=false;
	Nodo p = head;
	while(p!=null){
		if(p.getLink()==x){
			flag=true;
		}
		p=p.getLink();
	}
	return flag;
}*/

public boolean cerca(int x){
	boolean flag = false;
	for(Nodo p = head;p!=null;p = p.getLink()){
		if(p.getInfo()==x){
			flag = true;
		}
	}
	return flag;
}

public void inserisciInTesta(int x){
	Nodo p = new Nodo();
	p.setInfo(x);
	p.setLink(head);
	head=p;
}

/*public void inserisciInCoda(int x){
	Nodo p;
	Nodo pn = new Nodo(x,null);
	if(head==null){
		head=pn;
	}else{
		for(p=head;p.getLink()!=null;p=p.getLink());
		p.setLink(pn);
	}
}*/

public void InserisciInCoda(int x){
	Nodo pn = new Nodo(x,null);
	if(head == null){
		head = pn;
	}else{
     Nodo p = head;
     while(p.getLink()!=null){
    	 p = p.getLink();
     }
     p.setLink(pn);
	}
}

public void eliminaInTesta(){
	Nodo p = head;
	if(head == null){
		return;
	}else{
		head = p.getLink();
	}
}

public void eliminaInCoda(){
	if(head == null){
		return ;
	}else{
		if(conta()==1){//lista di un nodo
			head = null;
		}else{
			/*Nodo p = head;
			while(p.getLink().getLink()!=null){
				p = p.getLink();
			}*/
			int n = conta();
			Nodo p = head;
			for(int i = 0; i < n-2; i++){
				p = p.getLink();
			}
			p.setLink(null);
		}

	}
}

public void inserisciInPos(int x, int pos){
	Nodo p = head;
	Nodo pn= new Nodo(x,null);
	int i=0;
	if(pos<=1 || head==null) inserisciInTesta(x);
	else if(pos>conta()){
			InserisciInCoda(x);
		}else{
			while(i<pos-1){
				p=p.getLink();
				i++;
			}
			pn.setLink(p.getLink());
			p.setLink(pn);
		}
}

public void eliminaDaPos(int pos){
	Nodo pp, ps;
	if(pos==1) eliminaInTesta();
	if(pos==conta()) eliminaInCoda();
	else 
}

}