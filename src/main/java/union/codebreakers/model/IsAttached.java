package union.codebreakers.model;

/**
 * This interface represents elements which can have label
 */
interface IsAttached {
 
    /**
     * Returns parents it is attached to
     * @return instance of the parent
     */
    public AutomatonPart getParent();

    /**
     * Sets parents it is attached to
     * @param newParent Instane of the parent
     */
    public void setParent( AutomatonPart newParent );
}
