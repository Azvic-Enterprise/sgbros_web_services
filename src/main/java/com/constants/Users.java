package main.java.com.constants;

public enum Users {
    INSTALLER("INSTALLER"),
    CONTRACTOR("CONTRACTOR"),
    EVENTTEAM( "EVENT TEAM"),
    SGBROS("SGBROS"),
    SALESMAN("SALESMAN"),
     ;

    private final String text;

    /**
     * @param text
     */
    private Users(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }

}
