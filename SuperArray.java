puclic class SuperArray{
  private int size=0;
  private String[] data;

  public SuperArray(){
    data = new String[];
  }

  public void clear(){
    size=0;
  }

  public int size(){
    return size;
  }

  public boolean isEmpty()}{
    return size ==0;
  }

  public boolean add(String str){
    data[size()] = str;
    size++;
  }

  public String toString(){
    String out = "{";
    for(int i =0; i < size()-1; i+=){
      out += data[i]
      if (i != size()-1) out +=  ",";
    }
    return out;
  }

}
