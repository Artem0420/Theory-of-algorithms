/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Markichev.Lab5;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Lab5_2 {
    private int modelsNumber;
    public LinkedList<Model> list;
    
    public Lab5_2(int modelsNumber)
    {
        this.modelsNumber = modelsNumber;
        list = new LinkedList<Model>();
    }
    
    public void InitList()
    {
        Random rd = new Random();
        list.clear();
        byte[] arr = new byte[modelsNumber];
        rd.nextBytes(arr);
        for (int i = 0; i < modelsNumber; i++)
            list.add(new Model("model #" + i, arr[i]));
    }
    
    public String DisplayList()
    {
        String s = "";
        Iterator<Model> itr = list.iterator();
        for (int i = 0; itr.hasNext(); i++) {
            s += i + ". " + itr.next() + "<br/>";
        }
        return s;
    }
    
    public static int binarySearchByte(List<Model> list,
        Byte x, int l, int r)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            if (list.get(mid).getByteField().equals(x))
                return mid;
 
            if (list.get(mid).getByteField().compareTo(x) > 0)
                return binarySearchByte(list, x, l, mid - 1);
 
            return binarySearchByte(list, x, mid + 1, r);
        }
 
        return -1;
    }
    
    public static int binarySearchString(List<Model> list,
        String x, int l, int r)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            if (list.get(mid).getStringField().equals(x))
                return mid;
 
            if (list.get(mid).getStringField().compareTo(x) > 0)
                return binarySearchString(list, x, l, mid - 1);
 
            return binarySearchString(list, x, mid + 1, r);
        }
 
        return -1;
    }
    
    public int IndexOf(String find)
    {
        int n = list.size();
        return binarySearchString(list, find, 0, n - 1);
    }
    
    public void SortByStringField()
    {
        int n = list.size(); 
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (list.get(j).getStringField().compareTo(list.get(j + 1).getStringField())  > 0) { 
                    Model temp = list.get(j); 
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
    
    public void SortByByteField()
    {
        int n = list.size(); 
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (Byte.compare(list.get(j).getByteField(), list.get(j + 1).getByteField()) > 0) { 
                    Model temp = list.get(j); 
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
