/**
 *
 *  Basic holder for an email. You can assume an email is properly / safely formatted.
 *
 * @author Alex Babou <br>
 *         ababou@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Email {
    private String email;
    private String type; // options Home, Office, Other

    /** returns the email address **/
    public String getEmail() {
        return email;
    }

    /** sets the email address. No checks for valid emails**/
    public void setEmail(String email) {
        this.email = email;
    }

    /** gets the type of email **/
    public String getType() {
        return type;
    }

    /** sets the type**/
    public void setType(String type) {
        this.type = type;
    }

    /** gets the client name  E-name. This is the name before the @ in an email **/
    public String getEName() {
       return email.substring(0, email.indexOf('@'));
    }

    /** gets the domain of the email. This is the part after the @ in an email **/
    public String getDomain() {
        return email.substring(email.indexOf('@') + 1);
    }

    /** renders the email as Type:  email - with 7 padding on the type **/
    public String render() {
        return String.format("%-8s", getType() + ":") + getEmail();
    }

    /**
     * Basic constructor
     * @param type the type of email (home, work, etc)
     * @param email the email address
     */
    public Email(String type, String email) {
        setEmail(email);
        setType(type);
    }


}
