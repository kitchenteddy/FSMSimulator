package union.codebreakers.model;

import union.codebreakers.helper.LabelType;

/**
 * Interface for Label model
 */
public interface Label 
{
    /**
     * Formats label into string
     * @return String representation of this label
     */
    @Override
    public String toString();
        
    /**
     * Sets text for this label
     * @param newName New text for this label
     */
    public void setName(String newName);
       
    /**
     * Gets type of this label
     * @return Type of this label
     */
    public LabelType getType();
}

