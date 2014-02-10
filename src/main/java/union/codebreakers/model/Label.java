package union.codebreakers.model;


import java.awt.Point;
import union.codebreakers.helper.LabelType;


public interface Label 
{
    @Override
    public String toString();
        
    public void setName(String newName);
       
    public LabelType getType();
}

