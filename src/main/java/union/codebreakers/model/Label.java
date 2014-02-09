package union.codebreakers.model;

import union.codebreakers.helper.LabelType;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public interface Label 
{
    @Override
    public String toString();
        
    public void setName(String newName);
       
    public LabelType getType();
}

