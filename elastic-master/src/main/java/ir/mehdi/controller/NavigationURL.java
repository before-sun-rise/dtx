package ir.mehdi.controller;

/**
 * @author Mehdi Afsari kashi
 * @version 1.0.0
 * @since 1.0.0
 * <p/>
 * Creation Date : 2015/04/25
 */
public enum NavigationURL {

    LIST_PAGE(""),
    ADD_PAGE(""),
    UPDATE_PAGE("");


    private String relativePath;
    private NavigationURL(String relativePath){
        this.relativePath = relativePath;
    }


    public String url() {
        return relativePath;
    }
}
