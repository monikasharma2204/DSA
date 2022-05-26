package Graph;

import java.util.ArrayList;

public class GraphPriorty {

  public static class Pq {

    ArrayList<Integer> arr;

    public void pq() {
      arr = new ArrayList<>();
    }

    public void add(int val) {
      arr.add(val);
      upheapify(arr.size() - 1);
    }

    public void upheapify(int i) {
      if (i == 0) {
        return;
      }
      int pi = (i - 1) / 2;
      if (arr.get(i) < arr.get(pi)) {
        swap(i, pi);
        upheapify(pi);
      }
    }

    public void swap(int i, int j) {
      int ivalue = arr.get(i);
      int jvalue = arr.get(j);
      arr.set(i, jvalue);
      arr.set(j, ivalue);
    }

    public void remove() {
      if (this.size() == 0) {
        System.out.println(" ds is empty !!!!");
        return;
      }
      swap(0, arr.size() - 1);
      arr.remove(arr.size() - 1);
      downheapify(0);
    }

    public void downheapify(int i) {
      if (i >= arr.size()) return;
      int min = 0;
      int li = 2 * i + 1;
      int ri = 2 * i + 2;
      if (li < arr.size() && arr.get(li) < arr.get(min)) {
        min = ri;
      }
      if (arr.get(min) < arr.get(i)) {
        swap(i, min);
        upheapify(min);
      }
    }

    public int peek() {
      if (this.size() == 0) {
        System.out.println(" ds is empty!!!");
        return -1;
      }
      return arr.get(0);
    }

    public int size() {
      return arr.size();
    }
  }

  public static void main(String[] args) {
    Pq p1 = new Pq();
    Pq p2 = new Pq();
    p2.add(3);
    System.out.println(p2.peek());
    p1.peek();
  }
}