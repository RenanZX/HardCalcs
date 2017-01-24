
package hardcalcs;

public class LineClass {
    float x = 0,y = 0,w = 0,z = 0;
    
    public void ZerarLinha(){
        x = 0;
        y = 0;
        w = 0;
        z = 0;
    }
    
    public void CopyLine(LineClass l){
        this.x = l.x;
        this.y = l.y;
        this.w = l.w;
        this.z = l.z;
    }
    
    public void SumLines(LineClass l){
        this.x += l.x;
        this.y += l.y;
        this.w += l.w;
        this.z += l.z;
    }
    
    public void MultSumLines(LineClass l,float n){
        this.x += n*l.x;
        this.y += n*l.y;
        this.w += n*l.w;
        this.z += n*l.z;
    }
    
    public void MultSumLines(LineClass l,int n){
        this.x += n*l.x;
        this.y += n*l.y;
        this.w += n*l.w;
        this.z += n*l.z;
    }
    
    public void MultLines(float n){
        this.x *= n;
        this.y *= n;
        this.w *= n;
        this.z *= n;
    }
    
    public void MultLines(int n){
        this.x *= n;
        this.y *= n;
        this.w *= n;
        this.z *= n;
    }
    
    public void DivideFirstToLast(){
        if((z!=0)&&(x!=0)){
            z = z/x;
            x = x/x;
        }
    }
    
    public void DivideSecondToLast(){
        if((z!=0)&&(y!=0)){
            z = z/y;
            y = y/y;
        }
    }
    
    public void DivideThirdToLast(){
        if((z!=0)&&(w!=0)){
            z = z/w;
            w = w/w;
        }
    }
    
    public void Printlinha(){
        System.out.println("x = "+x+" y = "+y+" w = "+w+" z = "+z);
    }
}
