    // Analogous of LOC
class Snake {
    private int hx=0, hy=0;
    private int tx =0, ty=0;
    
    // { x,y : 0 =< x,y < 55 }
    protected boolean hori = false, faced = false;
    
    
    Snake() {
    }

    protected boolean getHori() {
	return this.hori ;
    }

    protected boolean getFaced() {
	return this. faced ;
    }
    
    protected int initHeadx(int s) {
	if(s==1) {
	    this.hori = true;
	    this.faced = true;
	    this.hx = 18;
	    return hx;
	}
	else if(s==2) {
	    this.hori = true;
	    this. faced = false;
	    this.hx = 36;
	    return hx;
	}
	else
	    return 0;
    }

    protected int initTailx(int s) {
	if(s==1) {
	     this.hori = true;
	    this.faced = true;
	    this.hx = 18;
	    this.tx = 17;
	    return tx;
	}
	else if(s==2) {
	    this.hori = true;
	    this. faced = false;
	    this.hx = 36;
	    this.tx = 37;
	    return tx;
	}
	else
	    return 0;
    }

    protected int initHeady(int s) {
	if(s==1) {
	    this.hori = true;
	    this.faced = true;
	    this.hy = 18;
	    return hy;
	}
	else if(s==2) {
	    this.hori = true;
	    this.faced = false;
	    this.hy= 36;
	    return hy;
	}
	else
	    return 0;
    }

    protected int initTaily(int s) {
	if(s==1) {
	    this.hori = true;
	    this.faced = true;
	    this.hx = 18;
	    this.ty = 18;
	    return ty;
	}
	else if(s==2) {
	    this.hori = true;
	    this. faced = false;
	    this.hx = 36;
	    this.ty = 36;
	    return ty;
	}
	else
	    return 0;
    }

    //  Left
    protected void goLeft() {
	if(this.faced) {
	    
	    if(this.hori) {
		this.faced = true;
		this.hori = true;
	    }
	    else {
		this.hx = this.hx -1;
		this.hy = this.hy;
		this.tx = this.tx;
		this.ty = this.ty+1;
		this.faced = false;
		this.hori = true;
	    }
	}

	else {
		if(this.hori) {
		    this.hx = this.hx -1;
		    this.hy = this.hy;
		    this.tx = this.tx -1;
		    this.ty = this.ty;
		    this.faced = false;
		    this.hori = true;
		}
		else {
		    this.hx = this.hx -1;
		    this.hy = this.hy;
		    this.tx = this.tx;
		    this.ty = this.ty-1;
		    this.faced = false;
		    this.hori = true;
		}
	}
		
    }
    
    // Right 
     protected void goRight() {
	 if(this.faced) {
	    
	    if(this.hori) {
		this.hx = this.hx+1;
		this.hy = this.hy;
		this.tx = this.tx+1;
		this.ty = this.ty;
		this.faced = true;
		this.hori = true;
	    }
	    else {
		this.hx = this.hx+1;
		this.hy = this.hy;
		this.tx = this.tx;
		this.ty = this.ty+1;
		this.faced = true;
		this.hori = true;
	    }
	}

	 else {
	     if(this.hori) {
		 this.faced = false;
		 this.hori = true;
		   
	     }
	     else {
		 this.hx = this.hx+1;
		 this.hy = this.hy;
		 this.tx = this.tx;
		 this.ty = this.ty-1;
		 this.faced = true;
		 this.hori = true;
	     }
	 }

		
     }
    
    // Up 
    protected void goUp() {
	if(this.faced) {
	    
	    if(this.hori) {
		this.hx = this.hx;
		this.hy = this.hy-1;
		this.tx = this.tx+1;
		this.ty = this.ty;
		this.faced = false;
		this.hori = false;
	    }
	    else {
		this.faced = true;
		this.hori = false;
		
	    }
	}

	else {
	    if(this.hori) {
		this.hx = this.hx;
		this.hy = this.hy-1;
		this.tx = this.tx-1;
		this.ty = this.ty;
		this.faced = false;
		this.hori = false;
	    }
	    else {
		this.hx = this.hx;
		this.hy = this.hy-1;
		this.tx = this.tx;
		this.ty = this.ty-1;
		this.faced = false;
		this.hori = false;
	    }
	}
	
    }
    
    // Down 
    protected void goDown() {
	if(this.faced) {
	    
	    if(this.hori) {
		this.hx = this.hx;
		this.hy = this.hy+1;
		this.tx = this.tx+1;
		this.ty = this.ty;
		this.faced = true;
		this.hori = false;
	    }
	    else {
		this.hx = this.hx;
		this.hy = this.hy+1;
		this.tx = this.tx;
		this.ty = this.ty+1;
		this.faced = true;
		this.hori = false;
	    }
	}

	else {
	    if(this.hori) {
		this.hx = this.hx;
		this.hy = this.hy+1;
		this.tx = this.tx-1;
		this.ty = this.ty;
		this.faced = true;
		this.hori = false;
	    }
	    else {
		this.faced = false;
		this.hori = false;
		   
	    }
	}
	
    }
    
    // Find current loc
    protected int getHeadx() {
	return this.hx;
    }

    protected int getHeady() {
	return this.hy;
    }

    protected int getTailx() {
	return this.tx;
    }

    protected int getTaily() {
	return this.ty;
    }

    // End of Snake Class
}
