package org.example.runnable;

public class MyThread  extends  Thread{

  private int id;

  public MyThread(int id){
      this.id = id;
  }

  @Override
  public void run(){
      System.out.println("Hola desde: " +  this);
  }

  @Override
  public String toString(){
      return String.format("My Hilo{id= %d}", id);
  }
}
