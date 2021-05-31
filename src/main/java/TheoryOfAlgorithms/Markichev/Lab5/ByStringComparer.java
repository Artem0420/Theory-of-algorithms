/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Markichev.Lab5;

import java.util.Comparator;

/**
 *
 * @author Ruslan
 */
public class ByStringComparer implements Comparator<Model> {
    @Override
    public int compare(Model a, Model b){
      return a.getStringField().compareTo(b.getStringField());
    }
}
