/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_strukturdat;

/**
 *
 * @author User
 */
public class node {
    public node head = null;
    public node tail = null;
   
    public int data;
    public node next;
    
    public node (int d){
      this.data = d;
      this.next = null;
    }
    public void addfirst(int teknik_informatika){
    node newnode = new node (teknik_informatika);
    if (head == null){
        head = newnode;
        tail = newnode;
    }else{
        node isisementara = head;
        head = newnode;
        head.next=isisementara;
    }
    }
    public void addlast(int ti){
        node newnode = new node(ti);
        
        if (head == null){
            head = newnode;
            tail = newnode;
        }else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void delete(int pos){
        if (pos == 0){
            head = head.getnext();
            return;
        }
        node current = head;
        int count = 0;
        while (count < pos-1){
            current = current.getnext();
            if (current == null){
                throw new IndexOutOfBoundsException("ga ketemu");
            }
            count++;
        }
        if (current.getnext()==null){
            throw new IndexOutOfBoundsException("ga ketemu");
        }
        current.setnext(current.getnext().getnext());
    }
    public node(){
        this.getClass();
    }
    public String txt(){
        String output ="";
        node current = head;
        while (current != null){
            output += current.getdata()+",";
            current = current.getnext();
            
        }
        return output;
    }
    public int getdata(){return data;}
    public node getnext(){return next;}
    
    public void setdata(int d){data = d;}
    public void setnext(node nx){next = nx;}
    
    public static void main(String[] args) {
       node nb= new node();
       nb.addfirst(6);
       nb.addfirst(1);
       nb.addfirst(5);
       nb.addfirst(3);
       nb.addfirst(10);
       nb.addfirst(15);
       
        System.out.println(nb.txt());
        
        nb.delete(3);
        System.out.println(nb.txt());
    }
    
}
