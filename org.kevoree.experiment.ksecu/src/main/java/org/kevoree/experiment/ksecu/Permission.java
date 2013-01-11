package org.kevoree.experiment.ksecu;

import org.kevoree.AdaptationPrimitiveType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jed
 * Date: 09/01/13
 * Time: 14:58
 * To change this template use File | Settings | File Templates.
 */
public class Permission {

    private List<Operation> permission = new ArrayList<Operation>();

    public List<Operation> getPermissions() {
        return permission;
    }

    public void accept(Operation o){
        permission.add(o);
    }


    public boolean  checkPermission(java.util.List<org.kevoree.AdaptationPrimitiveType> list){

        for( AdaptationPrimitiveType adapation :  list)
        {
           boolean  found = false;

            for(Object p : permission.toArray()){

                if(p.toString().equals(adapation.getName())){

                    found = true;
                    break;
                }

            }
            if(!found){
                System.err.println("Refused --> "+adapation.getName());
                return false;
            }

        }

        return true;
    }
}


