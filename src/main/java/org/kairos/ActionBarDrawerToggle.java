package org.kairos;


import javafx.scene.Node;
import org.kairos.core.Activity;
import org.kairos.layouts.DrawerLayout;

/**
 * Created by Felipe on 03/11/2015.
 */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener{

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawer, Toolbar toolbar){
           toolbar.setOnHomeButtonAction(evt->{
               if(drawer.isDrawerOpened()){
                   drawer.closeDrawer();
               }else{
                   drawer.openDrawer();
               }

           });


    }
    @Override
    public void onDrawerClosed(Node node) {

    }

    @Override
    public void onDrawerOpened(Node node) {

    }
}
