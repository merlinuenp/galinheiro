
package com;


public class Galinheiro {
    
    private Integer ovos; 
    
    
    public Galinheiro(){
        ovos = 0; 
    }
    
    
    public void botar(){
        ovos++;
    }
    
    
    public void retirar(){
        if (ovos > 0){
            ovos--;
        }        
    }
    
//    public void setOvos(Integer ovos){
//        this.ovos = ovos; 
//    }
    
    public Integer getOvos(){
        return ovos; 
    }
    
}
