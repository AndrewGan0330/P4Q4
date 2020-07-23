/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical4_q4;

/**
 *
 * @author mengf
 */
public class Owner {
      private String name;
    private String ic_Number;
    
    public Owner(String name, String ic_Number){
    this.name = name;
    this.ic_Number = ic_Number;
}
  public String toString(){
      return String.format ("%-15s %s", name, ic_Number);
}
}
